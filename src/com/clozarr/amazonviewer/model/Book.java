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
	
	
}
