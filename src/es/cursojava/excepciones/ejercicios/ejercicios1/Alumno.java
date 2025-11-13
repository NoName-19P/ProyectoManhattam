package es.cursojava.excepciones.ejercicios.ejercicios1;

public class Alumno {
    private String nombre;
    private int edad;
    private double nota;

    public Alumno(String nombre, int edad, double nota) throws NotaInvalidaException {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que 0.");
        }
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("La nota tiene q estar entre 0 y 10.");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    

    public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	@Override
    public String toString() {
        return "Alumno: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }
}

