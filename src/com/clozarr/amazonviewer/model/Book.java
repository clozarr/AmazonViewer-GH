package com.clozarr.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

import com.clozarr.amazonviewer.util.AmazonUtil;

public class Book extends Publication implements IVisualizable {

	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	private ArrayList<Page> pages;

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}

	public Book(String tittle, Date editionDate, String editorial, ArrayList<Page> pages) {
		super(tittle, editionDate, editorial);
		this.pages = pages;
		
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

		return this.isRead() ? "SI" : "NO";
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

		
		ArrayList<Page> pages = new ArrayList<>();
		int pagina = 0;
		
		for (int i = 0; i < 5; i++) {
			pagina = i + 1;
			pages.add(new Book.Page(pagina, "Contenido de la pagina " + pagina));
		}
		
		for (int i = 1; i <= 5; i++) {

			books.add(new Book("Libro " + i, new Date(), "Editorial " + i, pages));
		}

		return books;

	}

	public void view() {


		Date dateI = starToSee(new Date());

		int bookReadCounter = 0;

		do {

			System.out.println("............");
			System.out.println("Page: " + getPages().get(bookReadCounter).getNumber());
			System.out.println(getPages().get(bookReadCounter).getContent());
			System.out.println("............");

			if (bookReadCounter != 0) {

				System.out.println("1. Regresar Página");

			}

			System.out.println("2. Siguiente Página");
			System.out.println("0. Cerrar Libro");
			System.out.println();

			int response = AmazonUtil.validateUserResponseMenu(0, 2);

			if (response == 2) {

				bookReadCounter++;
				
			} else if (response == 1) {

				bookReadCounter--;
				
			} else if (response == 0) {

				break;
			}

		} while (bookReadCounter < getPages().size());

		stopToSee(dateI, new Date());
		
		if(bookReadCounter == getPages().size())
		  
			setRead(true);
		
		System.out.println(toString());
		System.out.println("Leiste por: " + getTimeRead() + " seg");
		System.out.println();

	}

	public static class Page {

		private int id;
		private int number;
		private String content;

		public Page(int number, String content) {

			super();
			this.number = number;
			this.content = content;

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	}

}
