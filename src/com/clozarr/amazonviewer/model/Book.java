package com.clozarr.amazonviewer.model;

import java.util.Date;

public class Book extends Publication{

	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	

	

	
	public Book(String tittle, Date editionDate, String editorial) {
		super(tittle, editionDate, editorial);
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	 @Override
	 public String toString() {
	 	// TODO Auto-generated method stub
	 	return "::: BOOK :::" +
	 		   "\n tittle: " + getTittle() +
	 		   "\n editorial: " + getEditorial() +
	 		   "\n isbn: " + getIsbn();
	  }	
	
}
