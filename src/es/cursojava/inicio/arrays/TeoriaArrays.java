package es.cursojava.inicio.arrays;

import java.util.Arrays;

public class TeoriaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enteros==0
		//boleanos==false
		//string==null
		String [] colores= new String[4];
		colores[0]="Azl";
		colores[1]="Verde";
		colores[colores.length-1]="Naranja";
		System.out.println(colores[colores.length-1]);
		
		double[] notas=new double[15];
		System.out.println(notas[0]);
		
		int[] numeros = {7,4,2,4,5,29};
		System.out.println(Arrays.toString(numeros));
		
		
		
		

	}

}
