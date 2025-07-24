package es.cursojava.metodos;

import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio3 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce la base del rectangulo");
		int base = entrada.nextInt();
		System.out.println("Introduce la altura del rectangulo");
		int altura = entrada.nextInt();

		System.out.println(Arrays.toString(calcular_rectangulo(base,altura)));
		//System.out.println(calcularrectangulo(base,altura));

	}

	public static double[] calcular_rectangulo(int base, int altura) {

		// System.out.println("El area del rectangulo es "+altura*base);
		int result1 = altura * base;

		// System.out.println("El perimetro es "+2*(base+altura));
		int result2 = 2 * (base + altura);

		double result3 = Math.sqrt(base + altura);

		double[] numeros = { result1, result2, result3 };

		return numeros;
	}

	public static String calcularrectangulo(int base, int altura) {

		// System.out.println("El area del rectangulo es "+altura*base);
		int result1 = altura * base;

		// System.out.println("El perimetro es "+2*(base+altura));
		int result2 = 2 * (base + altura);

		double result3 = Math.sqrt(base + altura);
		

		String cadena= "El area es "+result1+" El perimetro es "+result2+" La diagonal es "+result3;

		return cadena;
	}

}
