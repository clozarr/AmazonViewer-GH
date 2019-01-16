package com.clozarr.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {

	private int id;
	private int seasonQuantity;
	private ArrayList<Chapter> chapters;

	public Serie(String tittle, String genre, String creator, int duration, int seasonQantity,
			ArrayList<Chapter> chapters) {

		super(tittle, genre, creator, duration);
		this.seasonQuantity = seasonQantity;
		this.chapters = chapters;

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
		return "::: SERIE :::" + "\n tittle: " + getTittle() + "\n genre: " + getGenre() + "\n creator: " + getCreator()
				+ "\n duration: " + getDuration() + "\n seasonQuantity: " + getSeasonQuantity();

	}

	public static ArrayList<Serie> makeSerieList() {

		ArrayList<Serie> series = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			series.add(new Serie("Serie " + i, "Genre " + i, "Creator " + i, 60, i, Chapter.makeChapterList()));
		}

		return series;

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		int chatperViewedCounter = 0;
		ArrayList<Chapter> chaptersViewed = this.getChapters();

		for (Chapter chapter : chaptersViewed) {

			if (chapter.isViewed())

				chatperViewedCounter++;
		}

		if (chatperViewedCounter == chaptersViewed.size()) 
             
			  setViewed(true);
		

	}

}
