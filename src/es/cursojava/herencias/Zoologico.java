package es.cursojava.herencias;

public class Zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vaca v=new Vaca("Noname",200,123,2);
		
		Animal animal=new Vaca("dsdad",212,12,121);
		//Esto no se puede hacer
		//Vaca animal2=new Animal();
		//todos los tipo son animles pero no todas los objetos son animales
		
		Lobo lobo =new Lobo("Tutankamon",100,222,2);
		lobo.comer();

	}

}
