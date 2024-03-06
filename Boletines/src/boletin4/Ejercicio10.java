package boletin4;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/* Realiza un programa que diga si un número introducido por teclado es
		par y/o divisible entre 5.*/
		
		Scanner s = new Scanner(System.in);//creamos el escaner
		
		System.out.println("Introduzca un numero");
		 int n = s.nextInt();//pedimos el numero
		 
		if (n % 2 == 0 && n % 5 == 0) {//comprobamos si es par y divisible entre 5.
			System.out.println("Es par y divisible entre 5.");
		}else if(n % 2 == 0) {//comprobamos si es par
			 System.out.println("Es par.");
		 } else  if (n % 5 == 0) {
			 System.out.println("Es divisible entre 5.");//comprobamos si es divisible entre 5 e impar
		 } else {
			 System.out.println("Es impar y no divisible entre 5.");
		 }

	}

}
