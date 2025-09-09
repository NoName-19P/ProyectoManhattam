package es.cursojava.oo.ej4;

public class TiendaManiqui {

	private String nombre;
	//private Maniqui[] maniquies;

	public TiendaManiqui(String nombre) {

		this.nombre = nombre;
		//this.maniquies = new Maniqui[3];
	}

	public static void main(String[] args) {

		TiendaManiqui t1 = new TiendaManiqui("dsdsd");
		t1.abrirTienda();
		Maniqui[]ms =t1.abrirTienda();
		t1.MostrarEscaparate(ms);

	}

	// metodo instancia por eso no lleva static, porque cada vez que creo un objeto
	// debo llamar a abrir tienda
	public  Maniqui[] abrirTienda() {
		Boton b1 = new Boton("asas", "sdsds", "dsdas");
		Boton b2 = new Boton("asas", "sdsds", "dsdas");
		Boton b3 = new Boton("asas", "sdsds", "dsdas");
		Boton[] botones = { b1, b2 };
		Vestido vestido = new Vestido("Verde", 40, "M");
		Pantalon pantalon = new Pantalon("azul", 50, "40", b3);
		Camisa camisa = new Camisa("ama", 40, "M", botones);

		Maniqui m1 = new Maniqui(1);
		Maniqui m2 = new Maniqui(2, vestido);
		Maniqui m3 = new Maniqui(3, camisa, pantalon);

		// guardas los objetos con toda su info dentro en un array de objetos, es de
		// objetos porque guarda un objeto
		Maniqui[]maniquies= {m1,m2,m3};
		//maniquies[0] = m1;
		//maniquies[1] = m2;
		//maniquies[2] = m3;

		
		//pones un return para que la inf la devuelva para poder pasarsela al otro metodo, cambio el void del metodo por un array de maniqui que devuelve el array
		return maniquies;
	}

	public void MostrarEscaparate(Maniqui[]maniquies) {
		//debido a q esta todo guardado en el array de objetos , se puede acceder a ello con los gets.
		//maniquies[2].getCamisa().getBoton()[1].getForma();
		
		for(Maniqui maniqui:maniquies) {
			//maniquies[i].getCamisa().getColor();
		}
		
		

	}
	
	
	public void vestirManiquies() {
		
	}

}
