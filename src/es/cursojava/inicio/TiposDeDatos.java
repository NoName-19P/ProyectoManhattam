package es.cursojava.inicio;

import java.util.Scanner;

public class TiposDeDatos {

	public static void main(String[] args) {
		//tipos primitivos
		
		
		//*****enteros
		int numero=2300;
		byte edad=10; //8  -128  127
		short numero2=123; //16  -32.768  32.767
		long numero3=1890; //64  
		//*****decimales
		double decimal1=9.7;
		float decimal2=100.9f;
		//caracteres
		char caracter='a';
		//booleanos
		boolean esMayorEdad=false;
		boolean esMayorEdad2=7>3;
		
		
		
		//tipos objetos
		String nombre="Jose Luis";//un String es una clase q a creado java
		nombre.toUpperCase();// se puede trabajr con el nombre. debido a que el tipo de datos es un String que es una clase.
		Scanner entrada=new Scanner(System.in);
		System.out.println(Math.random());
		System.out.println("Introduce tus apellidos");
		String apellido=entrada.next();
		System.out.println("Introduce altura");
		double altura=entrada.nextDouble();
		System.out.println(nombre + " "+apellido);
		
		//clases q estan en javalang no hace falta importar, el string no esta en javalang por eso no se importa
		
	}
   
}
