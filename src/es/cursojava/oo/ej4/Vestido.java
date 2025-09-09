package es.cursojava.oo.ej4;

public class Vestido {
	
	private String color;
	private double precio;
	private String talla;
	
	
	
	public Vestido(String color, double precio, String talla) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getTalla() {
		return talla;
	}



	public void setTalla(String talla) {
		this.talla = talla;
	}



	@Override
	public String toString() {
		return "Vestido [color=" + color + ", precio=" + precio + ", talla=" + talla + "]";
	}
	
	
	
	
	

}
