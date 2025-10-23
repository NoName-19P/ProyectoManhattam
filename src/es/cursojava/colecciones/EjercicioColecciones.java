package es.cursojava.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

import es.cursojava.oo.Alumno;

public class EjercicioColecciones {
	static Scanner sc = new Scanner(System.in);

	/*
	 * 1. Creamos 6 alumnos
	 * 
	 * 2. Los metemos todos en una lista
	 * 
	 * 3. Creamos un método para mostrar la info de todos los alumnos
	 * 
	 * 4. Creamos un método para mostrar el nombre y la nota todos los alumnos cuya
	 * nota media sea >9
	 * 
	 * 5. Otro método el cual se preguntará por el nombre de un alumno y os dará la
	 * notaMedia de todos los alumnos que se llamen igual
	 * 
	 * 6. (Último que se hace)Eliminar los alumnos que esten suspensos de la lista
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno> lista = new ArrayList<>();
		String[] asignaturas = new String[3];

		Alumno a1 = new Alumno("a", null, 4, asignaturas);
		Alumno a2 = new Alumno("b", null, 1, asignaturas);
		Alumno a3 = new Alumno("c", null, 7, asignaturas);
		Alumno a4 = new Alumno("d", null, 0, asignaturas);
		Alumno a5 = new Alumno("e", null, 0, asignaturas);
		Alumno a6 = new Alumno("f", null, 0, asignaturas);

		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);

		mostrarinfo(lista);
		mostrarNotaMedia(lista);
		mostrarNotaMediaPorNombre(lista);
		eliminar(lista);

	}

	private static void insertarDatos(ArrayList<Alumno> lista, String[] asignaturas) {

		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce nombre");
			String nombre = sc.next();
			System.out.println("Introduce dni");
			String dni = sc.next();
			System.out.println("Introduce nota media");
			int media = sc.nextInt();

			for (int j = 0; j < asignaturas.length; j++) {
				System.out.println("Introduce asignaturas");
				String asignatura = sc.next();
				asignaturas[j] = asignatura;

			}

			Alumno alumno = new Alumno(nombre, dni, media, asignaturas);
			lista.add(alumno);
			System.out.println("Introduce asignaturas");
		}

	}

	private static void mostrarinfo(ArrayList<Alumno> lista) {

		for (Alumno alumno : lista) {
			System.out.println(alumno.toString());

		}

	}

	private static void mostrarNotaMedia(ArrayList<Alumno> lista) {

		for (Alumno alumno : lista) {
			if (alumno.getNota_media() > 9) {
				System.out.println(alumno.getNombre() + " tiene una nota media de " + alumno.getNota_media());
			}
		}
	}

	private static void mostrarNotaMediaPorNombre(ArrayList<Alumno> lista) {

		System.out.println("Introduce el nombre");
		String nombreAconsultar = sc.next();
		double notasAlumnos = 0;
		int contador = 0;
		for (Alumno alumno : lista) {
			if (alumno != null && nombreAconsultar != null && alumno.getNombre().equals(nombreAconsultar)) {
				notasAlumnos += alumno.getNota_media();
				contador++;
			}

		}
		System.out.println("La nota media de todos los alumnos llamados " + nombreAconsultar
				+ " tiene una nota media de " + notasAlumnos / contador);

	}

	private static void eliminar(ArrayList<Alumno> lista) {
//		for(int i=0;i<lista.size();i++){
//			if(lista.get(i).getNota_media()<5) {
//			lista.remove(i);			}
//			
//		}
//		
		for (int i = lista.size() - 1; i >= 0; i--) {
			if (lista.get(i).getNota_media() < 5) {
				lista.remove(i);
			}

		}

	}

}
