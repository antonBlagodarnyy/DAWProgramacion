package mains;

import objetos.juego.Persona;
import objetos.juego.Zombie;
import objetos.juego.ZombieAnimal;

public class Main_Juego {

	public static void main(String[] args) {
		Zombie normal = new Zombie();
		Zombie elite = new ZombieAnimal();
		Persona uno= new Persona(20);
		Persona dos= new Persona(20);
normal.atacar(uno);
elite.atacar(dos);
	System.out.println(uno.getVida());
	System.out.println(dos.getVida());
	}

}
