package com.clozarr.amazonviewer.model;

public class Serie extends Film{

	 private int id;
	 private int seasonQuantity;
	 private Chapter[] chapters;



	public Serie(String tittle, String genre, String creator, int duration, int seasonQantity) {
		
		super(tittle, genre, creator, duration);
		this.seasonQuantity = seasonQantity;
		
	}

	public int getId() {
		return id;
	}

	public int getSeasonQuantity() {
		return seasonQuantity;
	}

	public void setSeasonQuantity(int seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	
	 
}
