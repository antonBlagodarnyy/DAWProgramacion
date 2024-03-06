package boletin4;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Realiza un minicuestionario con 3 preguntas tipo test sobre la asignatura
		de programación. Cada pregunta tiene 3 respuestas, pero solo una válida.
		Cada pregunta acertada sumará un punto. El programa mostrará al final la
		calificación obtenida.
		Ejemplo de pregunta tipo test.
		Cúal de estas sentencias genera un error:
		1 – int i = “1”;
		2 – int i = -1;
		3 – int i = (int)2.2;
		Respuesta: (el usuario tendría que responder aquí)*/

		Scanner s = new Scanner(System.in);
		int respuesta1, respuesta2, respuesta3, puntuacion = 0;
		
		System.out.println("Pregunta 1: ¿Cuál de estas sentencias no genera un error?\n"
				+ "1 - String s = 4;\n"
				+ "2 - String s = cuatro;\n"
				+ "3- String s = \"cuatro\";\n"
				+ "Respuesta:");
		respuesta1 = s.nextInt();
		if (respuesta1 == 3) {
			puntuacion ++;
		}
		
		System.out.println("Pregunta 2: ¿Cuál de las siguientes sentencias incrementa un valor en 1?\n"
				+ "1 - Int i ++;\n"
				+ "2 - i ++;\n"
				+ "3- i +;\n"
				+ "Respuesta:");
		respuesta2 = s.nextInt();
		if (respuesta2 == 2) {
			puntuacion ++;
		}
		
		System.out.println("Pregunta 3: ¿Cuál de las siguientes palabras no es una palabra clave de Java?\n"
				+ "1 - this\n"
				+ "2 - try\n"
				+ "3- full\n"
				+ "Respuesta:");
		respuesta3 = s.nextInt();
		if (respuesta3 == 3) {
			puntuacion ++;
		}
		
		System.out.println("Su puntuacion es de: "+puntuacion);
	}

}
