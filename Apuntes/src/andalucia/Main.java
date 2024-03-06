package andalucia;

public class Main {


	public static void main(String[] args) {
		try {
			Monumento giralda = new Monumento("Giralda");
			Monumento torreDelOro = new Monumento("La Torre del oro de Sevilla ");
		} catch (Exception e) {
			System.out.println("No ha pasado nada");
		} finally {
			System.out.println("Adios usuario");
		}
	}

}
