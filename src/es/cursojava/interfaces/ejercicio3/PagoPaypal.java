package es.cursojava.interfaces.ejercicio3;

public class PagoPaypal extends MetodosDePago {

	private String usuario;

	public PagoPaypal(double cantidad, String usuario) {
		super(cantidad);
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	@Override
	public void procesarPago(double monto) {
		System.out.println("Procesando pago con el paypal: " + this.usuario);

	}

}
