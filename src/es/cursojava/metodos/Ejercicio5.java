package es.cursojava.metodos;

import java.util.Scanner;

import es.cursojava.utils.Utilidades;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int opcion=0;
		do {
			opcion=Utilidades.menu(args);
			

			switch (opcion) {
			case 1:
				Utilidades.pintar_tablero();
				break;
				
			case 2:
				Utilidades.validar_email();
				break;
				
			case 3:
				System.out.println("Menu eliminar mail");
				break;
				
			}

		} while (opcion != 4);
		System.out.println("Has salido");

	}

}
