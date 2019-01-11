package com.clozarr.amazonviewer.model;

import java.util.Date;

public class Magazine {

	private int id;
	private String tittle;
	private Date editionDate;
	private String editorial;
	private String [] authors;
	
	public Magazine(String tittle, Date editionDate, String editorial) {
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Date getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	 
	
	
}
