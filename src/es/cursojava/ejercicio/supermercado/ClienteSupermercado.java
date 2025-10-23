package es.cursojava.ejercicio.supermercado;

import java.util.List;

import es.cursojava.herencia.hospital.Persona;
import es.cursojava.interfaces.ejercicio.Alimentos;

public class ClienteSupermercado {

	private String nombre;
	private List<Alimentos>carritoCompra;
	
	public ClienteSupermercado(String nombre, List<Alimentos> carritoCompra) {
		super();
		this.nombre = nombre;
		this.carritoCompra = carritoCompra;
	}
	

	public ClienteSupermercado() {
		super();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alimentos> getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(List<Alimentos> carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	@Override
	public String toString() {
		return "ClienteSupermercado [nombre=" + nombre + ", carritoCompra=" + carritoCompra + "]";
	}
	
	
	
	
	
}
