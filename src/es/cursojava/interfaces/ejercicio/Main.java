package es.cursojava.interfaces.ejercicio;

import java.util.ArrayList;

import es.cursojava.interfaces.ejercicio.interfaces.Encendible;
import es.cursojava.interfaces.ejercicio.oo.Coche;
import es.cursojava.interfaces.ejercicio.oo.Consola;
import es.cursojava.interfaces.ejercicio.oo.Pan;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alimentos pan =new Pan(null, 0, 0, null);
		ProductosElectronicos consola = new Consola(null, 0, 0, null, null);

		VehiculosMotorizado coche = new Coche(null, 0, 0, null, null, null);
		// se puede llmar encender de la variable productos electornicos porque esa clase tiene las interfaces encender u otras
		//si no tuvieran esas interfaces no podriamos llmar al metodo
		Encendible[]arrayEncendible={consola};
		
		
		Utilidades.encender(consola);
		
		Utilidades.apagar(consola);
		
		Utilidades.selectObject(pan);
		
		Utilidades.selectObject(consola);
		Utilidades.insertObject(consola);
		Utilidades.updateObject(consola);
		
		Utilidades.selectObject(coche);
		Utilidades.insertObject(coche);
		Utilidades.updateObject(coche);
		Utilidades.deleteObject(coche);
		

	}

	
}
