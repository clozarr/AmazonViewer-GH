package com.clozarr.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable {

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

		return "::: MOVIE ::: " + "\n tittle: " + getTittle() + "\n Genero: " + getGenre() + "\n Year: " + getYear()
				+ "\n Creator: " + getCreator() + "\n Duration: " + getDuration();

	}

	@Override
	public Date starToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getTime() > dateI.getTime()) {

			setTimeViewed((int) dateF.getTime() - (int) dateI.getTime());

		} else {

			setTimeViewed(0);
		}

	}

	public static ArrayList<Movie> makeMoviesList() {

		ArrayList<Movie> movies = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			movies.add(new Movie("Movie " + i, "Genero " + i, "Creador " + i, 120, (short) 2017));

		}

		return movies;

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

		this.setViewed(true);
		Date dateI = this.starToSee(new Date());

		for (int i = 0; i < 5000; i++) {

			System.out.println("........");
		}

		this.stopToSee(dateI, new Date());
		System.out.println(toString());
		this.setViewed(true);
		System.out.println("La viste por: " + this.getTimeViewed() + " seg");
		System.out.println();

	}

}
