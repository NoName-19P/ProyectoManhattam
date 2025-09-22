package es.cursojava.herenciaejercicios;

public class Instrumento {
	/*
	 * nombre
	tipo
	afinado
	
	afinar() --> Afinando instrumento nombre, se afina o no de manera aleatoria
		Math.random()> 0.4 --> El instrumento está afinado
	tocar() --> Tocando instrumento nombre
	 */
	
	
	private String nombre;
	private String tipo;
	private boolean afinado;
	
	
	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isAfinado() {
		
		return afinado;
	}
	


	public void setAfinado(boolean afinado) {
		
		this.afinado = afinado;
	}
	
	
	public boolean afinar() {
		
		if(Math.random()>0.4) {
			System.out.println("El instrumento esta afinado");
			return true;
		}else {
			System.out.println("El instrumento no esta afinado");
			return false;
		}	
		
	}
	
	public void tocar() {
		System.out.println("Tocando: "+getNombre());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
