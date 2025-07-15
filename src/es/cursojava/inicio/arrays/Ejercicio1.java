package es.cursojava.inicio.arrays;

import java.util.Scanner;

public class Ejercicio1 {
////solicitar el numero de alumnos  q hay en una clase
//	Solicitar el número de alumnos que hay en una clase
//	Por cada alumno pedir su nota y la guardas en una posición del array
//
//	Con la información almacenada en el array indicar:
//	+ cuantos alumnos han aprobado
//	+ nota media de todos los alumnos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce número de alumnos");
		Scanner scan = new Scanner(System.in);
		int numAlumnos = scan.nextInt();
		
		double [] notas = new double [numAlumnos];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota del alumno"+ (i+1));
			scan = new Scanner(System.in);
			double nota = scan.nextDouble();
			notas[i] = nota;
		}
		
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println(notas[i]);
//			
//		}
		
		int contadorAprobados = 0;
		double totalNotas = 0;
		for ( double nota : notas ) {
			//System.out.println(nota);
			if (nota>=5) {
				contadorAprobados++;
			}
			totalNotas += nota;
		}
		System.out.println("El número de alumnos aprobados es de: "+contadorAprobados);
		System.out.println("La media de todas las notas es: "+ totalNotas/notas.length);

	}

	

}
