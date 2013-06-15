package com.personalshopper.services.workers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.personalshopper.dao.Dao;
import com.personalshopper.data.tables.pojos.Articles;

/**
 * Article worker
 * 
 * @author Ignacio Mulas
 */
public class ArticleListThread implements Callable<List<Articles>> {

	@Override
	public List<Articles> call() {
		List<Articles> articleList = new ArrayList<Articles>();
		try {
			DSLContext create = DSL.using(Dao.getConnection(), SQLDialect.MYSQL);
			articleList = Dao.fetchAllArticles(create);
		} catch (Exception e) {
			// TODO: Think about exception handling...
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		}
		return articleList;
	}
}
