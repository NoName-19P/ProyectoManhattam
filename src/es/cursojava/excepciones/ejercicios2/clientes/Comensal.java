package es.cursojava.excepciones.ejercicios2.clientes;

import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;

public class Comensal extends Cliente implements TomarCafe {
	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
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
		System.out.println("Cliente comensal"+getNombre()+" esta tomando un cafe");
		
	}
	

}
