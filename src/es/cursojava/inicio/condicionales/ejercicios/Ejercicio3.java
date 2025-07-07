package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		String numero_1=entrada.nextLine();
		System.out.println("Introduce el segundo numero");
		String numero_2=entrada.nextLine();
		
		System.out.println("Que operacion quieres realizar: suma ,resta,multiplicacion o division");
		String opcion=entrada.nextLine();
		
		if(opcion.equalsIgnoreCase("suma")) {
			Integer numero_cast=Integer.parseInt(numero_1);
			Integer numero_cast2=Integer.parseInt(numero_2);
			//Integer resultado=Integer.parseInt(numero_1+numero_2);
			int resultado_suma=numero_cast+numero_cast2;
			System.out.println(resultado_suma);
			
		}
		if(opcion.equalsIgnoreCase("resta")) {
			Integer numero_cast=Integer.parseInt(numero_1);
			Integer numero_cast2=Integer.parseInt(numero_2);
			
			int resultado_resta=numero_cast - numero_cast2;
			System.out.println(resultado_resta);
		}
		if(opcion.equalsIgnoreCase("multiplicacion")) {
			Integer numero_cast=Integer.parseInt(numero_1);
			Integer numero_cast2=Integer.parseInt(numero_2);
			
			int resultado_mult=numero_cast * numero_cast2;
			System.out.println(resultado_mult);
			
		}
		if(opcion.equalsIgnoreCase("division")) {
			Integer numero_cast=Integer.parseInt(numero_1);
			Integer numero_cast2=Integer.parseInt(numero_2);
			
			int resultado_div=numero_cast / numero_cast2;
			System.out.println(resultado_div);
		
		}

	}

}
