package es.cursojava.interfaces.ejercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		MetodosDePago PagoTarjetaCredito=new PagoTarjetaCredito(5000,"Visa",458727514);
		MetodosDePago PagoPaypal=new PagoPaypal(2000,"Visa");
		MetodosDePago PagoCriptomoneda=new PagoCriptomoneda(200,"ETH");
		
		ProcesadorPagos.realizarPago(PagoCriptomoneda,0);
		
		ArrayList<String>Lista=new ArrayList<>();
		

	}

}
