package es.cursojava.herencia.hospital;

import java.util.Arrays;

public class Paciente extends Persona {
	
	
	private String[]sintoma;

	public Paciente(String nombre, int edad, String[] sintoma) {
		super(nombre, nombre, nombre, edad);
		this.sintoma = sintoma;
	}

	public String[] getSintoma() {
		return sintoma;
	}

	public void setSintoma(String[] sintoma) {
		this.sintoma = sintoma;
	}
	
	@Override
	public void comer() {
		System.out.println("El paciente esta comiendo en la cafeteria"+super.getNombre());
		
	}

	@Override
	public String toString() {
		return "Paciente [sintoma=" + Arrays.toString(sintoma) + "]";
	}
	
	
	

}
