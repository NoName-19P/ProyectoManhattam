package es.cursojava.interfaces.ejercicio3;

public class PagoCriptomoneda extends MetodosDePago  {

	private String usuario;
	
	public PagoCriptomoneda(double cantidad, String usuario) {
		super(cantidad);
		this.usuario = usuario;
	}


	public String getUsuario() {
		return usuario;
	}

	
	

	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago con criptomoneda del usuario " + this.usuario);


	}

}
