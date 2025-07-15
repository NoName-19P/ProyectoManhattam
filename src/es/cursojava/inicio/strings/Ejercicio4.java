package es.cursojava.inicio.strings;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribe un programa que reciba un String con varias palabras separadas por espacios y determine cuál es la palabra más larga.

		 */
		
		
		String frase="En un lugar de la Mancha de cuyo nombre no puedo acordarme";
		
		
		
		while(frase.contains(" ")) {
		
		int posicionBlanco=frase.indexOf(" ");
		String palabra=frase.substring(0,posicionBlanco);
		System.out.println(palabra);
		frase=frase.substring(posicionBlanco+1);
		System.out.println(frase);
		
		}
		

	}

}
