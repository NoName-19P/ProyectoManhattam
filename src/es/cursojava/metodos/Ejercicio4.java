package es.cursojava.metodos;

import java.util.Scanner;

import es.cursojava.utils.Utilidades;

public class Ejercicio4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		Utilidades.menu(args);
		System.out.println("----------------------------------------------");
		System.out.println("Introduce una cadena");
		String cadena=entrada.next();
		Utilidades.menu(args,cadena);
		System.out.println("-----------------------------------------------");
		System.out.println("Introduce cadena");
		String cadena2=entrada.next();
		System.out.println(Utilidades.pide_dato_numerico(cadena2));;
		System.out.println("-----------------------------------------------");
		System.out.println("Introduce otra cadena");
		String cadena3=entrada.next();
		System.out.println(Utilidades.pide_dato_cadena(cadena3));
		
		
		
		
	}

}
