package es.cursojava.herenciaejercicios;

public class GuitarraElectrica extends Guitarra {
	private int potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCuerdas, int potencia) {
		super(nombre, tipo, afinado, numCuerdas);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	public void tocar() {
		System.out.println("Tocando muy alto");
	}
	
	

}
