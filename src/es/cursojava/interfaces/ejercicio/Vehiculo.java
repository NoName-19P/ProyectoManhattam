package es.cursojava.interfaces.ejercicio;

public abstract class Vehiculo {
	private String matricula;
	private int numRuedas;
	private int id;

	public Vehiculo(String matricula, int numRuedas, int id) {
		super();
		this.matricula = matricula;
		this.numRuedas = numRuedas;
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", numRuedas=" + numRuedas + "]";
	}

}
