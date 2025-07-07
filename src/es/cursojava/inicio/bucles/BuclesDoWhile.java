package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class BuclesDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		String respuesta="";
		int cont=0;
		
		
		do {
			System.out.println("Hola");//ejecuta la condicion una vez (do)
			
			System.out.println("Quieres continuar");
			respuesta=entrada.nextLine();
			
			//cont++;//si el cont va antes de el if, imprime 2 veces, si en cambio el if va antes, imprime 3
			
			System.out.println(cont);
			if(cont==2) {
				break;
			}//else {
				//continue;romple el bucle, actua como una llave, vuelve a empezar,transformael cont++ en un codigo muerto
			//}
			cont++;
			
		}while(respuesta.equals("si"));
		System.out.println("Termina");

	}

}
