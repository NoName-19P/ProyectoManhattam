package es.cursojava.oo.tienda;

public class Producto {
/*
 * Crea un paquete llamado tienda en ejercicios.

Dentro del paquete tienda, crea una clase Producto con los siguientes atributos privados:

+String nombre

+double precio

+int cantidad

Implementa un constructor que reciba los tres atributos.

Añade los siguientes métodos en Producto:

+ mostrarInfo() → muestra en consola los datos del producto.

+ calcularValorTotal() → devuelve el valor total (precio * cantidad).

Crea una clase auxiliar llamada UtilidadesTienda con un método estático:

+ calcularValorInventario(Producto[] productos) → recibe un array de productos y devuelve el valor total del inventario.

En una clase llamada Tienda con main:

Crea al menos 3 objetos Producto usando el constructor.

Guarda los objetos en un array de productos.

Muestra la información de cada producto.

Calcula y muestra el valor total del inventario usando el método estático.

 */
	
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	
	
	public Producto(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public double getPrecio() {
		return precio;
	}


	public int getCantidad() {
		return cantidad;
	}




	public void mostrarInfo() {
		
		System.out.println(this.nombre+this.precio+this.cantidad);
		
	}
	
	public double calcularValorTotal() {
		return getPrecio()*getCantidad();
	}
	
	
	
}
