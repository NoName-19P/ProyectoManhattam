package es.cursojava.metodos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el numero de l tabla de multiplicar q quieres mostrar");
		int numero = entrada.nextInt();
		multiplicar(numero);
		
		
		System.out.println("Introduce los numeros de la tabla de multiplicar q quieres mostrar");
		int valor1=entrada.nextInt();
		int valor2=entrada.nextInt();
		multiplicar(valor1,valor2);
	}

	public static void multiplicar(int numero) {

	
		System.out.println("Tabla del "+numero);
		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + "x" + i + "= " + numero * i);

		}

	}

	public static void multiplicar(int valor1, int valor2) {

		for(int i=valor1;i<=valor2;i++) {
			multiplicar(i);
		}
		

	}

}
