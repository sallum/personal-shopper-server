package com.personalshopper.workers;

import static com.personalshopper.data.tables.Articles.ARTICLES;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.data.tables.pojos.Articles;

/**
 * Article worker
 * 
 * @author Ignacio Mulas
 */
public class ArticleListThread extends DbController implements Callable<List<Articles>> {

	public ArticleListThread() {
		super();
	}

	@Override
	public List<Articles> call() {
		List<Articles> articleList = new ArrayList<Articles>();
		Connection connection = null;
		try {
			connection = connectToMySQL();
			articleList = searchByCriteria(connection);
		} catch (Exception e) {
			// TODO: Think about exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return articleList;
	}

	/**
	 * This method will differ on each thread type changing the search criteria.
	 * 
	 * @param connection
	 * @return
	 */
	List<Articles> searchByCriteria(Connection connection) {
		DSLContext create = DSL.using(connection, SQLDialect.MYSQL);
		return create.select().from(ARTICLES).fetchInto(Articles.class);
	}

}
