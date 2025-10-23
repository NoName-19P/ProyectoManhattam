package es.cursojava.interfaces.ejercicio;

import es.cursojava.interfaces.ejercicio.interfaces.Apagable;
import es.cursojava.interfaces.ejercicio.interfaces.Consultable;
import es.cursojava.interfaces.ejercicio.interfaces.Deletable;
import es.cursojava.interfaces.ejercicio.interfaces.Encendible;
import es.cursojava.interfaces.ejercicio.interfaces.Insertable;
import es.cursojava.interfaces.ejercicio.interfaces.Updatable;

public class Utilidades {

	public static void encender(Encendible encendible) {
		encendible.encender();
	}

	public static void apagar(Apagable apagable) {
		apagable.apagar();
	}

	public static void selectObject(Consultable consultable) {
		consultable.select();
	}

	public static void insertObject(Insertable insertable) {
		insertable.insert();
	}

	public static void updateObject(Updatable updatable) {
		updatable.update();
	}

	public static void deleteObject(Deletable deletable) {
		deletable.delete();
	}
	

}
