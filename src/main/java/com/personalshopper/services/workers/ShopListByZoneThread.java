package com.personalshopper.services.workers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.dao.Dao;
import com.personalshopper.data.tables.pojos.Shops;

/**
 * This class retrieves a list of shops within an area
 * 
 * @author Ignacio Mulas
 */
public class ShopListByZoneThread implements Callable<List<Shops>> {

	// 3'' ~ 30 meters
	// We say that we want all the shops in 500m -> 500/30 = 17''
	// In decimal coordinates = 17/3600 = 0,00472
	private static final float RADIUS = 0.00472f;

	private final float latitude;
	private final float longitude;

	public ShopListByZoneThread(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;

		// TODO Using this constructor the thread should give back the shops
		// within a range
		// TODO: Which range? Is it configurable by the user?
		// SELECT A.ABC_ID, A.VAL WHERE VAL NOT IN (SELECT VAL FROM B WHERE
		// B.ABC_ID = A.ABC_ID)
	}

	@Override
	public List<Shops> call() {
		List<Shops> shopList = new ArrayList<Shops>();
		try {
			DSLContext create = DSL.using(Dao.getConnection(), SQLDialect.MYSQL);
			shopList = Dao.fetchShopsByZone(create, latitude, longitude, RADIUS);
		} catch (Exception e) {
			// TODO: Update exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		}
		return shopList;
	}
}
