package es.cursojava.oo;

import java.util.Arrays;
import java.util.List;

public class Alumno  {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;
	
	
	
	
	
	public Alumno(String nombre,String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	
	
	
	public Alumno(String nombre, String dni, double notaMedia,String[] asignaturas) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas=asignaturas;
		
	}
	

	public Alumno(String nombre, String dni, double notaMedia) {
		
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		
		
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNota_media() {
		return notaMedia;
	}
	public void setNota_media(int nota_media) {
		this.notaMedia = nota_media;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	

	
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", notaMedia=" + notaMedia + ", asignaturas="
				+ Arrays.toString(asignaturas) + "]";
	}



	public void estudiar() {
		
		

		if(getNota_media()>=0 && getNota_media()<5 ) {			
			System.out.println("El estudiante "+getNombre()+" tiene las asignaturas "+Arrays.toString(getAsignaturas())+" y nota media es "+getNota_media()+" a estudiado poco");
		}
		if(getNota_media()>=5 && getNota_media()<=9) {
			
			System.out.println("El estudiante "+getNombre()+" tiene las asignaturas "+Arrays.toString(getAsignaturas())+" y nota media es "+getNota_media()+" a estudiado mucho");
	}
		if(getNota_media()>9) {
			
			System.out.println("El estudiante "+getNombre()+" tiene las asignaturas "+Arrays.toString(getAsignaturas())+" y nota media es "+getNota_media()+" es un genio");
			
		}
		
	}
	
	
	
	

}
