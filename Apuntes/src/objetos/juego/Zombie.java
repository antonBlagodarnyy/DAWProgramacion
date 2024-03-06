package objetos.juego;

public class Zombie {

	public  void atacar(Persona pp) {
		pp.setVida(pp.getVida()-5);
	}
}
