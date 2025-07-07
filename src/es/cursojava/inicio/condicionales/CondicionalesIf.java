package es.cursojava.inicio.condicionales;

public class CondicionalesIf {

	public static void main(String[] args) {
		int numero = 6;//(int)(Math.random()*10);
		
		System.out.println(numero);
		
		
		if(numero>=5) {
			System.out.println("El numero es mayor de 5");// si cumple alguna condicion, el resto ni se evaluan
		}else if(numero>=5 && numero<7) {
			System.out.println("El numero es mayor de 5 y menor q 7");
		}else if(numero>=2 || numero<5) {
			System.out.println("El numero es ");
		}else {
			System.out.println("El numero es menor de 5");
		}
	}

}
