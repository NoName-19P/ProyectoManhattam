package es.cursojava.metodos;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres =  { "Carlos", "Asssdst" };

		int contador = cont_nombres(nombres);
		System.out.println("Hay " + contador + " nombre que empieza por la A y contiene la t");

	}

	public static int cont_nombres(String[] nombres) {

		int cont = 0;

		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].startsWith("A") && nombres[i].contains("t")) {
				cont++;

			}

		}
		return cont;
	}

}
