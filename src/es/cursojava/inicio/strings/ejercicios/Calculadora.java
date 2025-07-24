package es.cursojava.inicio.strings.ejercicios;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(args.length);
		if (args.length < 3) {

			System.out.println("Necesarios minimos 3 datos ");

		} else {

			System.out.println("Estas dentro");
			String operacion=args[0];
			System.out.println("Se va a realizar la "+operacion+ " de: ");
			
			int resultado=Integer.parseInt(args[1]);
			
			for (int i = 2; i < args.length; i++) {
				System.out.println(args[i]);
				int numero= Integer.parseInt(args[i]);
					
				if(operacion.equalsIgnoreCase("suma")) {
					resultado+= numero;
					
				}else if(operacion.equalsIgnoreCase("resta")) {
					resultado-=numero;
					
				}else if(operacion.equalsIgnoreCase("Multiplicacion")) {
					resultado *=numero;
				}else {
					System.out.println("Operacion no permitida");
					break;
				}
				

			}
			
			System.out.println("El resultado es: "+resultado);
		}
	}

}
