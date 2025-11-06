package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;

public class ClienteAsiduo extends Cliente implements TomarCafe {
	private String mote;

	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
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
		System.out.println("Cliente Asiduo "+getNombre()+" esta tomando un cafe");
		
	}
	     

}
