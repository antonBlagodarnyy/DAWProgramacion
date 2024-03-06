package boletin8_1.ejercicio4;

public class Main {

	public static void main(String[] args) {
		//Creamos tamagochi
		Piratagochi Atun = new Piratagochi("Atun");
		
		//Queremos ver su estado
		System.out.println(Atun.toString());
		
		//Sus necesidades
		System.out.println(Atun.getNecesidades());
	}

}
