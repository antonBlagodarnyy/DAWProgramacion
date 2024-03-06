package boletin8_2.ejercicio5;

public class Main {

	public static void main(String[] args) {
		Entrenador testEntrenador= new Entrenador(1,Nacionalidades.ESP);
		/*Saltador testSaltador = new Saltador("pepe","grillo",Nacionalidades.ESP,testEntrenador);
		
		System.out.println(testSaltador.toString());
		
		testSaltador.saltar();
		
		System.out.println(testSaltador.toString());
		
		System.out.println(testSaltador.getPuntuacion());
		*/
		Competicion competicionTest = new Competicion();
		competicionTest.darAlta("pepe","grillo",Nacionalidades.ESP,testEntrenador);
		competicionTest.darAlta("pinocho","madera",Nacionalidades.ESP,testEntrenador);
		competicionTest.darAlta("abuelo","pinocho",Nacionalidades.ESP,testEntrenador);
		
		competicionTest.simularCompeticion();
		
		System.out.println(competicionTest.verEstado());
	}

}
