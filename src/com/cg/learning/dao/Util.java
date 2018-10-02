package com.cg.learning.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cg.learning.bean.Movie;

public class Util {

	//public static void main(String[] args) {
	public static Connection getConn() {
	
		Connection conn=null;
		
		try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "oracle");
			System.out.println("connected");
			
			
			
			
			/*Movie m1= new Movie();
			List<Movie> mArray=new ArrayList<Movie>(); 
		
			
			PreparedStatement pstmt=null;
			
			
			
			pstmt=conn.prepareStatement(QueryMapper.SELECT_ALL);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				m1.setName(rs.getString(1));
				m1.setRating(rs.getDouble(2));
				
				m1.setGenre(rs.getString(3));
				System.out.println(rs.getString(3));
				mArray.add(m1);
			}
			*/
			
			
			
			
			
			
			
			
			
		}
			
		
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("error in conection");
		}
		
		
		return conn;
	}
	
}
	

