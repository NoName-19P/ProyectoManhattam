package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;

public class Bar {
	private String nombre;
	

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abrirBar();
		
	}
	
	private static void abrirBar() {
		Bar bar=new Bar("MonteCarlo");
		Huesped huesped = new Huesped("Marcos", "abcdef");
		Comensal comensal=new Comensal("Lucas",true);
		ClienteAsiduo clienteAsiduo=new ClienteAsiduo("Pedro","Chicki");
		
		tomarCafe(comensal);
		tomarCafe(clienteAsiduo);	
	}
	
	private static void tomarCafe(TomarCafe t) {
		t.mostrarInfo();
		TazaCafe taza=new TazaCafe(50, "expreso");
	
	}

}
