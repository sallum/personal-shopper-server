package com.personalshopper.workers;

import static com.generated.sources.tables.Articles.ARTICLES;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.generated.sources.tables.pojos.Articles;

/**
 * Article worker
 * 
 * @author Ignacio Mulas
 */
public class ArticleThread extends DbController implements Callable<Articles> {

	@Override
	public Articles call() {
		Articles article = new Articles();
		Connection connection = null;
		try {
			// TODO: this request should give back only one instance...
			// TODO: think how to handle different request from the same person
			connection = connectToMySQL();
			
			DSLContext create = DSL.using(connection, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(ARTICLES).fetch();
			// Look for a eficient way of creating the instance!

			for (Record r : result) {
				article.setArticleId(r.getValue(ARTICLES.ARTICLE_ID));
				article.setBrand(r.getValue(ARTICLES.BRAND));
				article.setType(r.getValue(ARTICLES.TYPE));
				article.setColour(r.getValue(ARTICLES.COLOUR));
				article.setModel(r.getValue(ARTICLES.MODEL));
				article.setPrice(r.getValue(ARTICLES.PRICE));
				article.setSize(r.getValue(ARTICLES.SIZE));
				article.setPicture(r.getValue(ARTICLES.PICTURE));
			}			

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
		return article;
	}

}
