package es.cursojava.inicio.strings;

public class FuncionesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Marta";
		String nombre2 = "Eva";
		String nombre3 = null;

		nombre3 = nombre2;
		nombre2 = nombre;
		nombre2.toUpperCase();
		String nombre4 = nombre3.toUpperCase();
		System.out.println(nombre4);
		System.out.println(nombre3.toUpperCase());
		
		System.out.println("=============================");
		System.out.println(nombre.charAt(nombre.length()-1));//devuelve la posc desde el final al principio
		System.out.println("Tenerife".toLowerCase().contains("te"));//devuelve un boolean
		System.out.println(nombre2.endsWith("va"));//boolean
		System.out.println(nombre2.startsWith("Ma"));//boolean
		String cadena="Esto es una prueba de Strings";
		System.out.println(cadena.indexOf("e"));//devuelve la posc de la e empezando desde la iz
		System.out.println(cadena.lastIndexOf("e"));//devuelve la posc de la e empezando desde la derec
		
		System.out.println(cadena.replace("a", "A"));
		
		cadena=" e r t ";//no e cmabado el string , sino q paunta a un nuevo objeto 
		System.out.println(cadena.isBlank());//la cadena debe tener solo espacios en blanco true o false
		System.out.println(cadena.isEmpty());//la cadean esta vacia true o false
		System.out.println("'"+cadena.strip()+"'");//quita los espacios en blanc
		System.out.println("'"+cadena.replace(" ","")+"'");//sustituye todos los espacios en blanco
		
		cadena= "Hola Mundo desde Getafe";
		System.out.println(cadena.substring(5));//apartir de la posicion 5 te va a pintar apartir de esa posc a lfinal // Mundo desde Getafe
		System.out.println(cadena.substring(5,12));//hasta la posciion 12 sin incluir la 12 Mundo d
		
		System.out.println(cadena.substring(cadena.lastIndexOf(" ")+1));//imprime desde el ultimpo espacio en blanco , como se puso +1 pues se quita
		
		
		
	}

}
