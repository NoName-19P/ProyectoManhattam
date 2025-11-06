package es.cursojava.lombok;

public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Botella botella =new Botella(1200.0,"vidrio","botella","cerveza");
		System.out.println(botella);
		Botella b2 =Botella.builder().capacidad(300).contenido("vino").build();
	}

}
