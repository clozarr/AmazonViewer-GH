package com.clozarr.amazonviewer.dao;

import java.util.ArrayList;

import com.clozarr.amazonviewer.model.Movie;

public interface IMovieDAO{

	  
	
	default Movie setMovieViewed(Movie movie){
		
		return movie;
	}
	
	default ArrayList<Movie> read(){
		
		ArrayList<Movie> movies = new ArrayList<>();
		return movies;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
}
