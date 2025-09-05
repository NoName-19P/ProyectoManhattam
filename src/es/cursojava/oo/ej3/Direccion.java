package es.cursojava.oo.ej3;

public class Direccion {

	private String calle; 
	private String ciudad;
	private int cp;
	
	
	public Direccion(String calle, String ciudad, int cp) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.cp = cp;
	}
	
	
	public void mostrarDireccion() {
		System.out.println(this.calle+this.ciudad+this.cp);
		
		
	}
	
	
}
