package com.cg.learning.controller;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myresource")
public class Controller {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIT() {
		return "String";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIT1() {
		return "String2";
	}

}
