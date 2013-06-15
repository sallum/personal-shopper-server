package com.personalshopper.services.workers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.dao.Dao;
import com.personalshopper.data.tables.pojos.Articles;

/**
 * This class will fetch information in the near area of the provided location.
 * 
 * @author Ignacio Mulas 09-06-2013 Initial version
 * 
 */
public class ArticleListByZoneThread implements Callable<List<Articles>> {

	// 3'' ~ 30 meters
	// We say that we want all the shops in 500m -> 500/30 = 17''
	// In decimal coordinates = 17/3600 = 0,00472
	private static final float RADIUS = 0.00472f;

	private final float latitude;
	private final float longitude;

	public ArticleListByZoneThread(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		// TODO: Which range? Is it configurable by the user?
	}

	@Override
	public List<Articles> call() throws Exception {
		List<Articles> articleList = new ArrayList<Articles>();
		try {
			DSLContext create = DSL.using(Dao.getConnection(), SQLDialect.MYSQL);
			articleList = Dao.fetchArticlesByZone(create, latitude, longitude, RADIUS);
		} catch (Exception e) {
			// TODO: Think about exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		}
		return articleList;
	}

}
