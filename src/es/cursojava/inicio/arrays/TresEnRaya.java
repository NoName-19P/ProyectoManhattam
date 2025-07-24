package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class TresEnRaya {
	static int opcion = 0;
	static String[][] tablero = new String[3][3];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			menu();
			switch (opcion) {
			case 1:
				tablero();
				break;

			case 2:
				jugador1();
				break;

			case 3:
				if (hasganado() == true) {
					System.out.println("Has ganado");
				} else {
					System.out.println("Has perdido");
				}

			}

		} while (opcion != 5);

	}

	public static void tablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == null) {
					
					System.out.print("0");
					if (j < tablero.length - 1) {
						System.out.print(" | ");
					}

				} else {
					System.out.print(tablero[i][j]);
					if (j < tablero.length - 1) {
						System.out.print(" | ");
					}

				}
			}
			System.out.println();
			if (i < tablero.length - 1)
				System.out.println("--+---+---");

		}

	}

	public static void menu() {
		System.out.println("****** Menu Tres En Raya ******");
		System.out.println("1)Pintar tablero");
		System.out.println("2)Jugador vs Jugador");
		System.out.println("3)Has ganado");
		System.out.println("4)Salir");
		System.out.println("Introduce la opcion q quieras jugar");
		opcion = sc.nextInt();

	}

	public static void jugador1() {
		int pos = 0;
		boolean hay_espacio=false;

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				
				
				if (tablero[i][j] == null) {
					System.out.println("Introduce la posicion en el tablero que quieras marcar");
					pos = sc.nextInt();

					if ((pos >= 0 && pos < 3) && (i == 0)) {
						tablero[i][pos] = "X";
					}
					if ((pos >= 3 && pos < 6) && (i == 1)) {
						pos = pos - 3;
						tablero[i][pos] = "X";
					}
					if ((pos >= 6 && pos < 9) && (i == 2)) {
						pos = pos - 6;
						tablero[i][pos] = "X";
					}
					if (pos < 0 || pos > 8) {
						System.out.println("Valor fuera de rango");
					}
					hay_espacio=true;

				}else{
					
				}
				
			}

		}
		if(!hay_espacio) {
			System.out.println("Todos los espacios estan llenos");
		}

	}

	public static boolean hasganado() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if ((i == 0 || i == 1 || i == 2)
						&& (tablero[i][0].equals("X") && tablero[i][1].equals("X") && tablero[i][2].equals("X"))) {
					System.out.println("has entradado");
					return true;
				}
			}
		}

		return false;
	}

}
