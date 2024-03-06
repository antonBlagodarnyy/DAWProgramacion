package boletin4;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Escribe un programa que pida por teclado un día de la semana
		y que imprima por pantalla qué asignatura toca a primera hora ese día.
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("¿Que dia de la semana es?");
		String dia = s.nextLine();//pedimos el dia de la semana
		
		if (dia == "lunes") {//atribuimos a cada dia una frase
			System.out.println("Toca base de datos");
		} else if (dia == "martes") {
			System.out.println("Toca programacion");
		} else if (dia == "miercoles") {
			System.out.println("Toca sistemas informaticos");
		} else if ( dia == "jueves") {
			System.out.println("Toca programacion");
		} else if ( dia == "viernes") {
			System.out.println("Toca base de datos");
		}
		
		
	}

}
