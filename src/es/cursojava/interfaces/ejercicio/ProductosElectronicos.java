package es.cursojava.interfaces.ejercicio;

import es.cursojava.interfaces.ejercicio.interfaces.Apagable;
import es.cursojava.interfaces.ejercicio.interfaces.Consultable;
import es.cursojava.interfaces.ejercicio.interfaces.Encendible;
import es.cursojava.interfaces.ejercicio.interfaces.Insertable;
import es.cursojava.interfaces.ejercicio.interfaces.Updatable;

public abstract class ProductosElectronicos extends Producto
		implements Encendible, Apagable, Insertable, Consultable, Updatable {

	private String fechaFabricacion;

	public ProductosElectronicos(String nombre, double precio, int id, String fechaFabricacion) {
		super(nombre, precio, id);
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public void encender() {
		System.out.println("Producto electronico " + getNombre() + " encendido");
	}

	public void apagar() {
		System.out.println("Producto electronico " + getNombre() + " apagado");

	}

	

}
