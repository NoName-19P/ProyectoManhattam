package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		// TODO Auto-generated method stub
		int cont3=0;
		int cont5=0;
		for(int i=0;i<10;i++) {
			System.out.println("Introduce un numero");
			int numero=entrada.nextInt();
			
			
			if(numero%3==0) {
				cont3++;
				
			}
			
			if(numero%5==0) {
				cont5++;
			}
			
			
		}
		System.out.println("Multiplos de 3 "+cont3);
		System.out.println("Multiplos de 5 "+cont5);
	}

}
