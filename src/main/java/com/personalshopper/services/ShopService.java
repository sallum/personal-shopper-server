package com.personalshopper.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import com.personalshopper.dao.Dao;
import com.personalshopper.jooq.tables.pojos.Shops;

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
	 * Gets shop data using shop id
	 * 
	 * @param shopId
	 * @return
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Shops getShop(@PathParam("id") long shopId) {
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
	public List<Shops> getShops(@PathParam("latitude") float latitude, @PathParam("longitude") float longitude) {
		return dao.fetchShopsByZone(latitude, longitude, RADIUS);
	}

}
