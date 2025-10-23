package es.cursojava.interfaces.ejercicio;

public class Bicicleta extends Vehiculo {
	
	private int numMarchas;

	

	public Bicicleta(String matricula, int numRuedas, int id, int numMarchas) {
		super(matricula, numRuedas, id);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	@Override
	public String toString() {
		return "Bicicleta [numMarchas=" + numMarchas + "]";
	}
	
	
	
	
	

}
