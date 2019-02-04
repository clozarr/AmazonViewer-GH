package com.clozarr.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.clozarr.amazonviewer.db.DataBase.*;

public interface IDBConnection {

	default Connection connectToDB() {
		
		Connection connection = null;
		
		try {
			
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  connection = DriverManager.getConnection(URL+DB,USER,PASSWORD);
		  if(connection != null) {
			  System.out.println("¡Se estableció la conexion!");
			  
		  }
		  
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
			return connection;
		}
		
		
	}
	
	
	
}
