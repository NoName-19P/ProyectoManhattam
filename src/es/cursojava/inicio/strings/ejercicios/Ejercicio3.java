package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio3 {
//Crea un programa que cuente cuántas vocales (a, e, i, o, u) tiene un String. Ignora las mayúsculas y minúsculas.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int contVocales=0;
		String cadena="HOlaE".toLowerCase();
		
		
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u') {
				contVocales++;
				
			}
			
			
		}
		
		System.out.println("La cadena tiene "+contVocales+" vocales");
		
	}

}
