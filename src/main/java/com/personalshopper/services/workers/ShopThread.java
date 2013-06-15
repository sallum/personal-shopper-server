package com.personalshopper.services.workers;

import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.dao.Dao;
import com.personalshopper.data.tables.pojos.Shops;

/**
 * Shop worker
 * 
 * @author Ignacio Mulas
 */
public class ShopThread implements Callable<Shops> {

	private final long shopId;

	public ShopThread(long shopId) {
		this.shopId = shopId;
	}

	@Override
	public Shops call() {
		Shops shop = new Shops();

		try {
			DSLContext create = DSL.using(Dao.getConnection(), SQLDialect.MYSQL);
			shop = Dao.fetchShopById(create, shopId);
		} catch (Exception e) {
			// TODO: Update exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		}
		return shop;
	}
}
