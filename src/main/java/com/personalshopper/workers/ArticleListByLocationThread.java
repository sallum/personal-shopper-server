package com.personalshopper.workers;

import static com.generated.sources.tables.ArticleShop.ARTICLE_SHOP;
import static com.generated.sources.tables.Articles.ARTICLES;
import static com.generated.sources.tables.Shops.SHOPS;

import java.sql.Connection;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.generated.sources.tables.pojos.Articles;

/**
 * This class will fetch information in the near area of the provided location.
 * 
 * @author Ignacio Mulas 09-06-2013 Initial version
 * 
 */
public class ArticleListByLocationThread extends ArticleListThread {

	private final float latitude;
	private final float longitude;

	// 3'' ~ 30 meters
	// We say that we want all the shops in 500m -> 500/30 = 17''
	// In decimal coordinates = 17/3600 = 0,00472
	private static final float RADIUS = 0.00472f;

	public ArticleListByLocationThread(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		// TODO Using this constructor the thread should give back the articles
		// within a range
		// TODO: Which range? Is it configurable by the user?
	}

	@Override
	List<Articles> searchByCriteria(Connection connection) {
		DSLContext create = DSL.using(connection, SQLDialect.MYSQL);
		return create
				.select()
				.from(ARTICLES.leftOuterJoin(SHOPS.join(ARTICLE_SHOP).on(ARTICLE_SHOP.SHOP_ID.equal(SHOPS.SHOP_ID)))
						.on(ARTICLE_SHOP.ARTICLE_ID.equal(ARTICLES.ARTICLE_ID)))
				.where(ARTICLE_SHOP.SHOP_ID.equal(create.select(SHOPS.SHOP_ID).from(SHOPS)
						.where(SHOPS.LATITUD.between((double) (latitude - RADIUS)).and((double) (latitude + RADIUS)))
						.and(SHOPS.LONGITUD.between((double) (longitude - RADIUS)).and((double) (longitude + RADIUS)))))
				.fetchInto(Articles.class);

	}
}
