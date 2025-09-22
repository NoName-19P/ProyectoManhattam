package es.cursojava.oo.ej4;

public class Maniqui {
	/*
	 * 
	 * 
	 * -metodos vestir y desvestir (solo se les puede vestir con pantalón y camisa o con vestido)
	 */

	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;

	public Maniqui(int id) {
		this.id=id;

	}

	public Maniqui( int id,Camisa camisa,Pantalon pantalon) {
		this.id=id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		
	}

	public Maniqui(int id,Vestido vestido) {
		this.id=id;
		this.vestido = vestido;
	}
	
	
	
	
	public int getId() {
		return id;
	}

	

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	
	
	

	public void vestir(Pantalon pantalon,Camisa camisa) {
		desvestir();
		this.pantalon=pantalon;
		this.camisa=camisa;
	
		
	}
	
	
	
	public void vestir(Vestido vestido) {
		desvestir();
		this.vestido=vestido;
		
	}
	
	public void desvestir() {
		camisa=null;
		pantalon=null;
		vestido=null;
		
	}

	
	
	
	
	

}
