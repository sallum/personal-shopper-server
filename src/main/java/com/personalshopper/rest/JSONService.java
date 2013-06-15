package com.personalshopper.rest;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.personalshopper.data.tables.pojos.Articles;
import com.personalshopper.data.tables.pojos.Shops;
import com.personalshopper.workers.ArticleListByLocationThread;
import com.personalshopper.workers.ArticleListThread;
import com.personalshopper.workers.ShopListThread;
import com.personalshopper.workers.ShopThread;

/**
 * Server's REST interface.
 * 
 * @author Ignacio Mulas
 * 
 */
@Path("/json")
public class JSONService {

	/**
	 * Common thread pool to attend incoming requests
	 */
	private final ExecutorService threadPool = Executors.newCachedThreadPool();
	private final Logger logger = Logger.getLogger(JSONService.class);

	@POST
	@Path("/post")
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
	@Path("/get/articles")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Articles> getAllArticles() {
		ArticleListThread articleThread = new ArticleListThread();
		Future<List<Articles>> future = threadPool.submit(articleThread);
		List<Articles> articleList = null;
		try {
			articleList = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleList;
	}

	/**
	 * Gets articles near to the location provided
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	@GET
	@Path("/get/articles/latitude/{latitude}/longitude/{longitude}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Articles> getAllArticlesByLocation(@PathParam("latitude") float latitude,
			@PathParam("longitude") float longitude) {
		ArticleListByLocationThread articleThread = new ArticleListByLocationThread(latitude, longitude);
		Future<List<Articles>> future = threadPool.submit(articleThread);
		List<Articles> articleList = null;
		try {
			articleList = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleList;
	}

	/**
	 * Gets shop data using shop id
	 * 
	 * @param shopId
	 * @return
	 */
	@GET
	@Path("/get/shop/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shops getShop(@PathParam("id") long shopId) {
		ShopThread shopThread = new ShopThread(shopId);
		Future<Shops> future = threadPool.submit(shopThread);
		Shops shop = null;
		try {
			shop = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shop;
	}

	/**
	 * Get close shops to a given location
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	@GET
	@Path("/get/shop/latitude/{latitude}/longitude/{longitude}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Shops> getShops(@PathParam("latitude") float latitude, @PathParam("longitude") float longitude) {
		// TODO: Will return a list of shops in the area
		ShopListThread shopListThread = new ShopListThread(latitude, longitude);
		Future<List<Shops>> future = threadPool.submit(shopListThread);
		List<Shops> shopList = null;
		try {
			shopList = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shopList;
	}

}