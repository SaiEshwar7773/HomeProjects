package com.cg.learning.controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.learning.bean.Movie;
import com.cg.learning.dao.QueryMapper;
import com.cg.learning.dao.Util;

@Path("myresource")
public class Controller {

	
	
	
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getIT1() {
		
		Movie m1= new Movie();
		List<Movie> mArray=new ArrayList<Movie>(); 
		
		m1.setGenre("Action");
		m1.setName("Toy");
		m1.setRating(3.5);
		mArray.add(m1);
				return mArray;
	}

}
