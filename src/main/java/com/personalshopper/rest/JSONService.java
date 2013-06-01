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

import com.generated.sources.tables.pojos.Articles;
import com.generated.sources.tables.pojos.Shops;
import com.personalshopper.workers.ArticleThread;
import com.personalshopper.workers.ShopListThread;
import com.personalshopper.workers.ShopThread;

@Path("/json")
public class JSONService {

	private final ExecutorService threadPool = Executors.newCachedThreadPool();

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(String entity) {
		String result = "Post method answer";
		return Response.status(201).entity(result).build();
	}

	@GET
	@Path("/get/article")
	@Produces(MediaType.APPLICATION_JSON)
	public Articles getArticleInJSON() {
		ArticleThread articleThread = new ArticleThread();
		Future<Articles> future = threadPool.submit(articleThread);
		Articles article = null;
		try {
			article = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return article;
	}

	@GET
	@Path("/get/shop/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shops getShopInJSON(@PathParam("id") long shopId) {
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