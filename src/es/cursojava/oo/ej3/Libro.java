package es.cursojava.oo.ej3;

public class Libro {
	/*
	 * Ejercicio 3
=============================================
Clase Libro

	Atributos: titulo, autor, isbn.

	Constructor y método mostrarInfo() --> Mostrará los datos del libro

Clase Dirección

	Atributos: calle, ciudad, codigoPostal.

	Constructor y método mostrarDireccion().

Clase Biblioteca

Atributos: nombre, direccion, libros 

Métodos:
+ agregarLibro(Libro libro) para añadir un libro.
+ mostrarLibros() para mostrar todos los libros.
+ mostrarInfoBiblioteca() para mostrar dirección y libros.

Clase Main

Crea un objeto Biblioteca (Suponemos que en la biblioteca caben 10 libros como mucho) con una dirección.
Agrega al menos 3 libros.
Muestra la información completa de la biblioteca.
Muestra los libros que tiene la biblioteca
	 */

	
	
	
	
	
	private String titulo;
	private String autor;
	private String isbn;
	
	
	
	public Libro(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	
	
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getIsbn() {
		return isbn;
	}




	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}




	public void mostrarInfo() {
		System.out.println("Titulo: "+this.titulo+ "Autor: "+this.autor+"ISBN: "+this.isbn);
	}
	
	
	
	
	
	
}
