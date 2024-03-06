package boletin7.metodos;
import java.util.Scanner;

public class Metodos6 {
	
public static int [] array20con0() {//crea el avion
	
	int array [] = new int [20];//array de 20 ints
	for (int i = 0; i<20;i++) {
		array [i]= 0;//asigna los asientos vacios
	}
	return array;
}

public static String welcome() {
	String mensaje = "Bienvenido al asistente de seleccion de asientos de Aerolineas DAW.\n";
			return mensaje;
}
	public static boolean fumador () {
		Scanner s = new Scanner (System.in);
		int input = -1;
		boolean fumador;
		System.out.println("Es usted fumador?\n"
				+ "1.-Si.\n"
				+ "2.-No.\n");
		do {
			input = s.nextInt();
			if (input <1 || input > 2 ) {
				System.out.println("Valor no valido, vuelva a introducirlo.");
			}
		}while (input <1 || input >2);
		if (input ==1) {
			fumador =true;
		} else {
			fumador = false;
		}
		return fumador;
	}

	public static boolean disponibilidad (boolean fumador, int [] avion) {
		boolean disponible = false;
		if (!fumador) {
			for (int i = 0; i<15; i++) {
				if (avion[i] == 0) {
					disponible = true;
					break;
				}
			}
		} else {
			for (int i = 16; i<20; i++) {
				if (avion[i]== 0) {
					disponible = true;
					break;
				}
			}
		}
		return disponible;
	}
	public static boolean continuar () {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		int input = 0;
		System.out.println("¿Desea asignar otro asiento?\n"
				+ "1.-Si.\n"
				+ "2.-No.");
		do {
			input = s.nextInt();
			if ( input <1|| input > 2) {
				System.out.println("Valor no valido");
			}
			
		} while (input < 1 || input >2);
		if (input == 1) {
			continuar = true;
		} else {
			continuar = false;
		}
		return continuar;
	}
	
	public static int [] asignarAsientoNoFumador(int [] avion) {
		for (int i = 0; i<15; i++) {
			if (avion [i] != 1) {
				avion [i] = 1;
				break;
			}
		}
		return avion;
	}
	public static int imprimirAsientoNoFumador(int [] avion) {
		int n=0;
		for (int i = 15; i>0; i--) {
			if (avion[i]==1) {
				n = i;	
				break;
			}
		}
		return n;
	}

	public static int [] asignarAsientoFumador (int [] avion) {
		for (int i = 16; i<20; i++) {
			if (avion [i] != 1) {
				avion [i] = 1;
				break;
			}
		}
		return avion;
	}
	public static int imprimirAsientoFumador(int [] avion) {
		int n=0;
		for (int i = 19; i>15; i--) {
			if (avion[i]==1) {
				n = i;	
				break;
			}
		}
		return n;
	}
	
	public static boolean cambioAsiento (boolean fumador) {
			return !fumador;
	}
	
	public static void proximoVuelo() {
		System.out.println("El proximo vuelo parte a las 19:30 del dia de hoy.");
	}
}
