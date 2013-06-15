package com.personalshopper.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.personalshopper.dao.Utils;

/**
 * This class is intended to be a library for common functions with the database
 * and it is extended by all the workers thread that perform tasks in the db
 * 
 * @author Ignacio Mulas
 */
public class DbControllerService {

	// TODO: Use guice and put all this class in the provider
	private ComboPooledDataSource mCpds;
	private final Logger logger = Logger.getLogger(DbControllerService.class);

	public DbControllerService() {
		if (mCpds == null) {
			mCpds = new ComboPooledDataSource();
			setProperties();
		}
	}

	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException,
			SQLException {
		return mCpds.getConnection();
	}

	private void setProperties() {
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
			logger.fatal("Could not read database properties");
		}

	}

	// TODO: See how to work with disconnections... is it handled by the pool?

}
