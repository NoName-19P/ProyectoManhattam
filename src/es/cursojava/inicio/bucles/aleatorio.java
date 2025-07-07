package es.cursojava.inicio.bucles;

import java.util.Random;

public class aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random =new Random();
		int aleatorio = random.nextInt(5)+1;
		System.out.println(aleatorio);
	}

}
