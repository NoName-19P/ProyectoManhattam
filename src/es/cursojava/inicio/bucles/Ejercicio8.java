package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de tenistas");
		int numero = entrada.nextInt();

		int topTen = 0;
		for (int i = 0; i < numero; i++) {
			System.out.println("tenista " + (i + 1) + "en q puesto te encuestras");
			int puesto = entrada.nextInt();
			if (puesto <= 10) {
				topTen++;
			}

		}
		System.out.println("El numero de tenista en el top 10 es de "+topTen);
	}

}
