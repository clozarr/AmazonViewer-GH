package com.clozarr.amazonviewer.model;

public class Movie {

	 private int id;
	 private String tittle;
	 private String genre;
	 private String creator;
	 private int duration;
	 private short year;
	 private boolean viewed;
	 private int timeViewed;
	 
	public Movie(String tittle, String genre, short year) {
		
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.year = year;
	}

	public Movie(String tittle, String genre, String creator, int duration, short year) {
		
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
		this.year = year;
	}
	
	
	public void showData() {
		
		System.out.println("Tittle: " + this.tittle);
		System.out.println("Genre: " + this.genre);
		System.out.println("Year: " + this.year);
	}
	
}
