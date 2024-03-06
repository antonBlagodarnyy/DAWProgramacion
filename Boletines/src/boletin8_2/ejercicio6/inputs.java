package boletin8_2.ejercicio6;

import java.util.Scanner;

public class inputs {
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
}
