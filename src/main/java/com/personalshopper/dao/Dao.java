package com.personalshopper.dao;

import static com.personalshopper.jooq.tables.Article.ARTICLE;
import static com.personalshopper.jooq.tables.ArticleShop.ARTICLE_SHOP;
import static com.personalshopper.jooq.tables.Shop.SHOP;
import static com.personalshopper.jooq.tables.User.USER;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.jooq.DSLContext;

import com.google.inject.Inject;
import com.personalshopper.jooq.enums.ArticleType;
import com.personalshopper.jooq.enums.UserUserGender;
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
	 * Create new user
	 * 
	 * @param userName
	 * @param birthday
	 * @param gender
	 * @param sizePants
	 * @param sizeShirts
	 * @param sizeShoes
	 * @param email
	 */
	public void createUser(String userName, Date birthday, String gender, String sizePants, String sizeShirts,
			String sizeShoes, String email) {
		getDbContext()
				.insertInto(USER, USER.USER_NAME, USER.USER_BIRTHDAY, USER.USER_GENDER, USER.USER_SIZE_PANTS,
						USER.USER_SIZE_SHIRT, USER.USER_SIZE_SHOES, USER.USER_EMAIL)
				.values(userName, birthday, UserUserGender.valueOf(gender), sizePants, sizeShirts, sizeShoes, email)
				.execute();
	}

	/**
	 * Deletes an article
	 * 
	 * @param id
	 */
	public void deleteArticle(long id) {
		getDbContext().delete(ARTICLE).where(ARTICLE.ARTICLE_ID.equal(id)).execute();
	}

	/**
	 * Fetches all articles in the database
	 * 
	 * @return
	 */
	public List<Map<String, Object>> fetchAllArticles() {
		List<Map<String, Object>> articles = getDbContext()
				.select(ARTICLE.ARTICLE_ID, ARTICLE.BRAND, ARTICLE.COLOUR, ARTICLE.MODEL, ARTICLE.IMAGE, ARTICLE.PRICE,
						ARTICLE.SIZE, ARTICLE.TYPE, ARTICLE_SHOP.SHOP_ID).from(ARTICLE).naturalJoin(ARTICLE_SHOP)
				.fetchMaps();
		return articles;
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

	/**
	 * Get an article by Id
	 * 
	 * @param id
	 * @return
	 */
	public Article getArticleById(long id) {
		return getDbContext().select().from(ARTICLE).where(ARTICLE.ARTICLE_ID.equal(id)).fetchOne().into(Article.class);
	}

}
