package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooHotTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;
/*
 * Si cuando un cliente se toma una taza de café el café está muy caliente (>80º) se va a lanzar la excepción 
TooHotTemperatureException y si está muy frío (<20º) se va a lanza la excepción TooColdTemperatureException. 
Ambas excepciones heredan de TemperatureException

 */

public class ClienteAsiduo extends Cliente implements TomarCafe {
	private String mote;
	private String cafeAleatorio;

	public ClienteAsiduo(String nombre, String mote) throws TemperatureException {
		super(nombre);
		this.mote = mote;
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

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	@Override
	public String toString() {
		return "ClienteAsiduo [mote=" + mote + "]";
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Cliente Asiduo "+getNombre()+" esta tomando un cafe "+cafeAleatorio);
		
	}
	     

}
