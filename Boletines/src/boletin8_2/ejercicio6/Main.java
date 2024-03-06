package boletin8_2.ejercicio6;

public class Main {

	public static void main(String[] args) {
		/*Coche testCoche = new Coche("4256 - BYZ", 2);
		Deportivo testDeportivo = new Deportivo("2367- FFR",3,"rojo");
		Deportivo testDeportivo2 = new Deportivo("46789- ZTG",3,"amarillo");
		
		System.out.println(testCoche.toString());
		System.out.println(testDeportivo.toString());
		System.out.println(testDeportivo2.toString());
*/
		
		/*Aparcamiento aparcamientoTest = new Aparcamiento();
		
		aparcamientoTest.cargarDatos();
		
		System.out.println(aparcamientoTest.toString());
		
		aparcamientoTest.registrarEntrada();
		aparcamientoTest.registrarEntrada();
		
		aparcamientoTest.registrarSalida();
		
		System.out.println(aparcamientoTest.toString());
	*/
		Aparcamiento aparcamientoTest = new Aparcamiento();
		int input = 0;
		do {
			Menu.printMenu();
			input=inputs.inputBetween2Num(1, 4);
			switch(input) {
			case 1:
				aparcamientoTest.cargarDatos();
				System.out.println(aparcamientoTest.toString());
				break;
			case 2:
				aparcamientoTest.registrarEntrada();
				System.out.println(aparcamientoTest.toString());
				break;
			case 3:
				aparcamientoTest.registrarSalida();
				System.out.println(aparcamientoTest.toString());
				break;
			case 4:
				Menu.end();
				break;
			}
		}while(input!=4);
		
	}

}
