package com.personalshopper.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import com.generated.sources.tables.pojos.Articles;
import com.generated.sources.tables.pojos.Shops;

import static com.generated.sources.tables.Articles.ARTICLES;
import static com.generated.sources.tables.Shops.SHOPS;

@Path("/json")
public class JSONService {

	@GET
	@Path("/get/article")
	@Produces(MediaType.APPLICATION_JSON)
	public Articles getArticleInJSON() {
		Connection conn = null;
		Articles article = new Articles();

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/personal_shopper";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
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
		return article;
	}
	
	@GET
	@Path("/get/shop")
	@Produces(MediaType.APPLICATION_JSON)
	public Shops getShopInJSON() {
		Connection conn = null;
		Shops shop = new Shops();

		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/personal_shopper";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(SHOPS).fetch();
			// Look for a eficient way of creating the instance!
			
			for (Record r : result) {
				shop.setShopId(r.getValue(SHOPS.SHOP_ID));
				shop.setAddress(r.getValue(SHOPS.ADDRESS));
				shop.setEmail(r.getValue(SHOPS.EMAIL));
				shop.setLatitud(r.getValue(SHOPS.LATITUD));
				shop.setLongitud(r.getValue(SHOPS.LONGITUD));
				shop.setName(r.getValue(SHOPS.NAME));
				shop.setSchedule(r.getValue(SHOPS.SCHEDULE));
			}
		} catch (Exception e) {
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

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String entity) {
		String result = "Post method answer";
		return Response.status(201).entity(result).build();
	}

}