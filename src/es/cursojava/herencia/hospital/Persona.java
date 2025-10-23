package es.cursojava.herencia.hospital;

public  class Persona {

	private String nombre;
	private int edad;
	public Persona(String nombre, String string, String string2, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
