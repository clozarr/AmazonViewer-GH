package com.clozarr.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication{

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
		return "::: BOOK :::" +
			   "\n tittle: " + getTittle() +
			   "\n editorial: " + getEditorial();
			
	 }	
	
	
}
