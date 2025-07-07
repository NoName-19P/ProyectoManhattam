package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero por teclado");
		int numero=entrada.nextInt();
		
		if(numero%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}

	}

}
