package boletin8_2.ejercicio1;
 
public class Main {

	public static void main(String[] args) {
		Menu.crearClave();
		
	Cerrojo cerrojo = new Cerrojo(Menu.inputBetween2Num(100, 999));
	int input = 0;
	do{
		Menu.Menu();
		input=Menu.inputBetween2Num(1, 4);
		switch(input) {
		case 1:
			System.out.println("Introduzca la clave del cerrojo:");

			if(cerrojo.combinacionValida(Menu.inputBetween2Num(100, 999))) {
				System.out.println("Introduzca la clave nueva.");
				cerrojo.setCombinacion(Menu.inputBetween2Num(100, 999));
				System.out.println("Combinacion cambiada.");
			} else
				System.out.println("Combinacion no valida.");
		break;
		
		case 2:
			if(!cerrojo.getAbierto()) {
				System.out.println("Introduzca la clave del cerrojo");
				if(cerrojo.abrirCerrojo(Menu.inputBetween2Num(100, 999))) {
					System.out.println("Cerrojo abierto");
				} else
					System.out.println("No se ha abierto el cerrojo");
			} else
				System.out.println("El cerrojo ya esta abierto");
			
			break;
			
		case 3:
			cerrojo.cerrarCerrojo();
			System.out.println("Cerrojo cerrado.");
			break;
		case 4:
			System.out.println("Adios");
		default:
			System.out.println("Input no valido");
			break;
		}
	}while(input!=4);
	
	
	}

}
