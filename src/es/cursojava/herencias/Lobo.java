package es.cursojava.herencias;

public class Lobo extends Animal {


	private int numComillos;
	
	
	
	public Lobo(String nombre, double peso, long identificador, int numComillos) {
		super(nombre, peso, identificador);
		this.numComillos = numComillos;
	}



	public int getNumComillos() {
		return numComillos;
	}



	public void setNumComillos(int numComillos) {
		this.numComillos = numComillos;
	}
	
	
	public void comer() {
		//sobrecarga parcial
		System.out.println("El lobo esta cazando");
		super.comer();
	}
	
	

}
