package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		System.out.println(numero);
		do {
			if (numero%2==0) {
				numero = numero/2;
			}else {
				numero = numero*3+1;
			}
			System.out.println(numero);
		}while(numero!=1);
	}

}
