package com.personalshopper;

import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.google.inject.Provider;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.personalshopper.dao.Utils;

/**
 * Guice provider for {@link Connection}
 * 
 * @author Ignacio Mulas
 * 
 */
public class DatabaseConnectionProvider implements Provider<ComboPooledDataSource> {
	private ComboPooledDataSource mCpds;
	private final Logger mLogger = Logger.getLogger(DatabaseConnectionProvider.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ComboPooledDataSource get() {
		Properties props = null;
		try {
			props = Utils.readProperties("datasource.properties");
			mCpds = new ComboPooledDataSource();
			mCpds.setJdbcUrl(props.getProperty("jdbcUrl"));
			mCpds.setUser(props.getProperty("username"));
			mCpds.setPassword(props.getProperty("password"));

			mCpds.setInitialPoolSize(new Integer(props.getProperty("initialPoolSize")));
			mCpds.setAcquireIncrement(new Integer(props.getProperty("acquireIncrement")));
			mCpds.setMaxPoolSize(new Integer(props.getProperty("maxPoolSize")));
			mCpds.setMinPoolSize(new Integer(props.getProperty("minPoolSize")));
			mCpds.setMaxStatements(new Integer(props.getProperty("maxStatements")));
		} catch (IOException e) {
			mLogger.fatal("Could not read database properties");
		}
		return mCpds;
	}
}
