package com.personalshopper.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import com.personalshopper.dao.Dao;
import com.personalshopper.jooq.tables.pojos.Articles;

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

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String entity) {
		// TODO: Methods POST will be used to introduce data in the db
		String result = "Post method answer";
		return Response.status(201).entity(result).build();
	}

	/**
	 * Gets all articles in the database
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Articles> getAllArticles() {
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
	public List<Articles> getAllArticlesByLocation(@PathParam("latitude") float latitude,
			@PathParam("longitude") float longitude) {
		return dao.fetchArticlesByZone(latitude, longitude, RADIUS);
	}
}