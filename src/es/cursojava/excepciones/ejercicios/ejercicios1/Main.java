package es.cursojava.excepciones.ejercicios.ejercicios1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Alumno> alumnos = new ArrayList<>();

		System.out.println("Añadir alumnos");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Alumno " +i);
			try {
				System.out.print("Nombre: ");
				String nombre = sc.nextLine();

				System.out.print("Edad: ");
				int edad = Integer.parseInt(sc.nextLine());

				System.out.print("Nota: ");
				double nota = Double.parseDouble(sc.nextLine());

				Alumno alumno = new Alumno(nombre, edad, nota);
				alumnos.add(alumno);
				System.out.println("Alumno registrado correctamente.");
				//Si ocurre un error, muestra un mensaje pero sigue con el siguiente alumno.

			} catch (IllegalArgumentException e) {
				System.out.println("error: " + e.getMessage());
			} catch (NotaInvalidaException e) {
				System.out.println("error penultimo: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("error final: " + e.getMessage());
			}
		}

		System.out.println("Lista de alumnos insertado=");
		for (Alumno a : alumnos) {
			System.out.println(a);
		}

		sc.close();
	
	}
}

