package com.clozarr.amazonviewer.model;

public class Movie extends Film{

	 private int id;
	 private int timeViewed;
	 


	public Movie(String tittle, String genre, String creator, int duration, short year) {
		super(tittle, genre, creator, duration);
		setYear(year);
	}



	public void showData() {
		
//		System.out.println("Tittle: " + this.tittle);
//		System.out.println("Genre: " + this.genre);
//		System.out.println("Year: " + this.year);
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
	
}
