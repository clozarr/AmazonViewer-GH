package com.clozarr.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.clozarr.amazonviewer.model.Book;
import com.clozarr.amazonviewer.model.Chapter;
import com.clozarr.amazonviewer.model.Magazine;
import com.clozarr.amazonviewer.model.Movie;
import com.clozarr.amazonviewer.model.Serie;
import com.clozarr.report.Report;


/**
 * <h1>Amazon Viewer</h1> AmazonViewer es un programa que permite visualizar
 * movies, series, books y magazines. te permite generar reportes generales y
 * fecha del dia.
 * 
 * @author:Carlos A Lozano A
 * @version:1.1
 * @since: 2018
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
		// AmazonUtil.mostrarEnum();

	}

	public static void showMenu() {

		int exit = 1;

		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Date");
			System.out.println("0. Salir");

			System.out.println("\n");
			System.out.println("Escoja una opción:");

			Scanner sc = new Scanner(System.in);
			try {

				int respuesta = sc.nextInt();

				switch (respuesta) {

				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();

					break;
				case 6:
					makeReportWithDate();

					break;
				case 0:
					exit = 0;
					break;

				default:
					System.out.println("..:: ======= ::..");
					System.out.println("Opción no válida");
					break;
				}
			} catch (InputMismatchException e) {

				System.out.println("Error: opción no válida");
			}

		} while (exit != 0);

	}

	public static ArrayList<Movie> movies;

	public static void showMovies() {

		int exit = 1;
		movies = Movie.makeMoviesList();

		do {

			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();

			for (int i = 0; i < movies.size(); i++) {

				System.out
						.println((i + 1) + ". " + movies.get(i).getTittle() + ", Visto: " + movies.get(i).isChecked());

			}
			System.out.println("0. Regresar al menú");
			System.out.println();

			System.out.println("Selecciones una película:");
			Scanner scanner = new Scanner(System.in);
			int index = scanner.nextInt();

			if (index > 0) {

				Movie movie = movies.get(index - 1);
				Date dateI = movie.starToSee(new Date());

				for (int i = 0; i < 5000; i++) {

					System.out.println("........");
				}

				movie.stopToSee(dateI, new Date());
				System.out.println(movie);
				movie.view();

			} else if (index == 0) {

				exit = 0;

			} else {

				System.out.println("..::: OPCIÓN NO VALIDA :::..");
				exit = 1;

			}

		} while (exit != 0);

	}

	static ArrayList<Serie> series = Serie.makeSerieList();
	static ArrayList<Chapter> chapters = new ArrayList<>();

	public static void showSeries() {

		int exit = 1;

		do {

			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();

			for (int i = 0; i < series.size(); i++) {

				System.out
						.println((i + 1) + ". " + series.get(i).getTittle() + ", Vista: " + series.get(i).isChecked());

			}
			System.out.println("0. Regresar al menú");
			System.out.println();

			System.out.println("Selecciones una Serie:");
			Scanner scanner = new Scanner(System.in);
			int index = scanner.nextInt();

			if (index > 0) {

				Serie serie = series.get(index - 1);

				chapters = serie.getChapters();

				for (int j = 0; j < chapters.size(); j++) {
					System.out.println(
							(j + 1) + ". " + chapters.get(j).getTittle() + ", Visto: " + chapters.get(j).isChecked());
				}
				System.out.println("0. Regresar al menú");
				System.out.println();

				System.out.println("Escoja un capitulo: ");
				Scanner scn = new Scanner(System.in);
				int indexChapter = scn.nextInt();

				if (indexChapter > 0 && indexChapter <= (chapters.size() + 1)) {

					Chapter chapter = chapters.get(indexChapter - 1);
					chapter.view();
					serie.view();

				} else {

					System.out.println("..::: OPCIÓN NO VALIDA :::..");
				}

			} else if (index == 0) {

				exit = 0;

			} else {

				System.out.println("..::: OPCIÓN NO VALIDA :::..");
				exit = 1;

			}

		} while (exit != 0);

	}

	public static void showChapters() {

		int exit = 0;

		do {

			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();

		} while (exit != 0);
	}

	static ArrayList<Book> books = Book.makeBookList();

	public static void showBooks() {

		int exit = 1;

		do {

			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();

			for (int i = 0; i < books.size(); i++) {

				System.out.println((i + 1) + ". " + books.get(i).getTittle() + ", Visto: " + books.get(i).isChecked());

			}
			System.out.println("0. Regresar al menú");
			System.out.println();

			System.out.println("Selecciones un libro:");
			Scanner scanner = new Scanner(System.in);
			int index = scanner.nextInt();

			if (index > 0) {

				Book book = books.get(index - 1);
				book.view();

			} else if (index == 0) {

				exit = 0;

			} else {

				System.out.println("..::: OPCIÓN NO VALIDA :::..");
				exit = 1;

			}

		} while (exit != 0);

	}

	public static void showMagazines() {

		int exit = 1;
		ArrayList<Magazine> magazines = Magazine.makeMagazineList();

		do {

			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();

			for (int i = 0; i < magazines.size(); i++) {

				System.out.println((i + 1) + ". " + magazines.get(i).getTittle());

			}
			System.out.println("0. Regresar al menú");
			System.out.println();

			System.out.println("Selecciones un Magazine:");
			Scanner scanner = new Scanner(System.in);
			int index = scanner.nextInt();

			if (index > 0 && index <= magazines.size()) {

				System.out.println("Excogió: " + magazines.get(index).toString());

			} else if (index == 0) {

				exit = 0;

			} else {

				System.out.println("..::: OPCIÓN NO VALIDA :::..");
				exit = 1;

			}

		} while (exit != 0);

	}

	public static void makeReport() {

		Report report = new Report();
		report.setNameFile("Reporte");
		report.setTittle("::: VISTOS :::");
		report.setExtension("txt");

		for (Movie movie : movies) {

			report.setContent(movie + "\n");
		}

		report.makeReport();

	}

	public static void makeReportWithDate() {

		System.out.println("Digite una fecha para el reporte: ");
		Scanner scanner = new Scanner(System.in);
		String reportDate = scanner.next();

		ArrayList<Movie> viewedMovies = Movie.makeReport(reportDate);
		Report report = new Report();
		report.setNameFile("Reporte -" + reportDate);
		report.setTittle("::: VISTOS :::");
		report.setExtension("txt");
		String content = "";
		for (Movie movie : viewedMovies) {

			if (movie.isViewed()) {

				content += movie + "\n";
			}
			report.setContent(content);
		}
		report.makeReport();
	}

}
