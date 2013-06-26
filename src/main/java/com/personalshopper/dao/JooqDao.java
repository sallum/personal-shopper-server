package com.personalshopper.dao;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 * Super class for all JOOQ based DAO's
 * 
 * @author Ignacio Mulas
 */
public class JooqDao {
	private DataSource mDataSource;

	/**
	 * Main constructor
	 * 
	 * @param connection
	 */
	public JooqDao(DataSource dataSource) {
		mDataSource = dataSource;
	}

	/**
	 * Get JOOQ executor
	 * 
	 * @return
	 */
	public DSLContext getDbContext() {
		return DSL.using(mDataSource, SQLDialect.MYSQL);
	}
}
