package com.personalshopper.dao;

import static com.personalshopper.data.tables.ArticleShop.ARTICLE_SHOP;
import static com.personalshopper.data.tables.Articles.ARTICLES;
import static com.personalshopper.data.tables.Shops.SHOPS;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.DSLContext;

import com.personalshopper.data.tables.pojos.Articles;
import com.personalshopper.data.tables.pojos.Shops;
import com.personalshopper.services.DbControllerService;

/**
 * This class contains the methods to access the databases and run the queries
 * of the articles.
 * 
 * @author Ignacio Mulas
 * 
 */
public final class Dao {

	private static DbControllerService dbController = new DbControllerService();

	public static synchronized List<Articles> fetchAllArticles(DSLContext create) {
		return create.select().from(ARTICLES).fetchInto(Articles.class);
	}

	public static synchronized List<Articles> fetchArticlesByZone(DSLContext create, float latitude, float longitude,
			float radius) {
		return create
				.select()
				.from(ARTICLES.leftOuterJoin(SHOPS.join(ARTICLE_SHOP).on(ARTICLE_SHOP.SHOP_ID.equal(SHOPS.SHOP_ID)))
						.on(ARTICLE_SHOP.ARTICLE_ID.equal(ARTICLES.ARTICLE_ID)))
				.where(ARTICLE_SHOP.SHOP_ID.equal(create.select(SHOPS.SHOP_ID).from(SHOPS)
						.where(SHOPS.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
						.and(SHOPS.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))))
				.fetchInto(Articles.class);
	}

	public static synchronized Shops fetchShopById(DSLContext create, long shopId) {
		return create.select().from(SHOPS).where(SHOPS.SHOP_ID.equal(shopId)).fetchAny().into(Shops.class);
	}

	public static synchronized List<Shops> fetchShopsByZone(DSLContext create, float latitude, float longitude,
			float radius) {
		return create.select().from(SHOPS)
				.where(SHOPS.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
				.and(SHOPS.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))
				.fetchInto(Shops.class);
	}

	public static synchronized Connection getConnection() throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, SQLException {
		Connection connection = dbController.getConnection();
		return connection;
	}

}
