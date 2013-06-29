package com.personalshopper.services;

import java.util.List;

import javax.ws.rs.Consumes;
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
import com.personalshopper.entities.CreateShop;
import com.personalshopper.jooq.tables.pojos.Shop;

/**
 * Rest service for shops
 * 
 * @author Ignacio Mulas
 * 
 */
@Path("/shops")
public class ShopService {

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
	public ShopService(Dao dao) {
		this.dao = dao;
	}

	/**
	 * Creates a new shop
	 * 
	 * @param shop
	 * @return
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createShop(CreateShop shop) {
		dao.createShop(shop.getName(), shop.getEmail(), shop.getLatitude(), shop.getLongitude(), shop.getAddress(),
				shop.getSchedule());
		return Response.status(201).build();
	}

	/**
	 * Gets shop data using shop id
	 * 
	 * @param shopId
	 * @return
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shop getShop(@PathParam("id") long shopId) {
		return dao.fetchShopById(shopId);
	}

	/**
	 * Get close shops to a given location
	 * 
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	@GET
	@Path("/{latitude}/{longitude}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Shop> getShops(@PathParam("latitude") float latitude, @PathParam("longitude") float longitude) {
		return dao.fetchShopsByZone(latitude, longitude, RADIUS);
	}

}
