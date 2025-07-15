package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class EjercicioEmail {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * Validaciones: + Que no tenga espacios en blanco + Que tenga @, solo 1 + Que
		 * después de la @ tenga al menos un punto + Que entre la @ y el punto a su
		 * derecha haya una separación de dos caracateres + Que despues del último punto
		 * haya entre 2 y 6 caracteres
		 */

		Scanner entrada = new Scanner(System.in);
		String email = "";
//		boolean EsBlanco=false;

		boolean unArroba = false;
		boolean unEspacio = false;
		boolean hayPunto = false;

//		

		do {

			System.out.println("Introduce un email valido");
			email = entrada.nextLine();

			int cont_arroba = 0;
			int cont_espacio = 0;

			// controlar solo hay un arroba
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					cont_arroba++;

				}
			}
			System.out.println(cont_arroba);
			if (cont_arroba == 1) {
				System.out.println("Solo hay un arroba");
				unArroba = true;
			} else {
				System.out.println("hay mas de un arroba");
			}

			// controlar no hay espacio en blanco

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == ' ') {
					cont_espacio++;
				}

			}
			System.out.println(cont_espacio);
			if (cont_espacio != 0) {
				System.out.println("Hay espacios en blanco");
				unEspacio = true;

			} else {
				System.out.println("No hay eapacios en blanco");
			}

			// controlar q entre el @ y el punto haya 2 caracteres
			int pos = email.indexOf("@") + 3;
			int pos_punto = email.lastIndexOf(".");

			if (pos_punto >= pos) {
				System.out.println("hay un punto en la pos" + pos);
				hayPunto = true;
			} else {
				System.out.println("No hay ningun punto");
			}

			// controlar q despues del ultimo punto hay entre 2 y 6 caracteres

			int pos_nueva = email.lastIndexOf(".");
//			System.out.println("hay un punto en la pos"+pos_nueva);
			int longitud = email.length();

			for (int i = pos_nueva+1; i < email.length(); i++) {

				if(email.charAt(i)>=2 && email.charAt(i)<=6) {
					System.out.println("ok");
					
				}else {
					System.out.println("error");
				}
				
			}

		} while (unArroba == false || unEspacio == true || hayPunto == false);
		System.out.println("Has salido,texto correcto");

	}

}
