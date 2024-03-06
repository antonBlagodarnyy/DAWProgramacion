package boletin4;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa en que dado un número del 1 a 7 escriba 
		//el correspondiente nombre del día de la semana.
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un numero del 1 al 7");
		num = s.nextInt();
		
		switch (num) {
		case 1: System.out.println("Es lunes");
		break;
		case 2: System.out.println("Es martes");
		break;
		case 3: System.out.println("Es miercoles");
		break;
		case 4: System.out.println("Es jueves");
		break;
		case 5: System.out.println("Es viernes");
		break;
		case 6: System.out.println("Es sabado");
		break;
		case 7: System.out.println("Es domingo");
		break;
		default: System.out.println("Valor numero no valido");
		}
	}

}
