package com.personalshopper.workers;

import static com.personalshopper.data.tables.Shops.SHOPS;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.data.tables.pojos.Shops;

/**
 * Shop worker
 * 
 * @author Ignacio Mulas
 */
public class ShopThread extends DbController implements Callable<Shops> {

	private final long shopId;

	public ShopThread(long shopId) {
		super();
		this.shopId = shopId;
	}

	@Override
	public Shops call() {
		Connection conn = null;
		Shops shop = new Shops();

		try {
			conn = connectToMySQL();
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			shop = create.select().from(SHOPS).where(SHOPS.SHOP_ID.equal(shopId)).fetchAny().into(Shops.class);
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
		return shop;
	}
}
