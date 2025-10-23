package es.cursojava.interfaces.ejercicio;

import es.cursojava.interfaces.ejercicio.interfaces.Apagable;
import es.cursojava.interfaces.ejercicio.interfaces.Consultable;
import es.cursojava.interfaces.ejercicio.interfaces.Deletable;
import es.cursojava.interfaces.ejercicio.interfaces.Encendible;

public abstract class VehiculosMotorizado extends Vehiculo implements Encendible,Apagable,Consultable,Deletable{
	
	private String motor;

	

	public VehiculosMotorizado(String matricula, int numRuedas, int id, String motor) {
		super(matricula, numRuedas, id);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}

	@Override
	public String toString() {
		return "VehiculosMotorizado [motor=" + motor + "]";
	}
	


}
