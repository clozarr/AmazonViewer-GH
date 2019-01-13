package com.clozarr.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{

	 private int id;
	 private int seasonQuantity;
	 private ArrayList<Chapter> chapters;



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



 public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "::: SERIE :::" +
		   "\n tittle: " + getTittle() +
		   "\n genre: " + getGenre() +
		   "\n creator: " + getCreator() +
		   "\n duration: " + getDuration() +
		   "\n seasonQuantity: " + getSeasonQuantity();

}
	
	 
}
