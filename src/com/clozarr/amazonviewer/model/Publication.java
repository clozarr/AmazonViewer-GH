package com.clozarr.amazonviewer.model;

import java.util.Date;

public class Publication {

	private String tittle;
	private Date editionDate;
	private String editorial;
	private String[] autors;

	public Publication(String tittle, Date editionDate, String editorial) {
		
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
	
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

	public String[] getAutors() {
		return autors;
	}

	public void setAutors(String[] autors) {
		this.autors = autors;
	}

}
