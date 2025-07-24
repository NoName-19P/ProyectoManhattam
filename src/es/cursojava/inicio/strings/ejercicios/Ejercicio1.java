package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio1 {
//Escribe un programa que reciba un String y devuelva el texto invertido.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Hola";
		// String cadena_invertida="";

		for (int i = cadena.length() - 1; i >= 0; i--) {// siempre para acceder a la ultima posic es .lenght -1

			System.out.print(cadena.charAt(i));
			// cadena_invertida += texto.charAt(i);

		}
		//se generan 7 objetos
		// System.out.println(cadena_invertida);
		String cadena2 = "Hola" + "que" + "tal" + "estas";
		System.out.println(cadena2);
		
		//se genera 1 objeto
		StringBuilder sb = new StringBuilder();
		sb.append("Hola");
		sb.append("que");
		sb.append("tal");
		sb.append("estas?");
		System.out.println(sb);//en un objeto guardas todo
		String cadena3 = sb.toString();
		System.out.println(sb.reverse());
	}

}
