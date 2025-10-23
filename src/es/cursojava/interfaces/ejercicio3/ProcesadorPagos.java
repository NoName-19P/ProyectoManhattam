package es.cursojava.interfaces.ejercicio3;

public class ProcesadorPagos {
	
	public static void realizarPago(Pago metodoPago,double monto) {
		metodoPago.procesarPago(monto);
	}

}
