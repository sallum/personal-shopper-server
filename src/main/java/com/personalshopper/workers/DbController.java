package com.personalshopper.workers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is intended to be a library for common functions with the database
 * and it is extended by all the workers thread that perform tasks in the db
 * 
 * @author Ignacio Mulas
 */
public abstract class DbController {

	protected Connection connectToMySQL() throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, SQLException {
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/personal_shopper";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		return DriverManager.getConnection(url, userName, password);
	}

	// TODO: Create disconnect

}
