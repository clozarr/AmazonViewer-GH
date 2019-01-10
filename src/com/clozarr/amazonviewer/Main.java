package com.clozarr.amazonviewer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int exit = 0;

		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			
			
			int respuesta = 0;
			
			switch(respuesta) {
			  
			   case 1:
				   System.out.println("Movies");
				   break;
			   case 2:
				   System.out.println("Series");
				   break;
			   case 3:
				   System.out.println("Books");
				   break;
			   case 4:
				   System.out.println("Magazines");
				   break;
				   
			   default:
			       System.out.println("Opción no válida");
			       break;
			}
			

		} while (exit != 0);

	}

}
