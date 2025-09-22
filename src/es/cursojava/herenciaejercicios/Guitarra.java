package es.cursojava.herenciaejercicios;

public class Guitarra extends Instrumento {
	
	
	private int numCuerdas;

	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	
//	public void afinar() {
//		super.Afinar();
//		System.out.println("Afinando guitarra");
//	}
//	
	

}
