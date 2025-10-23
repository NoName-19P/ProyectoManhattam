package es.cursojava.mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import es.cursojava.herencia.hospital.Persona;
import es.cursojava.oo.Alumno;
import es.cursojava.utils.Utilidades;

public class EjercicioMapas {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creamos 7 alumnos

Vamos a separar a los alumnos por aulas,

aula1 -> 2 alumnos
aula2 -> 1 alumnos
aula3 -> 4 alumnos

- Indicar cuantas aulas tiene el colegio
- Mostrar por cada aula los datos de los alumnos
- Mostrar por cada aula cuantos alumnos hay
- Solicitar el nombre de 1 aula y mostrar todos los alumnos del aula si el aula existe
- Indicar cual es el aula que tiene el alumno con la nota media más alta
		 */

		String[] asignaturas = { "Lengua", "Mates", "Ciencia" };
		
		
		
		
		ArrayList<Alumno>listaAlumno1=new ArrayList<>();
		
		ArrayList<Alumno>listaAlumno2=new ArrayList<>();
		Alumno a1 = new Alumno("Carlos", "dsdsds", 6, asignaturas);
		Alumno a2 = new Alumno("Arturo", "dsdsds", 8, asignaturas);
		Alumno a3 = new Alumno("David", "dsdsd", 4, asignaturas);
		
		
		listaAlumno1.add(a1);
		listaAlumno1.add(a2);
		listaAlumno1.add(a3);
		
		
		
		Alumno a4 = new Alumno("Luis", "dsdsds", 6, asignaturas);
		Alumno a5 = new Alumno("Pablo", "dsdsds", 8, asignaturas);
//		Alumno a6 = new Alumno("Jose", "dsdsd", 4, asignaturas);
//		
		listaAlumno2.add(a4);
		listaAlumno2.add(a5);
	
		
		Map<String,ArrayList<Alumno>>alumnos  = new HashMap();
		
		alumnos.put("Aula1", listaAlumno1);
		alumnos.put("Aula2", listaAlumno2);
		//alumnos.put("Aula3", listaAlumno1);
		
			
		
		
//		Alumno a3 = new Alumno("c", "dsdsd", 4, asignaturas);
//		Alumno a3 = new Alumno("c", "dsdsd", 4, asignaturas);
//		Alumno a3 = new Alumno("c", "dsdsd", 4, asignaturas);
//		Alumno a3 = new Alumno("c", "dsdsd", 4, asignaturas);

		

//////////////////////////////////////////////////////////////
	Set<String> aulas = alumnos.keySet();
	ArrayList<Alumno> alumnoValor = new ArrayList<>();
	//ArrayList<Alumno> alumnoValor2 = new ArrayList<>();
	System.out.println("****Lista de Aulas*******");
		
		for (String aulaAlumno : aulas) {
			
			System.out.println(aulaAlumno);
		}
//////////////////////////////////////////////////////////////

		System.out.println("Introduce el aula en el que quieres buscar los alumnos");
		String nombreAula = sc.next();
		if(aulas.contains(nombreAula)) {
		for (String aulasclaves : aulas) {
			alumnoValor =alumnos.get(nombreAula);
			
		}
		System.out.println(alumnoValor.toString());
		System.out.println("Hay "+alumnoValor.size()+" alumnos");
		
		
		}else {
			System.out.println("No existe el aula");
		}
		
		
		for() {
			Set<Entry<String, ArrayList<Alumno>>> entries =alumnos.entrySet();
			for (Entry<String,ArrayList<Alumno>> entry : entries) {
				System.out.println(entry.getKey() + " " + entry.getValue().get(i).getNombre();
			}
		}
		
		
	
		
		

		
////////////////////////////////////////////////////////////////

		
		
		
		
		
//////////////////////////////////////////////////////////////
		
		
		
		
		
		
//////////////////////////////////////////////////////////////////////
		
		

	}
	
	

}
