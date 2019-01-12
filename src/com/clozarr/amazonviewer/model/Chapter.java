package com.clozarr.amazonviewer.model;

public class Chapter extends Movie{

	private int id;
	private int seasonNumber;
	


	public Chapter(String tittle, String genre, String creator, int duration, short year, int seasonNumber) {
		super(tittle, genre, creator, duration, year);
		this.seasonNumber = seasonNumber;
	}



	public int getSeasonNumber() {
		return seasonNumber;
	}


	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}



	

	
}
