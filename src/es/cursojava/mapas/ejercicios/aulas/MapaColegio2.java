package es.cursojava.mapas.ejercicios.aulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.cursojava.oo.Alumno;

public class MapaColegio2 {

	/*
	 * ==================== Ejercicio 1 Mapas ====================
Creamos 7 alumnos

Vamos a separar a los alumnos por aulas,

aula1 -> 2 alumnos
aula2 -> 1 alumnos
aula3 -> 4 alumnos

- Indicar cuantas aulas tiene el colegio
- Mostrar por cada aula los datos de los alumnos
- Mostrar por cada aula cuantos alumnos hay
- Solicitar el nombre de 1 aula y mostrar todos los alumnos del aula si el aula existe
- Indicar cual es el aula que tiene el alumno con la nota media más alta


==================== Ejercicio 2 Mapas ====================
Crear clase Colegio con:
 	nombre, direccion, Map<"String",List<Alumno>> aulas
 	
Crear 3 colegios -> Meterlos en una lista y:
+ recorrer la lista de colegios para mostrar los datos de cada colegio, 
el nombre de cada aula del colegio y por cada aula, el nombre,  
el apellido y la nota media de sus alumnos

+ Indicar cual es el colegio que tiene la nota media de alumnos mayor.


==================== Ejercicio 3 Mapas ====================
Ejercicio: Biblioteca por autores

Clase Autor -> nombre, nacionalidad
Libro -> titulo, isbn, anio 

Crear una biblioteca donde:
La clave del mapa sea un objeto Autor.
El valor sea una lista de libros (List<Libro>) escritos por ese autor.

Crear los ojetos correspondientes para que haya 9 libros y 4 autores

+ mostrar las nacionalidades de los autores
+ mostrar el título de todos los libros publicados después del 2010
+ mostrar por cada autor que tenga más de dos libros su nombre y el nombre de todos los libros que tiene publicados
+ Solicitar los datos de un libro, autor, titulo, isbn y año de publicación, 
	- si el autor no está en la biblioteca, solicitar la nacionalidad del autor y meterlo en la biblioteca, 
	- si el autor sí está ya, agregar el libro a su listado
	
+ Solicitar un isbn, si algún libro tiene ese isbn hay que eliminarlo




	 */
	public static void main(String[] args) {
		Colegio colegio1 = new Colegio("Cole1", "Dir1");
		Colegio colegio2 = new Colegio("Cole2", "Dir2");
		
		
		List<Alumno> alumnos = MapaColegio.generaAlumnos();
		
		Map<String,List<Alumno>> aulasCole3 = new HashMap<>();
		aulasCole3.put("aula1",alumnos.subList(0, 2));
		aulasCole3.put("aula2",alumnos.subList(2, 3));
		aulasCole3.put("aula3",alumnos.subList(3, 7));
		Colegio colegio3 = new Colegio("Cole3", "Dir3",aulasCole3);
		
		Map<String,List<Alumno>> aulasCole2 = new HashMap<>();
		aulasCole2.put("aula1", alumnos.subList(7, 10));
		colegio2.setAulas(aulasCole2);
		
		
		List<Colegio> colegios = Arrays.asList(colegio1,colegio2, colegio3);
		for (Colegio colegio : colegios) {
			if (colegio.getAulas().isEmpty()) {
				System.out.println(colegio.getNombre() +" sin aulas");
				Map<String,List<Alumno>> aulasCole1 = new HashMap<>();
				aulasCole1.put("aula1", alumnos.subList(10, 11));
				aulasCole1.put("aula2", alumnos.subList(11, 12));
				aulasCole1.put("aula3", alumnos.subList(12, 13));
				
				colegio.setAulas(aulasCole1);
			}
		}
		Alumno alumnoN = new Alumno("AN", "222N", 9.5);
		Alumno alumnoN1 = new Alumno("AN1", "222N1", 6.5);
		//colegio2.getAulas().get("aula1").add(alumnoN);//Añadimos alumnos a un aula que ya existe
		
		colegio2.getAulas().put("aula2", new ArrayList(Arrays.asList(alumnoN)));
		colegio2.getAulas().get("aula2").add(alumnoN1);
		//System.out.println(colegio2.getAulas().get("aula2").size());

		
		mostrarDatosColegios(colegios);
	}
	
	private static void mostrarDatosColegios (List<Colegio> colegios) {
		
		/*
		 * Crear 3 colegios -> Meterlos en una lista y:
		+ recorrer la lista de colegios para mostrar los datos de cada colegio, 
		el nombre de cada aula del colegio y por cada aula, el nombre,  
		el apellido y la nota media de sus alumnos	
		 */
		
		double suma=0;
		double media=0;
		int contAlumno=0;
		
		for (Colegio colegio : colegios) {
			System.out.println(colegio);
			Map<String,List<Alumno>> aulas= colegio.getAulas();
			Set<String> nombresAulas =  aulas.keySet();
			for (String nombreAula : nombresAulas) {
				System.out.println(nombreAula);
				List<Alumno> alumnos = aulas.get(nombreAula);
				for (Alumno alumno : alumnos) {
					System.out.println(alumno);
					suma+=alumno.getNota_media();
					contAlumno++;
					//System.out.println("hay "+contAlumno+" alumnos");
					
				}
				System.out.println("la suma total del "+nombreAula+" es de "+suma);
				//System.out.println("Su media es de "+media);
				
				
			}
			
			
			
			
		}
		
		
		
	}

}




