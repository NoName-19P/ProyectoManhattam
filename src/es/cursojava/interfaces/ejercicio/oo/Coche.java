package es.cursojava.interfaces.ejercicio.oo;

import es.cursojava.interfaces.ejercicio.VehiculosMotorizado;
import es.cursojava.interfaces.ejercicio.interfaces.Apagable;
import es.cursojava.interfaces.ejercicio.interfaces.Encendible;

public class Coche extends VehiculosMotorizado implements Encendible, Apagable {

	private String modelo;
	private String color;

	

	public Coche(String matricula, int numRuedas, int id, String motor, String modelo, String color) {
		super(matricula, numRuedas, id, motor);
		this.modelo = modelo;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void encender() {
		System.out.println("Coche "+this.modelo+" encendido");
	}

	@Override
	public void apagar() {
		System.out.println("Coche "+this.modelo+" apagado");

	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + "]";
	}

	@Override
	public void select() {
		System.out.println("Producto electronico "+getModelo()+"con id: "+getId()+" seleccionado correctamente");
		
	}

	@Override
	public void delete() {
		System.out.println("Producto electronico "+getModelo()+"con id: "+getId()+" eliminado correctamente");
		
	}

	@Override
	public void insert() {
		System.out.println("Producto electronico "+getModelo()+"con id: "+getId()+" insertado correctamente");
		
	}

	@Override
	public void update() {
		System.out.println("Producto electronico "+getModelo()+"con id: "+getId()+" actualizado correctamente");
		
	}
	
	

}
