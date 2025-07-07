package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 7. Solicitar por consola el numero de números de la serie de Fibonacci que se
		 * quieren mostrar Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
		 */

		Scanner entrada = new Scanner(System.in);

		int fib1 = 0;
		int fib2 = 1;

		System.out.println("Introduce el numero de la serie de Fibonacci que quieres mostrar");
		int numero_fib = entrada.nextInt();

		for (int i = 0; i <numero_fib; i++) {

			System.out.println(fib1);
			
			fib2 = fib1 +fib2;
			//1=0+1
			//1
			
			
			fib1=fib2-fib1;
			//    1=1-0
			
		
	

		}

	
	}

}
