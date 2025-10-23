package es.cursojava.ejercicio.supermercado;

import java.util.List;

import es.cursojava.interfaces.ejercicio.Alimentos;

/*
 * ==================== Ejercicio 2: Listas y Conjuntos ====================
Clase Supermercado
+nombre
+stock alimentos -> List<List<Alimento>>
+clientes Set<clienteSupermercado>

Clase ClienteSupermercado
nombre
carritoCompra-> List<Alimento>

Crear los objetos 

Por cada cliente que haya en el supermercado mostrar
solo los productos disponibles y la cantidad que quedan 
Por ejemmplo para el 

	Cliente1-> 	Plátanos 3
				Pimientos 2

Pedir el producto que desea y la cantidad hasta que no desee continuar.
Si elije 2 plátanos para el siguiente cliente en lo que se muestra 
solo habrá 1 plátano
	
	Cliente2 -> Plátanos 1
				Pimientos 2

cuando hayan terminado todos los clientes, 
cada cliente debe pagar el importe de su carrito de la compra
 */
public class Supermercado {
	private String nombre;
	private List<List<Alimentos>> stock;
	private List<ClienteSupermercado> clientes;

	public Supermercado(String nombre, List<List<Alimentos>> stock, List<ClienteSupermercado> clientes) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.clientes = clientes;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<List<Alimentos>> getStock() {
		return stock;
	}

	public void setStock(List<List<Alimentos>> stock) {
		this.stock = stock;
	}

	public List<ClienteSupermercado> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteSupermercado> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Supermercado [nombre=" + nombre + ", stock=" + stock + ", clientes=" + clientes + "]";
	}

}
