package es.cursojava.interfaces.ejercicio3;

public class PagoTarjetaCredito extends MetodosDePago {

	private String marca;
	private int numero;

	public PagoTarjetaCredito(double cantidad, String marca, int numero) {
		super(cantidad);
		this.marca = marca;
		this.numero = numero;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void procesarPago(double monto) {
		System.out.println("Pago por tarjeta realizado correctamente");
		
	}

	
}
