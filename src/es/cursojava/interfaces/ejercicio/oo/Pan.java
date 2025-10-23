package es.cursojava.interfaces.ejercicio.oo;

import es.cursojava.interfaces.ejercicio.Alimentos;

public class Pan extends Alimentos {

	
	public Pan(String nombre, double precio, int id, String fechaCaducidad) {
		super(nombre, precio, id, fechaCaducidad);
		// TODO Auto-generated constructor stub
	}
	
	


	public void select() {
		System.out.println("Alimento "+getNombre()+"con id: "+getId()+" seleccionado correctamento");
		
	}

	
	

}
