package com.personalshopper.dao;

import static com.personalshopper.jooq.tables.Article.ARTICLE;
import static com.personalshopper.jooq.tables.ArticleShop.ARTICLE_SHOP;
import static com.personalshopper.jooq.tables.Shop.SHOP;

import java.util.List;

import javax.sql.DataSource;

import org.jooq.DSLContext;

import com.google.inject.Inject;
import com.personalshopper.jooq.enums.ArticleType;
import com.personalshopper.jooq.tables.pojos.Article;
import com.personalshopper.jooq.tables.pojos.Shop;

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
	public void createArticle(ArticleType type, String model, String size, String colour, String brand, double price,
			long shopId) {
		DSLContext context = getDbContext();
		long articleId = context
				.insertInto(ARTICLE, ARTICLE.TYPE, ARTICLE.MODEL, ARTICLE.SIZE, ARTICLE.COLOUR, ARTICLE.BRAND,
						ARTICLE.PRICE).values(type, model, size, colour, brand, price).returning(ARTICLE.ARTICLE_ID)
				.fetchOne().getValue(ARTICLE.ARTICLE_ID);
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
		getDbContext()
				.insertInto(SHOP, SHOP.NAME, SHOP.EMAIL, SHOP.LATITUD, SHOP.LONGITUD, SHOP.ADDRESS, SHOP.SCHEDULE)
				.values(name, email, latitude, longitude, address, schedule);
	}

	/**
	 * Fetches all articles in the database
	 * 
	 * @return
	 */
	public List<Article> fetchAllArticles() {
		return getDbContext().select().from(ARTICLE).fetchInto(Article.class);
	}

	/**
	 * Fetch Articles by location
	 * 
	 * @param latitude
	 * @param longitude
	 * @param radius
	 * @return
	 */
	public List<Article> fetchArticlesByZone(float latitude, float longitude, float radius) {
		DSLContext context = getDbContext();
		return context
				.select()
				.from(ARTICLE.leftOuterJoin(SHOP.join(ARTICLE_SHOP).on(ARTICLE_SHOP.SHOP_ID.equal(SHOP.SHOP_ID))).on(
						ARTICLE_SHOP.ARTICLE_ID.equal(ARTICLE.ARTICLE_ID)))
				.where(ARTICLE_SHOP.SHOP_ID.equal(context.select(SHOP.SHOP_ID).from(SHOP)
						.where(SHOP.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
						.and(SHOP.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))))
				.fetchInto(Article.class);
	}

	/**
	 * Fetches shop information
	 * 
	 * @param shopId
	 * @return
	 */
	public Shop fetchShopById(long shopId) {
		return getDbContext().select().from(SHOP).where(SHOP.SHOP_ID.equal(shopId)).fetchAny().into(Shop.class);
	}

	/**
	 * Fetches all shops in a zone
	 * 
	 * @param latitude
	 * @param longitude
	 * @param radius
	 * @return
	 */
	public List<Shop> fetchShopsByZone(float latitude, float longitude, float radius) {
		return getDbContext().select().from(SHOP)
				.where(SHOP.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
				.and(SHOP.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))
				.fetchInto(Shop.class);
	}
}
