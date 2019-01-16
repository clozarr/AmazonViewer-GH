package com.clozarr.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Chapter extends Movie {

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
		return "::: CHAPTER :::" + "\n tittle: " + getTittle() + "\n genre: " + getGenre() + "\n creator: "
				+ getCreator() + "\n year: " + getYear() + "\n seasonNumber: " + getSeasonNumber();
	}

	public static ArrayList<Chapter> makeChapterList() {

		ArrayList<Chapter> chapters = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			chapters.add(new Chapter("Chapter " + i, "Genre " + i, "Creator " + i, (i + 120), (short) (2017 + i), 1));
		}

		return chapters;

	}
	
	@Override
	public void view() {
		// TODO Auto-generated method stub
		Date dateI = starToSee(new Date());

		for (int i = 0; i < 5000; i++) {

			System.out.println("........");
		}

	    stopToSee(dateI, new Date());
		setViewed(true);
		

		System.out.println(toString());
		System.out.println("Viste el caítulo por: " + getTimeViewed() + " seg");
		System.out.println();
		
		
	}

}
