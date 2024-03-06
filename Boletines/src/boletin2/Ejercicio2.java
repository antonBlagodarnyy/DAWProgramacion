package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Desarrolla un programa que calcule la media de 3 números reales. e imprima el resultado por pantalla.
		Scanner s = new Scanner(System.in);
		double x;
		double y;
		double z;
		System.out.println("Introduzca el primer numero:");
		x = s.nextDouble();
		System.out.println("Introduzca el segundo numero:");
		y = s.nextDouble();
		System.out.println("Introduzca el tercer numero:");
		z = s.nextDouble();
		double media = (x+y+z)/3;
		System.out.println("La media de los tres numeros es "+media);
	}

}
