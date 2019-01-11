package com.clozarr.amazonviewer.model;

import java.util.Date;

public class Book {

	private int id;
	private String tittle;
	private Date editionDate;
	private String editorial;
	private String [] authors;
	private String isbn;
	private boolean read;
	private int timeRead;
	
	public Book(String tittle, Date editionDate, String editorial, String isbn) {
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.isbn = isbn;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public int getTimeRead() {
		return timeRead;
	}

	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	
	
}
