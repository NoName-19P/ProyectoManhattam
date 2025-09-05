package es.cursojava.metodos;

import java.util.Random;

import es.cursojava.utils.Ahorcado;

/*
 * ercicio 6 - Ahorcado
====================================================================================
A partir de los siguientes 3 arrays

String[] sujetos = {
    "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
    "La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino"
};

String[] verbos = {
    "come", "pinta", "busca", "rompe", "salta", "canta",
    "lava", "lee", "mueve", "atrapa", "conduce", "enciende"
};

String[] complementos = {
    "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
    "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego"
};

Generar una frase de manera aleatoria.
Solicitar el nombre del jugador, mostrar de manera inicial todos los caracteres 
de la frase con "_"
Ejemplo:
	El gato come una manzana
	__ ____ ____ ___ _______
	  
Solicitar al usuario letras si acierta la letra se mostrará la letra acertada
Ejemplo: a
	__ _a__ ____ __a _a__a_a

Ejemplo: i
	Letra no encontrada. Intentos restantes: 5
	__ _a__ ____ __a _a__a_a

 
Intentar adivinar la frase antes de fallar seis intentos.
Si no falla en 6 ocasioes el usuario pierde.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro", "La profesora",
//				"Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };
//
//		String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve", "atrapa",
//				"conduce", "enciende" };
//
//		String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
//				"el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };


		Ahorcado.hangMan();
	}

	

	}


