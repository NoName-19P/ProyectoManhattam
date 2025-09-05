package es.cursojava.oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clase {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] asignaturas = new String[2];
		ArrayList<Alumno> almacen = new ArrayList<>();

		int opcion = 0;

		do {

			opcion = menu(args);

			switch (opcion) {

			case 1:
				ingresardatos(asignaturas, almacen);

				break;

			case 2:

				break;

			case 3:
				mostrardatos(asignaturas, almacen);

				break;

			case 4:
				System.out.println("Has salido");
				break;

			}

		} while (opcion != 4);


	}

	public static int menu(String[] menu) {

		String[] menu_array = { "1)Ingresar datos", "2)Modifiar datos", "3)Mostrar datos", "4)Salir" };
		for (int i = 0; i < menu_array.length; i++) {

			System.out.println(menu_array[i]);
		}
		System.out.println("Introduce una opcion");
		int opcion = sc.nextInt();
		return opcion;

	}

	public static void ingresardatos(String[] asignaturas, ArrayList<Alumno> almacen) {

//		

		// TODO Auto-generated method stub
		System.out.println("Introduce nombre");
		String nombre = sc.next();

		System.out.println("Introduce tu dni");
		String dni = sc.next();

		System.out.println("Introduce la nota media");
		int media = sc.nextInt();
	

		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println("introduce las asignaturas que quieres cursar");

			String asignatura = sc.next();

			asignaturas[i] = asignatura;
		}

		// Alumno alumno1=new Alumno(nombre,dni);
		Alumno alumno2 = new Alumno(nombre, dni, media, asignaturas);
		almacen.add(alumno2);

	}

	public static void mostrardatos(String[] asignaturas, ArrayList<Alumno> almacen) {
		for (int i = 0; i < almacen.size(); i++) {
			System.out.println(
					"[nombre:[" + almacen.get(i).getNombre() + "]   dni:[" + almacen.get(i).getDni() + "]   media:["
							+ almacen.get(i).getNota_media() + "]   asignaturas:" + Arrays.toString(asignaturas));

		}
	}
	
	public static void modificarDatos(ArrayList<Alumno>almacen) {
		
		
		
		if(existeAlumno(almacen)==true) {
			
			System.out.println("Introduce la nueva nota media");
			int mediaNueva=sc.nextInt();
			
			for(int i=0;i<almacen.size();i++) {
				
				
			}
			
			
			
		}else {
			System.out.println("No existe el alumno");
		}
		
//		System.out.println("Introduce la nota nueva del alumno");
//		int notaNueva = sc.nextInt();
//
//		for (int i = 0; i < almacen.size(); i++) {
//			almacen.get(i).setNota_media(notaNueva);
//			System.out.println(
//					"[nombre:[" + almacen.get(i).getNombre() + "]   dni:[" + almacen.get(i).getDni() + "]   media:["
//							+ almacen.get(i).getNota_media() + "]   asignaturas:" + Arrays.toString(asignaturas));
//
//		}

		// System.out.println(almacen);

		/// Alumno alumno1=new Alumno("Luis","abcdcd");

		// Alumno alumno3=new Alumno();

//		
//		String cadena= alumnos[(int) (Math.random() * 3)];
//		String [] alumnosAle= {cadena};
//		
//		
//		
//		
//		alumno1.setNombre("Luis");
//		alumno1.setNota_media(5);
//		alumno1.setAsignaturas(alumnosAle);
//	
//		alumno1.estudiar();
		
	}
	
	
	public static boolean existeAlumno(ArrayList<Alumno>almacen) {
		
		System.out.println("Introduce el alumno para verificar que existe");
		String nombre=sc.next();
		
		
		for(int i=0;i<almacen.size();i++) {
			if(almacen.get(i).getNombre().equals(nombre)) {
				System.out.println("El alumno existe");
			}
		
		
		}
		
		return false;
	}

}
