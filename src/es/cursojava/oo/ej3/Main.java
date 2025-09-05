package es.cursojava.oo.ej3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Direccion dir=new Direccion("abcd","asasa",1212);
		Biblioteca b1=new Biblioteca("dsdsd",dir,3);
		Libro libro1=new Libro("Titulo","dfsf","asdasd");
		b1.agregarLibro(libro1);
		

	

	}

}
