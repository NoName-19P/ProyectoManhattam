package es.cursojava.interfaces.ejercicio.oo;

import es.cursojava.interfaces.ejercicio.Bicicleta;

public class Montañera extends Bicicleta {
	private String modelo;

	
	public Montañera(String matricula, int numRuedas, int id, int numMarchas, String modelo) {
		super(matricula, numRuedas, id, numMarchas);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Montañera [modelo=" + modelo + "]";
	}
	
	
	
	

}
