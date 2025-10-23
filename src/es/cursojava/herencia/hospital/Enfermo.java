package es.cursojava.herencia.hospital;

public class Enfermo extends Persona{
	
	
	
	private String[] enfermedad;
	


	public Enfermo(String nombre, int edad, String []enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	
	
	
	
	

	public String[] getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String []enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public void comer() {
		System.out.println("El enfermo esta comiendo en la habitacion"+super.getNombre());
	}

	@Override
	public String toString() {
		return "Enfermo [enfermedad=" + enfermedad + "]";
	}
	
	

}
