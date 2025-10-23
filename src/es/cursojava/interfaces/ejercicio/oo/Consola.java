package es.cursojava.interfaces.ejercicio.oo;

import es.cursojava.interfaces.ejercicio.ProductosElectronicos;
import es.cursojava.interfaces.ejercicio.interfaces.Apagable;
import es.cursojava.interfaces.ejercicio.interfaces.Encendible;

public class Consola extends ProductosElectronicos implements Encendible, Apagable {
//la clase objeto final o hija tiene que tener los metodos de encendible y pagable ya que no es abstracta
	private String generacion;

	public Consola(String nombre, double precio, int id, String fechaFabricacion, String generacion) {
		super(nombre, precio, id, fechaFabricacion);
		this.generacion = generacion;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public void encender() {
		System.out.println(getNombre() + " encendida correctamente");

	}

	public void apagar() {
		System.out.println(getNombre() + " apagada correctamente");

	}

	@Override
	public void select() {
		System.out
				.println("Producto electronico " + getNombre() + "con id: " + getId() + " seleccionado correctamente");
	}

	@Override
	public void insert() {
		System.out.println("Producto electronico " + getNombre() + "con id: " + getId() + " insetado correctamente");
	}

	@Override
	public void update() {
		System.out.println("Producto electronico " + getNombre() + "con id: " + getId() + " actualizado correctamente");

	}

	

}
