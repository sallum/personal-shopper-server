package com.personalshopper.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import com.personalshopper.dao.Dao;
import com.personalshopper.entities.CreateUser;

/**
 * Contains the REST api for the users
 * 
 * @author Ignacio Mulas
 * 
 */
@Path("/users")
public class UserService {

	private Dao dao;

	private final Logger logger = Logger.getLogger(ArticleService.class);

	/**
	 * Main constructor
	 * 
	 * @param dao
	 */
	@Inject
	public UserService(Dao dao) {
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
	public Response createUser(CreateUser user) {
		dao.createUser(user.getUserName(), user.getBirthday(), user.getGender(), user.getSizePants(),
				user.getSizeShirts(), user.getSizeShoes(), user.getEmail());
		return Response.status(201).build();
	}

}
