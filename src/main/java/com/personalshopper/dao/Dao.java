package com.personalshopper.dao;

import static com.personalshopper.jooq.tables.ArticleShop.ARTICLE_SHOP;
import static com.personalshopper.jooq.tables.Articles.ARTICLES;
import static com.personalshopper.jooq.tables.Shops.SHOPS;

import java.util.List;

import javax.sql.DataSource;

import org.jooq.DSLContext;

import com.google.inject.Inject;
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

	public synchronized List<Articles> fetchAllArticles() {
		return getDbContext().select().from(ARTICLES).fetchInto(Articles.class);
	}

	public synchronized List<Articles> fetchArticlesByZone(float latitude, float longitude, float radius) {
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

	public synchronized Shops fetchShopById(long shopId) {
		return getDbContext().select().from(SHOPS).where(SHOPS.SHOP_ID.equal(shopId)).fetchAny().into(Shops.class);
	}

	public synchronized List<Shops> fetchShopsByZone(float latitude, float longitude, float radius) {
		return getDbContext().select().from(SHOPS)
				.where(SHOPS.LATITUD.between((double) (latitude - radius)).and((double) (latitude + radius)))
				.and(SHOPS.LONGITUD.between((double) (longitude - radius)).and((double) (longitude + radius)))
				.fetchInto(Shops.class);
	}
}
