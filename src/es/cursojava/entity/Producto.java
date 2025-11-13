package es.cursojava.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


public class Producto {

	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	private Date fecha_alta;
	private String estado;
	private String sku;
	private String creado_Por;
	private int iva;
	public Producto(int id, String nombre, String categoria, double precio, int stock, Date fecha_alta, String estado,
			String sku, String creado_Por, int iva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.fecha_alta = fecha_alta;
		this.estado = estado;
		this.sku = sku;
		this.creado_Por = creado_Por;
		this.iva = iva;
	}
	
	
	
	
	
	
	
}
