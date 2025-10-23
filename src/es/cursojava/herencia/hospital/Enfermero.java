package es.cursojava.herencia.hospital;

public class Enfermero extends EmpleadosHospital {
	private String planta;

	

	public Enfermero(String nombre, int edad, String turno, String planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
	public void atenderPaciente() {
		
	}
	@Override
	public void cobrar() {
		
	}

	@Override
	public String toString() {
		return "Enfermero [planta=" + planta + "]";
	}
	
	
	
	
	

}
