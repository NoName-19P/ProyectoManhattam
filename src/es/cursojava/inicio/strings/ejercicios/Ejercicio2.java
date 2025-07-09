package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio2 {
//Escribe un programa que determine si un String ingresado por el usuario es un palíndromo 
//(se lee igual de izquierda a derecha que de derecha a izquierda, ignorando mayúsculas y espacios).
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Anita lava la tina";
		String palabra = frase.toLowerCase().replace(" ", "");
		
		String palabraInvertida = "";
		
//		for ( int i=palabra.length()-1  ; i >= 0 ;  i-- ) {
//			//System.out.print(texto.charAt(i));
//			palabraInvertida += palabra.charAt(i);
//		}
//		System.out.println("Palabra invertida: "+palabraInvertida);
//		if (palabra.toLowerCase().equals(palabraInvertida.toLowerCase())) {
//			System.out.println("Es palindromo");
//		}

		boolean esPalindromo=true;
		for (int i=0, j=palabra.length()-1 ; i<palabra.length()/2 ; i++,j--) {
			char char1 = palabra.charAt(i);
			char char2 = palabra.charAt(j); 
			
			if (char1!=char2) {
				System.out.println("La palabra "+ palabra+ " no es palíndromo");
				esPalindromo=false;
				break;
			}
		}
		
		if(esPalindromo) {
			System.out.println("La frase "+ frase+ " es palíndromo");
		}
	}

}
