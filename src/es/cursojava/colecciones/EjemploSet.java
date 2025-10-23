package es.cursojava.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.herencia.hospital.Persona;




public class EjemploSet {
//no objetos duplicados
//info se ordena de manera interna
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Persona>conjunto =new HashSet();
		Persona p=new Persona(null, null, null, 0);
		for(int i=0;i<10;i++) {
			boolean aniadido=conjunto.add(new Persona(null, null, null, i));
			System.out.println(aniadido);
		}
		for(Persona persona : conjunto) {
			System.out.println(persona.getNombre());
		}
		boolean contiene =conjunto.contains(p);
		System.out.println(contiene);
		
		Iterator<Persona> ite = conjunto.iterator();
		while(ite.hasNext()) {
			Persona persona= ite.next();
			System.out.println(persona.getNombre());
		}

	}

}
