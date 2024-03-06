package objetos.juego;

public class ZombieAnimal extends Zombie{

	@Override public void atacar(Persona pp) {
		pp.setVida(pp.getVida()-10);
	}
}
