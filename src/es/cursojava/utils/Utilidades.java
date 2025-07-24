package es.cursojava.utils;

import java.util.Scanner;

public class Utilidades {

	static Scanner entrada = new Scanner(System.in);

	public static int menu(String[] menu) {

		String[] menu_array = { "1)Pintar tablero", "2)Validar email", "3)Eliminar email", "4)Salir" };
		for (int i = 0; i < menu_array.length; i++) {

			System.out.println(menu_array[i]);
		}
		System.out.println("Introduce una opcion");
		int opcion = entrada.nextInt();
		return opcion;

	}

	public static void menu(String[] menu, String cadena) {

		menu(menu);

		System.out.println(cadena);

	}

	public static int pide_dato_numerico(String texto) {

		System.out.println(texto);

		System.out.println("Introduce un dato numerico");
		int numerico = entrada.nextInt();

		return numerico;
	}

	public static String pide_dato_cadena(String texto) {

		System.out.println("Introduce una cadena");
		texto = entrada.next();
		return texto;

	}

	public static void pintar_tablero() {
		String aster = "*";
		String espacio = " ";
		System.out.println("MENU PINTAR TABLERO");
		System.out.println("Introduce el lado de un cuadrado");
		int lado = entrada.nextInt();
		for (int i = 1; i <= lado; i++) {

			for (int j = 1; j <= lado; j++) {

				if (i == 1 || i == lado || j == 1 || j == lado) {
					System.out.print(aster + " ");

				} else

					System.out.print(espacio + " ");

			}

			System.out.println();
		}
	}

	public static void validar_email() {
		String email = "  email.correo@asdas.es     ";
		String mensajeError = "";
		
		email = email.trim();
		
		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		}else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}
			
			if (!email.contains("@")) {
				mensajeError += "El email no tiene arroba\n";
			}
			else if (email.indexOf("@")!=email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			}else {
				String dominio = email.substring(email.indexOf("@")+1);
				System.out.println("dominio: "+dominio);
				
				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				}else {//Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto <2 ) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}
					
					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length()-1;
					if (longitudDominio - posicionUltimoPunto<2 ||
							longitudDominio - posicionUltimoPunto>6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}
				
				
			}
		
		}
		
		
		
		
		
		if (mensajeError.isEmpty()) {
			System.out.println("El email "+ email +" es valido");
		}else {
			System.out.println(mensajeError);
		}

	}
}
