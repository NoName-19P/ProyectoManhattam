package es.cursojava.inicio.arrays;

import java.util.Scanner;

//Solicitar el número de alumnos que hay en una clase
//Por cada alumno pedir su nota y la guardas en una posición del array
//
//Con la información almacenada en el array indicar:
//+ cuantos alumnos han aprobado
//+ nota media de todos los alumnos
//
//
//Ejercicio Colegio-Alumnos
//==============================================================
//Colegio con 2 aulas y 3 puestos en cada aula
//
//1. Insertar Alumnos -> Va a solicitar el nombre de los alumnos para las aulas que tengan puestos disponibles
//2. Mostrar Alumnos -> Muestra los alumnos por aula, si un puesto no tiene alumno, mostrar (vacio)
//3. Buscar Alumno -> Solicitar texto, Ju, mostrar aula y puesto en el que se encuentra el alumno que contenga el texto introducido
//4. Borrar Alumno -> Solcitar nombre, y se borra a todos los alumnos que tengan ese nombre.
//5. Salir

public class MenuAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String[][] alumnos = new String[2][2];
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Menu Clase");
			System.out.println("1)Insertar alumno");
			System.out.println("2)Mostrar alumno");
			System.out.println("3)Buscar alumno");
			System.out.println("4)Eliminar");
			System.out.println("5)Salir");
			System.out.println("Introduce una opcion");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				boolean hayhueco = false;
				for (int i = 0; i < alumnos.length; i++) {
					for (int j = 0; j < alumnos[i].length; j++) {
						if (alumnos[i][j] == null) {
							System.out.println("Introduce el nombre del alumno q quieras guardar en el aula " + i
									+ " en el puesto " + j);
							String nombre = sc.next();
							alumnos[i][j] = nombre;
							hayhueco = true;
						}

					}

				}
				if (!hayhueco) {
					System.out.println("No hay puestos");
				}

//				
				break;

			case 2:
				for (int i = 0; i < alumnos.length; i++) {
					for (int j = 0; j < alumnos[i].length; j++) {

						if (alumnos[i][j] == null) {

							System.out.println("Vacio");

						} else {
							System.out.println(alumnos[i][j]);
						}

					}

				}

				break;

			case 3:
				boolean existe = false;
				System.out.println("Introduce el nombre del alumno q quieress buscar");
				String buscar = sc.next();
				for (int i = 0; i < alumnos.length; i++) {
					for (int j = 0; j < alumnos[i].length; j++) {
						if (alumnos[i][j].contains(buscar)) {
							System.out.println("El alumno " + alumnos[i][j] + " se encuentra en el aula " + i
									+ " y en el puesto " + j);
							existe = true;

						}
					}

				}
				if (!existe) {
					System.out.println("No existe el alumno");
				}

				break;

			case 4:
				boolean existe2 = false;
				System.out.println("Introduce el nombre del alumno q quieres eliminar");
				String nombre_borrar = sc.next();

				for (int i = 0; i < alumnos.length; i++) {
					for (int j = 0; j < alumnos[i].length; j++) {
						if (alumnos[i][j].equalsIgnoreCase(nombre_borrar)) {
							alumnos[i][j] = null;
							System.out.println("Alumno eliminado correctamente");
							existe2 = true;

						}
					}
				}

				if (!existe2) {
					System.out.println("No existe el alumno q quieres eliminar");
				}
				break;

			}

		} while (opcion != 5);
		System.out.println("Has salido");
	}

}
