package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Menu {
	static int opcion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String aster = "*";
		String espacio = " ";
		do {
			System.out.println("******** MENU TABLERO **********");
			System.out.println("1)Pintar tablero");
			System.out.println("2)Validar email");
			System.out.println("3)Añadir alumno");
			System.out.println("4)Salir");
			System.out.println("Introduce una opcion");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("MENU PINTAR TABLERO");
				System.out.println("Introduce el lado de un cuadrado");
				int lado = entrada.nextInt();
				for (int i = 1; i <= lado; i++) {
						//System.out.println("i vale"+i);
					for (int j = 1; j <= lado; j++) {
						//System.out.println("j vale "+j);
						// if(j==2)
						
						
						//i vertical   //j horizont
						// 1 2 3 4
						// 2
						// 3
						// 4

						if (  i == 1 || i == lado || j == 1 || j ==lado) {
							System.out.print(aster+" ");

						} else

							System.out.print(espacio + " ");

					}

					System.out.println();
				}
				break;
			case 2:
				System.out.println("MENU VALIDAR EMAIL");
				break;
			case 3:
				System.out.println("MENU AÑADIR ALUMNO");
				break;

			}

		} while (opcion != 4);
		System.out.println("Has salido");
	}

}
