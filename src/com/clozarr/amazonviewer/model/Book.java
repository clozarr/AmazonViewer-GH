package com.clozarr.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {

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
	
	public String isChecked() {
		
		return this.isRead()?"SI":"NO";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::: BOOK :::" + "\n tittle: " + getTittle() + "\n editorial: " + getEditorial() + "\n isbn: "
				+ getIsbn();
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

			setTimeRead((int) (dateF.getTime() - dateI.getTime()));

		} else {

			setTimeRead(0);
		}
	}

	public static ArrayList<Book> makeBookList() {

		ArrayList<Book> books = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {

			books.add(new Book("Libro " + i, new Date(), "Editorial " + i));
		}

		return books;

	}

}
