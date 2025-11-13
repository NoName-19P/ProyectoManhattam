package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooHotTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;

public class Comensal extends Cliente implements TomarCafe {
	private boolean tieneReserva;
	private String cafeAleatorio;

	public Comensal(String nombre, boolean tieneReserva) throws TemperatureException{
		super(nombre);
		this.tieneReserva = tieneReserva;
		int r=(int) (Math.random()*100);
		String[] tiposCafe={"expresso","capuccino","descafeinado"};
		int random= (int) (Math.random()*tiposCafe.length);
		cafeAleatorio = tiposCafe[random];
		System.out.println("Cafe "+cafeAleatorio+" generado aleatoriamente");
		TazaCafe tazaCafe=new TazaCafe(r, cafeAleatorio);
		System.out.println("Cafe generado con temperatura "+r);
		 if (tazaCafe.getTemperatura()<20) {
	            throw new TooColdTemperatureException ("El cafe esta muy frio");
	        }
	        if (tazaCafe.getTemperatura()>80) {
	            throw new TooHotTemperatureException ("El cafe esta muy caliente");
	        }
	}

	public boolean isTieneReserva() {
		return tieneReserva;
	}

	public void setTieneReserva(boolean tieneReserva) {
		this.tieneReserva = tieneReserva;
	}

	@Override
	public String toString() {
		return "Comensal [tieneReserva=" + tieneReserva + "]";
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Cliente comensal "+getNombre()+" esta tomando un cafe "+cafeAleatorio);
		
	}
	

}
