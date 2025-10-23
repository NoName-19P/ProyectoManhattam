package es.cursojava.interfaces.ejercicio3;

public abstract class MetodosDePago implements Pago {
	
	private double cantidad;

	public MetodosDePago(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
