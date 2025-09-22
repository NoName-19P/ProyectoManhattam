package es.cursojava.oo.ej4;

public class TiendaManiqui {

	private String nombre;
	private boolean estavestido;
	// private Maniqui[] maniquies;

	public TiendaManiqui(String nombre) {

		this.nombre = nombre;
		// this.maniquies = new Maniqui[3];
	}

	public boolean isEstavestido() {
		return estavestido;
	}

	public static void main(String[] args) {
	

		TiendaManiqui t1 = new TiendaManiqui("dsdsd");
		Maniqui[] ms = t1.abrirTienda();
		t1.vestirManiquies(ms);
		t1.MostrarEscaparate(ms);
		t1.cerrar(ms);

	}

	// metodo instancia por eso no lleva static, porque cada vez que creo un objeto
	// debo llamar a abrir tienda
	public Maniqui[] abrirTienda() {
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
		Maniqui[] maniquies = { m1, m2, m3 };
		// pones un return para que la inf la devuelva para poder pasarsela al otro
		// metodo, cambio el void del metodo por un array de maniqui que devuelve el
		// array
		return maniquies;
	}

	public void vestirManiquies(Maniqui[] maniquiesVestir) {
		for (Maniqui maniqui : maniquiesVestir) {
		
				System.out.println("El maniqui " + maniqui.getId() + " no tiene camisa o vestido");
			Vestido vestido = new Vestido("Azul", 60, "M");
			System.out.println("Le pongo un vestido");
			maniqui.vestir(vestido);
		}

	}

	public void MostrarEscaparate(Maniqui[] maniquies) {

		for (Maniqui maniqui : maniquies) {
			System.out.println("Maniqui " + maniqui.getId());
			double precioRopa =0;
			if (maniqui.getPantalon() != null) {
				System.out.println("Pantalon");
				Pantalon pantalon = maniqui.getPantalon();
				System.out.println("color: "+pantalon.getColor());
				System.out.println("talla: "+pantalon.getTalla());
				System.out.println("precio: "+pantalon.getPrecio());
				precioRopa+=pantalon.getPrecio();
				
				

				
			}

			if (maniqui.getCamisa() != null) {
				precioRopa += maniqui.getCamisa().getPrecio();
			}
			
			if(maniqui.getVestido()!=null) {
				precioRopa += maniqui.getVestido().getPrecio();
			}
			
			System.out.println("El precio de la ropa del maniqui "+maniqui.getId()+" es "+precioRopa);
		}

	}
	
	public void cerrar(Maniqui[]maniquies) {
		for(Maniqui maniqui:maniquies) {
			maniqui.desvestir();
		}
	}

}
