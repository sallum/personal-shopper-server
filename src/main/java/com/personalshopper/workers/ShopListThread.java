package com.personalshopper.workers;

import static com.personalshopper.data.tables.Shops.SHOPS;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.data.tables.pojos.Shops;

/**
 * This class retrieves a list of shops within an area
 * 
 * @author Ignacio Mulas
 */
public class ShopListThread extends DbController implements Callable<List<Shops>> {

	private final float latitude;
	private final float longitude;

	// 3'' ~ 30 meters
	// We say that we want all the shops in 500m -> 500/30 = 17''
	// In decimal coordinates = 17/3600 = 0,00472
	private static final float RADIUS = 0.00472f;

	public ShopListThread(float latitude, float longitude) {
		super();
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
		Connection conn = null;
		List<Shops> shopList = new ArrayList<Shops>();

		try {
			conn = connectToMySQL();
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			shopList = create.select().from(SHOPS)
					.where(SHOPS.LATITUD.between((double) (latitude - RADIUS)).and((double) (latitude + RADIUS)))
					.and(SHOPS.LONGITUD.between((double) (longitude - RADIUS)).and((double) (longitude + RADIUS)))
					.fetchInto(Shops.class);
		} catch (Exception e) {
			// TODO: Update exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}

		return shopList;
	}
}
