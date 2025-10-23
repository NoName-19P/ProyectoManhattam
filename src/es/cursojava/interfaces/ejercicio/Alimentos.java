package es.cursojava.interfaces.ejercicio;

import es.cursojava.interfaces.ejercicio.interfaces.Consultable;

public abstract class Alimentos extends Producto implements Consultable{

	private String fechaCaducidad;



	public Alimentos(String nombre, double precio, int id, String fechaCaducidad) {
		super(nombre, precio, id);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
	
		
	
	
	
}
