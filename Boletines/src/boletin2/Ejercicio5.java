package boletin2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Desarrolla un programa que transforme 86 grados Fahrenheit a Celsius y 33 grados Celsius a Fahrenheit. Imprima el resultado por pantalla.
double fahrenheit = 86;
double celsius = 33;

		double conversion1 = fahrenheit-32/9*5;
		double conversion2 = celsius*9/5+32;
		System.out.println("86 grados fahrenheit es igual a "+conversion1+" Celsius.");
		System.out.println("33 grados celsius es igual a "+conversion2+" Fahrenheit");
	}

}
