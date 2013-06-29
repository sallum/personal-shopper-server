package com.personalshopper.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import com.personalshopper.dao.Dao;
import com.personalshopper.entities.CreateArticle;
import com.personalshopper.jooq.enums.ArticleType;
import com.personalshopper.jooq.tables.pojos.Article;

/**
 * Server's REST interface for articles.
 * 
 * @author Ignacio Mulas
 * 
 */
@Path("/articles")
public class ArticleService {

	/**
	 * 3'' ~ 30 meters We say that we want all the shops in 500m -> 500/30 =
	 * 17'' In decimal coordinates = 17/3600 = 0,00472
	 */
	private static final float RADIUS = 0.00472f;

	private Dao dao;

	private final Logger logger = Logger.getLogger(ArticleService.class);

	/**
	 * Main constructor
	 * 
	 * @param dao
	 */
	@Inject
	public ArticleService(Dao dao) {
		this.dao = dao;
	}

	/**
	 * Creates an article
	 * 
	 * @param article
	 * @return
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createArticle(CreateArticle article) {
		dao.createArticle(ArticleType.valueOf(article.getType()), article.getModel(), article.getSize(),
				article.getColour(), article.getBrand(), article.getPrice(), 1);
		// TODO: Change shopId hard-coded for the shopId of each article
		return Response.status(201).build();
	}

	/**
	 * Deletes an article
	 * 
	 * @param article
	 * @return
	 */
	@DELETE
	@Path("/{id}")
	public Response deleteArticle(@PathParam("id") long id) {
		dao.deleteArticle(id);
		return Response.status(200).build();
	}

	/**
	 * Gets all articles in the database
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Article> getAllArticles() {
		return dao.fetchAllArticles();
	}

	/**
	 * Gets articles near to the location provided
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	@GET
	@Path("/{latitude}/{longitude}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Article> getAllArticlesByLocation(@PathParam("latitude") float latitude,
			@PathParam("longitude") float longitude) {
		return dao.fetchArticlesByZone(latitude, longitude, RADIUS);
	}

	/**
	 * Gets an article
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Article getArticleById(@PathParam("id") long id) {
		return dao.getArticleById(id);
	}

}