package com.personalshopper;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.personalshopper.dao.Dao;

/**
 * Main Guice module for setting Dao binding as well as jersey configuration
 * 
 * @author Ignacio Mulas
 */
public class GuiceServiceModule extends AbstractModule {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void configure() {
		bind(DataSource.class).toProvider(DatabaseConnectionProvider.class).in(Singleton.class);
		bind(Dao.class).in(Singleton.class);
	}
}
