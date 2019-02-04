package com.clozarr.amazonviewer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.clozarr.amazonviewer.db.IDBConnection;
import com.clozarr.amazonviewer.model.Movie;
import static com.clozarr.amazonviewer.db.DataBase.*;

public interface IMovieDAO extends IDBConnection{

	  
	
	default Movie setMovieViewed(Movie movie){
		
		try(Connection connection = connectToDB()){
			
			Statement statement = connection.createStatement();
			String query = "INSERT INTO " + TVIEWED +
					       " (" + TVIEWED_ID_MATERIAL + ", " + TVIEWED_ID_ELEMENT + ", " + TVIEWED_ID_USER + ")" +
					       "VALUES(" + ID_MATERIALS[0] + ", " + movie.getId() + ", " + TUSER_IDUSUARIO + ")";
			
			System.out.println("Está aqui");
			if(statement.executeUpdate(query) > 0) {
				
				System.out.println("Se marcó en visto");
				
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
		}
		
		
		return movie;
	}
	
	default ArrayList<Movie> read(){
		
		ArrayList<Movie> movies = new ArrayList<>();
		
		try(Connection connection = connectToDB()){
			
			String sql = "SELECT * FROM " + TMOVIE;
			
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {
			
				Movie movie = new Movie(resultSet.getString(TMOVIE_TITLE), 
						resultSet.getString(TMOVIE_GENRE), 
						resultSet.getString(TMOVIE_CREATOR), 
						Integer.valueOf(resultSet.getString(TMOVIE_DURATION)), 
						Short.valueOf(resultSet.getString(TMOVIE_YEAR)));
				
				movie.setId(Integer.valueOf(resultSet.getString(TMOVIE_ID)));
				movie.setViewed(getMovieViewed(prepareStatement, connection, Integer.valueOf(resultSet.getString(TMOVIE_ID))));
				movies.add(movie);
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return movies;
	}
	
	private boolean getMovieViewed(PreparedStatement prepareStatement, Connection connection, int idMovie) {
	    boolean viewed = false;
	    String query = "SELECT * FROM " + TVIEWED + 
	    		" WHERE " + TVIEWED_ID_MATERIAL + " = ?" + 
	    		" AND " + TVIEWED_ID_ELEMENT + " = ?" +
	    		" AND " + TVIEWED_ID_USER  + " =  ?";
	    				
	    ResultSet rs = null;
	    try {
			prepareStatement = connection.prepareStatement(query);
		    prepareStatement.setInt(1, ID_MATERIALS[0]);
		    prepareStatement.setInt(2, idMovie);
		    prepareStatement.setInt(3,TUSER_IDUSUARIO);
		    
		    rs = prepareStatement.executeQuery();
		    viewed = rs.next();
		    
	    
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
		return viewed;
	}
}
