package es.cursojava.excepciones.ejercicios2.clientes;

import java.util.Scanner;

import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooColdTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.excepciones.TooHotTemperatureException;
import es.cursojava.excepciones.ejercicios2.clientes.interfaces.TomarCafe;

public class Bar {
	static Scanner sc = new Scanner(System.in);
	private String nombre;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bar bar = new Bar("MonteCarlo");
		System.out.println("Bar " + bar.getNombre()+" abierto");
		bar.abrirBar();
		
		
	}

	private  void abrirBar() {
		
		Huesped huesped = new Huesped("Marcos", "343344A");
		System.out.println("Huesped "+huesped.getNombre()+" con dni:"+huesped.getDni()+" generado correctamente");

		try {
			System.out.println("Introduce el nombre del clienteAsiduo");
			String nombreAsiduo = sc.next();
			System.out.println("Introduce el mote del clienteAsisuo");
			String moteAsiduo = sc.next();
			ClienteAsiduo clienteAsiduo = new ClienteAsiduo(nombreAsiduo, moteAsiduo);
			tomarCafe(clienteAsiduo);

		} catch (TooColdTemperatureException c) {
			System.out.println(c.getMessage());
		} catch (TooHotTemperatureException h) {
			System.out.println(h.getMessage());
		} catch (Exception e) {
			System.out.println("error final: " + e.getMessage());
		}

		try {
			System.out.println("Introduce el nombre del Comensal");
			String nombreComensal = sc.next();
			Comensal comensal = new Comensal(nombreComensal, true);
			tomarCafe(comensal);

		} catch (TooColdTemperatureException c) {
			System.out.println(c.getMessage());
		} catch (TooHotTemperatureException h) {
			System.out.println(h.getMessage());
		} catch (Exception e) {
			System.out.println("error final: " + e.getMessage());
		}

	}

	private static void tomarCafe(TomarCafe t) {
		t.mostrarInfo();

	}

}
