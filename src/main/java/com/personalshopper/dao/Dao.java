package com.personalshopper.dao;

import static com.personalshopper.jooq.tables.ArticleShop.ARTICLE_SHOP;
import static com.personalshopper.jooq.tables.Articles.ARTICLES;
import static com.personalshopper.jooq.tables.Shops.SHOPS;

import java.util.List;

import javax.sql.DataSource;

import org.jooq.DSLContext;

import com.google.inject.Inject;
import com.personalshopper.jooq.enums.ArticlesType;
import com.personalshopper.jooq.tables.pojos.Articles;
import com.personalshopper.jooq.tables.pojos.Shops;

/**
 * This class contains the methods to access the databases and run the queries
 * of the articles.
 * 
 * @author Ignacio Mulas
 * 
 */
public class Dao extends JooqDao {

	/**
	 * Default constructor
	 * 
	 * @param dataSource
	 */
	@Inject
	public Dao(DataSource dataSource) {
		super(dataSource);
	}

	/**
	 * Creates a new Article in a shop
	 * 
	 * @param type
	 * @param model
	 * @param size
	 * @param colour
	 * @param brand
	 * @param price
	 * @param shop
	 */
	public void createArticle(ArticlesType type, String model, String size, String colour, String brand, double price,
			long shopId) {
		DSLContext context = getDbContext();
		long articleId = context
				.insertInto(ARTICLES, ARTICLES.TYPE, ARTICLES.MODEL, ARTICLES.SIZE, ARTICLES.COLOUR, ARTICLES.BRAND,
						ARTICLES.PRICE).values(type, model, size, colour, brand, price).returning(ARTICLES.ARTICLE_ID)
				.fetchOne().getValue(ARTICLES.ARTICLE_ID);
		context.insertInto(ARTICLE_SHOP, ARTICLE_SHOP.ARTICLE_ID, ARTICLE_SHOP.SHOP_ID).values(articleId, shopId)
				.execute();
	}

	/**
	 * Creates a new shop
	 * 
	 * @param name
	 * @param email
	 * @param latitude
	 * @param longitude
	 * @param address
	 * @param schedule
	 */
	public void createShop(String name, String email, double latitude, double longitude, String address, String schedule) {
		getDbContext().insertInto(SHOPS, SHOPS.NAME, SHOPS.EMAIL, SHOPS.LATITUD, SHOPS.LONGITUD, SHOPS.ADDRESS,
				SHOPS.SCHEDULE).values(name, email, latitude, longitude, address, schedule);
	}

	/**
	 * Fetches all articles in the database
	 * 
	 * @return
	 */
	public List<Articles> fetchAllArticles() {
		return getDbContext().select().from(ARTICLES).fetchInto(Articles.class);
	}

	/**
	 * Fetch Articles by location
	 * 
	 * @param latitude
	 * @param longitude
	 * @param radius
	 * @return
	 */
	public List<Articles> fetchArticlesByZone(float latitude, float longitude, float radius) {
		DSLContext context = getDbContext();
		return context
				.select()
				.from(ARTICLES.leftOuterJoin(SHOPS.join(ARTICLE_SHOP).on(ARTICLE_SHOP.SHOP_ID.equal(SHOPS.SHOP_ID)))
						.on(ARTICLE_SHOP.ARTICLE_ID.equal(ARTICLES.ARTICLE_ID)))
				.where(ARTICLE_SHOP.SHOP_ID.equal(context.select(SHOPS.SHOP_ID).from(SHOPS)
						.where(SHOPS.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
						.and(SHOPS.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))))
				.fetchInto(Articles.class);
	}

	/**
	 * Fetches shop information
	 * 
	 * @param shopId
	 * @return
	 */
	public Shops fetchShopById(long shopId) {
		return getDbContext().select().from(SHOPS).where(SHOPS.SHOP_ID.equal(shopId)).fetchAny().into(Shops.class);
	}

	/**
	 * Fetches all shops in a zone
	 * 
	 * @param latitude
	 * @param longitude
	 * @param radius
	 * @return
	 */
	public List<Shops> fetchShopsByZone(float latitude, float longitude, float radius) {
		return getDbContext().select().from(SHOPS)
				.where(SHOPS.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
				.and(SHOPS.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))
				.fetchInto(Shops.class);
	}
}
