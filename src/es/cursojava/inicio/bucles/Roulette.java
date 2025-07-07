package es.cursojava.inicio.bucles;

import java.util.Random;
import java.util.Scanner;

public class Roulette {
	/*
	 * ============================ Ruleta ============================
	 * 
	 * Facil ============================ saldo = 500
	 * 
	 * ¿Por qué numero quieres apostar? (0-36) Si es otro numero numero se vuelve a
	 * formular la pregunta
	 * 
	 * ¿Cuánto dinero quieres apostar? Si el importe de la apuesta es > que el saldo
	 * disponible por el usuario, se notifica y se vuelve a formular la pregunta
	 * 
	 * De manera aleatoria generar un nº entre 0 y 36
	 * 
	 * Si el numero apostado es = al nº aleatorio, se multiplica lo apostado *36 y
	 * se suma al saldo no apostado Si no lo es le restamos del saldo la cantidad
	 * apostada
	 * 
	 * Si tiene saldo le perguntamos ¿Quieres seguir jugando? si dice que no le
	 * indicamos el saldo con el que se va y si no tiene saldo le indicamos que se
	 * ha quedado sin dinero.
	 * 
	 * 
	 * Dificil ============================ Preguntar a qué juego quiere jugar
	 * (Número,Par/Impar,Bloques)
	 * 
	 * + Si la apuesta es par/impar y se gana, se multiplica lo apostado *2 + Si la
	 * apuesta es Bloques y se gana, se multiplica lo apostado *5 (1-12,13-24,25-36)
	 * 
	 */
	static int opcion;
	static String respuesta;
	static double saldo = 500;
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double apuesta = 0;
		int numero_apuesta = 0;
		int numero_par_impar = 0;
		int docena = 0;

		do {
			System.out.println("******** MENU RULETA **********");
			System.out.println("1)JUGAR POR NUMERO");
			System.out.println("2)JUGAR POR PAR O IMPAR");
			System.out.println("3)JUGAR POR DOCENA");
			System.out.println("4)Salir");
			System.out.println("Introduce una opcion");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:

				do {
					System.out.println("JUGAR POR NUMERO");

					System.out.println("Tienes " + saldo + " euros");
					System.out.println("Cuanto dinero quieres apostar");
					apuesta = entrada.nextDouble();

					while (apuesta > saldo || apuesta <= 0) {
						System.out.println("Vuelve  introducir el dinero q quieres apostar");
						apuesta = entrada.nextDouble();
					}

					System.out.println("Por que numero quieres apostar entre el 1 y 2");
					numero_apuesta = entrada.nextInt();

					while (numero_apuesta < 0 || numero_apuesta > 36) {
						System.out.println("Numero erroneo ,Vuelve a introducir el numero de apuesta");
						numero_apuesta = entrada.nextInt();
					}

					Random random = new Random();
					int aleatorio = random.nextInt(5) + 1;

					if (numero_apuesta == aleatorio) {

						saldo = (apuesta * 2) + (saldo - apuesta);
						System.out.println("Has ganado, tus ganancias son " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					} else {

						saldo = saldo - apuesta;
						System.out.println("Has perdido , tu saldo es de " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					}

				} while (respuesta.equalsIgnoreCase("si") && saldo > 0);

				System.out.println("Has salido ,tu saldo actual es de " + saldo);

				break;

			case 2:

				do {
					System.out.println("JUGAR POR PAR O IMPAR");

					System.out.println("Tienes " + saldo + " euros");
					System.out.println("Cuanto dinero quieres apostar");
					apuesta = entrada.nextDouble();

					while (apuesta > saldo || apuesta <= 0) {
						System.out.println("Vuelve  introducir el dinero q quieres apostar");
						apuesta = entrada.nextDouble();
					}

					System.out.println("APOSTAR PAR == 0 O IMPAR ==1");
					numero_par_impar = entrada.nextInt();

					while (numero_par_impar < 0 || numero_par_impar > 1) {
						System.out.println("Vuelve a introducir par ==0 o impar==1");
						numero_par_impar = entrada.nextInt();
					}

					Random random = new Random();
					int aleatorio = random.nextInt(36) + 1;
					System.out.println("numero generado == " + aleatorio);

					if (aleatorio % 2 == numero_par_impar) {

						saldo = (apuesta * 2) + (saldo - apuesta);
						System.out.println("Has ganado, tus ganancias son " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					} else {

						saldo = saldo - apuesta;
						System.out.println("Has perdido , tu saldo es de " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					}

				} while (respuesta.equalsIgnoreCase("si") && saldo > 0);

				System.out.println("Has salido ,tu saldo actual es de " + saldo);

				break;
			case 3:
				do {
					System.out.println("JUGAR POR DOCENA");

					System.out.println("Tienes " + saldo + " euros");
					System.out.println("Cuanto dinero quieres apostar");
					apuesta = entrada.nextDouble();

					while (apuesta > saldo || apuesta <= 0) {
						System.out.println("Vuelve  introducir el dinero q quieres apostar");
						apuesta = entrada.nextDouble();
					}

					System.out.println("APOSTAR POR DOCENA : 1)PRIMERA DOCENA  2)SEGUNDA DOCENA  3)TERCERA DOCENA ");
					docena = entrada.nextInt();

					while (numero_par_impar < 0 || numero_par_impar > 3) {
						System.out.println("Vuelve a introducir :  1)PRIMERA DOCENA  2)SEGUNDA DOCENA  3)TERCERA DOCENA");
						docena = entrada.nextInt();
					}

					Random random = new Random();
					int aleatorio = random.nextInt(3) + 1;
					System.out.println("numero generado == " + aleatorio);

					if (aleatorio  == numero_par_impar) {

						saldo = (apuesta * 2) + (saldo - apuesta);
						System.out.println("Has ganado, tus ganancias son " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					} else {

						saldo = saldo - apuesta;
						System.out.println("Has perdido , tu saldo es de " + saldo + " Quieres seguir jugando?");
						respuesta = entrada.next();

					}

				} while (respuesta.equalsIgnoreCase("si") && saldo > 0);

				System.out.println("Has salido ,tu saldo actual es de " + saldo);

				break;

			}

		} while (opcion != 4);
		System.out.println("HAS SALIDO");
	}

}
