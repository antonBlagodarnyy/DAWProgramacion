package boletin1;


public class Ejercicio04 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre tu horario de clase. Puedes usar
		 * tabuladores(\t) y saltos de lineas (\n) para alinear el texto. Intenta rodear
		 * todo el horario con * de forma que quede como un recuadro de asteriscos, así
		 * quedá más bonito.
		 */

		System.out.printf("*%5s  %-10s  %-10s  %-10s  %-10s  %-10s*  \n", "", "Lunes", "Martes", "Miercoles", "Jueves",
				"Viernes");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 15.45, "Libre", "Libre", "Libre", "LMS",
				"Libre");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 16.46, "Libre", "Libre", "LMS", "LMS",
				"Libre");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 17.45, "EIE", "Libre", "LMS", "Libre",
				"EIE");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 19.00, "ENDES", "Libre", "Libre", "Libre",
				"EIE");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 20.00, "Libre", "ENDES", "Libre", "Libre",
				"Libre");
		System.out.printf("*%3.2f  %-10s  %-10s  %-10s  %-10s  %-10s* \n", 21.00, "Libre", "ENDES", "Libre", "Libre",
				"Libre");

		// bucle for para imprimir la ultima línea
		for (int i = 0; i < 67; i++) {
			System.out.print("*");
		}
	}
}
