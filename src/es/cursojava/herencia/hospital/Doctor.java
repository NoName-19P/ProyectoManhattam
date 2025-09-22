package es.cursojava.herencia.hospital;

import java.util.Random;

public class Doctor extends EmpleadosHospital{
	
	/*
	 * Si el paciente está enfermo --> 1-10  
			si > 8 el paciente está enfermo
			devolver un objeto Enfermo 
			
	 */
	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public Enfermo diagnosticarPaciente(Paciente paciente) {
		
		Random ale=new Random();
		int num=ale.nextInt(10)+1;
		
		if(num>=8) {
			
			Enfermo enfermo=new Enfermo("muerte",123,"covid");
			System.out.println("El paciente esta enfermo");
			return enfermo;
				
		}
		
		System.out.println("El paciente no esta enfermo");
		return  null;
		
	}

	@Override
	public String toString() {
		return "Doctor [especialidad=" + especialidad + "]";
	}
	
	

}
