package com.clozarr.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication {

	private int id;

	public Magazine(String tittle, Date editionDate, String editorial) {
		super(tittle, editionDate, editorial);
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::: MAGAZINE :::" + "\n tittle: " + getTittle() + "\n editorial: " + getEditorial();

	}

	public static ArrayList<Magazine> makeMagazineList() {

		ArrayList<Magazine> magazines = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			magazines.add(new Magazine("Magazine " + i, new Date(), "Editorial " + i));
		}

		return magazines;

	}

}
