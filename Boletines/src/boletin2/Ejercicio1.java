package boletin2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Desarrolla un programa que calcule la media de 3 números enteros, e imprima el resultado por pantalla.
		//Ojo, los tres números iniciales con enteros, pero el resultado puede no serlo.
		
		Scanner s = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("Introduzca el primer numero:");
		x = s.nextInt();
		System.out.println("Introduzca el segundo numero:");
		y = s.nextInt();
		System.out.println("Introduzca el tercer numero:");
		z = s.nextInt();
		double media =(double)( (x+y+z)/3);
		System.out.println("La media de los tres numeros es "+media);
		
	}

}
