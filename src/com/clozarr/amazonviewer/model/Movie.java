package com.clozarr.amazonviewer.model;

public class Movie extends Film{

	 private int id;
	 private int timeViewed;
	 


	public Movie(String tittle, String genre, String creator, int duration, short year) {
		super(tittle, genre, creator, duration);
		setYear(year);
	}


	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
	  
		 return "::: MOVIE ::: " +
				"\n tittle: " + getTittle() +
				"\n Genero: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
		
	}
	
}
