package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero=entrada.nextInt();
		
		for(int i=1;i<=numero;i++) {
			System.out.println("tabla del "+i);
			for(int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+i*j);;
				//print()deja todo en la misma linea
				//println linea a linea
			}
			System.out.println();
		}

	}

}
