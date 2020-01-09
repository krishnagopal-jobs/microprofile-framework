package com.mavin_tech.frameworks.agrata.client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/client/service")
public class ServiceController {

	@PersistenceContext
	private EntityManager entityManager;

	@GET
	@Path("/{parameter}")
	public String doSomething(@PathParam("parameter") String parameter) {

		System.out.println("entityManager : " + entityManager);
		
//		entityManager.

		return String.format("Processed parameter value '%s'", parameter);
	}
}
