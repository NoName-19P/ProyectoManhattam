package es.cursojava.oo.ej3;

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

	static Scanner sc = new Scanner(System.in);
	private String nombre;
	private Direccion direccion;
	private Libro[] libros;
	private int contlibros;

	public Biblioteca(String nombre, Direccion direccion,int numLibros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new Libro[numLibros];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	public void agregarLibro(Libro libro) {

		if(contlibros<libros.length) {
			libros[contlibros]=libro;
			contlibros++;
		}else {
			System.out.println("La biblioteca esta llena");
		}

	}

	public void mostrarLibros() {
		for(Libro libro: libros) {
			if(libro !=null) {
				libro.mostrarInfo();
			}
		}
	}

	public void mostrarInfoBiblio() {

		direccion.mostrarDireccion();
		mostrarLibros();

	}

}
