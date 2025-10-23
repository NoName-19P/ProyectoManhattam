package es.cursojava.interfaces.ejercicio.oo;

import es.cursojava.interfaces.ejercicio.Alimentos;

public class Vino extends Alimentos {
	private String tipo;

	public Vino(String nombre, double precio, int id, String fechaCaducidad, String tipo) {
		super(nombre, precio, id, fechaCaducidad);
		this.tipo = tipo;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Vino [tipo=" + tipo + "]";
	}
	
	
	

}
