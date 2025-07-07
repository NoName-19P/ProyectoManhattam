package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String []args) {
		/*
		 * + Declarar la variables asignatura de tipo String, nombreAlumno de tipo String y nota de tipo int 
		+ Inicializar las variables con valores inventados
		+ El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable

		0 <5 suspenso
		5 <7 aprobado
		7 <9 notable
		9-10 sobresaliente
		 */
		Scanner entrada=new Scanner(System.in);
		String asignatura="Matematicas";
		String alumno="Juan";
		int nota=0;
		String nota_final=" ";
		
		System.out.println("Introuduce la nota del alumno");
		nota=entrada.nextInt();
		
		if(nota>0 && nota<5) {
		
			nota_final=" suspenso";
		}
		
		if(nota<7 && nota>=5) {
			nota_final="aprobado";
		}
		
		if(nota<9 && nota>=7) {
			nota_final="notable";
		}
		
		if(nota>=9 && nota <=10) {
			nota_final="sobresaliente";
		}
		System.out.println("la nota del alumno "+alumno+" en "+asignatura+" es de "+nota_final);
		
	}

}
