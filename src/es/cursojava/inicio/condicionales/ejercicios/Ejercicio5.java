package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Herramienta para calcular el precio de una llamada
		Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
		de tal forma que:

		+ los primeros cinco minutos cuestan 1€, 
		+ los siguientes 3 minutos, 80 céntimos, 
		+ los siguientes dos minutos a 70 céntimos 
		+ y a partir del décimo minuto, 50 céntimos cada minuto.
	
		Se carga un impuesto del 3% cuando es domingo, 
		y si es otro día, 
		en turno de mañana 15% (6-12)
		y en turno de tarde 10%. (12-23)
		y en turno de noche -10%. (23-6)

		Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada


		Acciones:
		Crear una condición que indique que mientras la cantidad de minutos sea mayor a 0 y menor a 5 el coste sea 1 euro. 
		Crear una condición que indique que si la llamada dura más de 5 minutos y menos de 8, el costo de los minutos 6, 7 y 8 sea de 80 céntimos.
		Crear una condición que indique que si la llamada dura más de 8 minutos y menos y hasta 10, el costo de los minutos 9 y 10 sea de 70 céntimos.
		Crear una condición que indique que si la llamada dura más de 10 minutos cada minuto valga 50 céntimos.
		Crear una condición que indique que si la llamada se hace el día domingo la llamada tenga un impuesto derl 3%
		Crear una condición que indique que si la llamada se hace en un día diferente al domingo se aplique:
		15% turno de 06:00am a 12:00m; 10% turno de 12:00m a 23:00pm; -10% turno de 23:00am a 05:59am; 
		
		
		 */
		Scanner entrada=new Scanner(System.in);
		
		int tiempo_llamada=0;
		int dia_semana;
		int hora=0;
		double coste_llamada=0;
		
		System.out.println("Introduce el tiempo de la llamada");
		tiempo_llamada=entrada.nextInt();
		
		
		System.out.println("Introduce el dia de la semana");
		entrada=new Scanner(System.in);
		dia_semana=entrada.nextInt();
		
				
		System.out.println("Introduce la hora de la semana");
		hora=entrada.nextInt();
		
		
		if(tiempo_llamada>0 && tiempo_llamada<=5) {
			if(dia_semana>=1 && dia_semana<7) {
				if(hora>=6 && hora<=12) {
					coste_llamada=1+(1*0.15);
					System.out.println("el coste de la llamada es de "+coste_llamada);
				}else if(hora>12 && hora<23) {
					coste_llamada=1+(1*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}else if((hora>=23 && hora<=24) || ( hora>=0 && hora<6)) {
					coste_llamada=1-(1*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}
				
			}else if(dia_semana==7) {
				
				coste_llamada=1+(1*0.03);
				System.out.println("el coste de la llamada el domingo es de "+coste_llamada);
			}else {
				System.out.println("dia de la semana fuera de rango");
			}
			
			
			
			
		}else if(tiempo_llamada>5 && tiempo_llamada<=8) {
			if(dia_semana>=1 && dia_semana<7) {
				if(hora>=6 && hora<=12) {
					coste_llamada=0.8+(0.8*0.15);
					System.out.println("el coste de la llamada es de "+coste_llamada);
				}else if(hora>12 && hora<23) {
					coste_llamada=0.8+(0.8*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}else if((hora>=23 && hora<=24) || ( hora>=0 && hora<6)) {
					coste_llamada=0.8-(0.8*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}
				
			}else if(dia_semana==7) {
				
				coste_llamada=0.8+(0.8*0.03);
				System.out.println("el coste de la llamada el domingo es de "+coste_llamada);
			}else {
				System.out.println("dia de la semana fuera de rango");
			}
			
		
			
			
			
		}else if(tiempo_llamada>8 && tiempo_llamada<=10) {
			if(dia_semana>=1 && dia_semana<7) {
				if(hora>=6 && hora<=12) {
					coste_llamada=0.7+(0.7*0.15);
					System.out.println("el coste de la llamada es de "+coste_llamada);
				}else if(hora>12 && hora<23) {
					coste_llamada=0.7+(0.7*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}else if((hora>=23 && hora<=24) || ( hora>=0 && hora<6)) {
					coste_llamada=0.7-(0.7*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}
				
			}else if(dia_semana==7) {
				
				coste_llamada=0.7+(0.7*0.03);
				System.out.println("el coste de la llamada el domingo es de "+coste_llamada);
			}else {
				System.out.println("dia de la semana fuera de rango");
			}
			
			
			
			
			
		}else if(tiempo_llamada>10) {
			if(dia_semana>=1 && dia_semana<7) {
				if(hora>=6 && hora<=12) {
					coste_llamada=0.5+(0.5*0.15);
					System.out.println("el coste de la llamada es de "+coste_llamada);
				}else if(hora>12 && hora<23) {
					coste_llamada=0.5+(0.5*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}else if((hora>=23 && hora<=24) || ( hora>=0 && hora<6)) {
					coste_llamada=0.5-(0.5*0.10);
					System.out.println("el coste de la llamada es de "+coste_llamada);
					
				}
				
			}else if(dia_semana==7) {
				
				coste_llamada=0.5+(0.5*0.03);
				System.out.println("el coste de la llamada el domingo es de "+coste_llamada);
			}else {
				System.out.println("dia de la semana fuera de rango");
			}
			
		}else if(tiempo_llamada<=0) {
			System.out.println("....................");
		}
		
	}
	

}
