package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooHotTemperatureException;

public class TazaCafe extends TooHotTemperatureException {
	/*
	 * Si cuando un cliente se toma una taza de café el café está muy caliente (>80º) se va a lanzar la excepción 
TooHotTemperatureException y si está muy frío (<20º) se va a lanza la excepción TooColdTemperatureException. 
Ambas excepciones heredan de TemperatureException

	 */

	private int temperatura;
	private String tipoCafe;
	
	public TazaCafe(int temperatura, String tipoCafe) {
		super();
		this.temperatura = temperatura;
		this.tipoCafe = tipoCafe;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public String getTipoCafe() {
		return tipoCafe;
	}
	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}
	
	public boolean estaCaliente(int temperatura) {
		if(temperatura>80) {
			
			
		}
		return true;
	}
	
	
	@Override
	public String toString() {
		return "TazaCafe [temperatura=" + temperatura + ", tipoCafe=" + tipoCafe + "]";
	}
	
}
