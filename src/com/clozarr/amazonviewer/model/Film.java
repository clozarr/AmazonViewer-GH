package com.clozarr.amazonviewer.model;


/**
 * <h1>Film</h1>
 * Es una clase padre abstracta
 * 
 * <p>Es la clase base de la famiia Film, 
 *  como es abstracta  no pueden crearse 
 *  instancias. Contiene el método abstracto
 *  {@code view()} que es obligatorio implementar</p>
 *  
 *  @author Carlos A Lozano A
 *  @version 1.0
 * */
public abstract class Film {

	private String tittle;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;

	public Film(String tittle, String genre, String creator, int duration) {
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	public String isChecked() {
		
		return this.isViewed()?"SI":"NO";
		
	}
   
	/**
	 * Método {@code view()} es obligatorio de implementar
	 * */
	public abstract void view();
}
