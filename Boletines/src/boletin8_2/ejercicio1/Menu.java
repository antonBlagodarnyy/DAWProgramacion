package boletin8_2.ejercicio1;

import java.util.Scanner;

public class Menu {
	
	public static void crearClave() {
		System.out.println("Introduzca la clave del cerrojo.\n"
				+ "Recuerde que debe ser una serie de 3 numeros.");
	}
	public static void Menu() {
		System.out.println("Que desea hacer?\n"
				+ "1.-Cambiar la clave del cerrojo\n"
				+ "2.-Abrir el cerrojo\n"
				+ "3.-Cerrar el cerrojo\n"
				+ "4.-Salir del programa.");
	}
	
	/**Valida que un valor introducido por teclado este 
	 * comprendido en un tramo determinado.
	 * Valores limites incluidos.
	 * 
	 * @param: int a: valor inicial
	 * @param:int b: valor final
	 * @return:int input: Valor comprendido entre esos 2.
	 */
	public static int inputBetween2Num(int a, int b) {
		
		Scanner s = new Scanner(System.in);

		int input = 0;
		do {

			input = s.nextInt();
			if (input < a || input > b) {
				System.out.println("valor no valido");

			}
		} while (input<a||input>b);
		return input;
	}
	
	/**recoge una respuesta entre 1 y 2 del usuario y devuelve verdadero o falso
	 * @return:boolean statement: En funcion de la respuesta del usuario.
	 */
	public boolean input1o2(){
		
		Scanner sInt = new Scanner(System.in);
		int input ;
		boolean statement = false;
		do {
			input = sInt.nextInt();

			if (input==1) {
				statement=true;
			} else if (input==2) {
				statement = false;
			} else {
				System.out.println("valor no valido");
			}

		} while (input!=1||input!=2);

		return statement;
	}
}
