package es.cursojava.inicio.ejercicios;


import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int numero=0;
		boolean esMayor= 100<numero;
		boolean esMayor2=0.5<Math.random();

		
		
		System.out.println("Introduce el nombre de la calle");
		String nombre_calle=entrada.nextLine();
		System.out.println("Introduce numero de la calle");
		numero=entrada.nextInt();
		System.out.println("Introduce la poblacion");
		entrada=new Scanner (System.in);
		String poblacion=entrada.nextLine();
		
		System.out.println("Nombre: "+nombre_calle+"\n"+"Numero: "+numero+"\n"+"Poblacion: "+poblacion);
		System.out.println("La calle es grande "+esMayor);
		System.out.println("el numero que se genera es "+esMayor2);
		System.out.println(numero%2==0);//es 0 el resto , esto se usa para saber si es par o 
		numero =numero+1;
		numero +=1;
		

	}

}
