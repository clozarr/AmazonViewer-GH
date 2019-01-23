package com.clozarr.amazonviewer.util;

import java.util.Scanner;

public class AmazonUtil {

	public static int validateUserResponseMenu(int min, int max) {
		// Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);

		// Validar respuesta int
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opción válida1");
			System.out.println("Intenta otra vez1");
		}

		int response = sc.nextInt();

		// Validar rango de respuesta
		while (response < min || response > max) {
			// Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opción válida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

	public enum Day {

		MONDAY("LUNES"), TUESDAY("MARTES"), WEDNESDAY("MIERCOLES"), THURSDAY("JUEVES"), FRIDAY("VIERNES"),
		SATURDAY("SABADO"), SUNDAY("DOMINGO");

		String spanish;

		Day(String s) {
			this.spanish = s;
		}
		
		String getSpanish(){
			
			return this.spanish;
		}

	}

	public static void mostrarEnum() {

		System.out.println("Inglés: " + Day.MONDAY);
		System.out.println("Español: " + Day.MONDAY.getSpanish());

	}

}
