package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int opcion=0;
			
			System.out.println("1)Pintar cuadro");
			System.out.println("2)Validar email");
			System.out.println("3)Añadir alumno");
			System.out.println("4)Salir");
			System.out.println("Introduce una opcion");
			opcion=entrada.nextInt();
			switch(opcion) {
				
			case 1:	System.out.println("Menu de pintar cuadro");
				
				break;
			case 2: System.out.println("Menu de validar email");
				break;
				
			case 3:System.out.println("Menu Añadir alumno");
				break;
			case 4:System.out.println("Ha salido");
				break;
			default:
				System.out.println("Se a equivocado");
				break;
			}
		
		

	}

}
