package com.clozarr.amazonviewer.model;

public class Chapter extends Movie{

	private int id;
	private int seasonNumber;
	


	public Chapter(String tittle, String genre, String creator, int duration, short year, int seasonNumber) {
		super(tittle, genre, creator, duration, year);
		this.seasonNumber = seasonNumber;
	}


	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.getId();
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}


	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::: CHAPTER :::" +
		       "\n tittle: " + getTittle() +
		       "\n genre: " + getGenre() +
		       "\n creator: " + getCreator() +
		       "\n year: " + getYear() +
		       "\n seasonNumber: " + getYear();
	}

	

	
}
