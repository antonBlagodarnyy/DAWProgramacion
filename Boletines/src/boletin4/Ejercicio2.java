package boletin4;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		/* Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
		buenas tardes o buenas noches según la hora. 
		Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
		Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.*/
		Scanner s = new Scanner(System.in);
		int hora;
		System.out.println("¿Qué hora es?");
			hora = s.nextInt();//pedimos y atribuimos el valor de hora.
			
			if (hora>=6 && hora <=12) {//primer tramo horario
				System.out.println("Buenos días");
				
			} else if (hora>=13 && hora <= 20) {//segundo tramo horario
				System.out.println("Buenas tardes");
				
			} else if(hora>=21 && hora<=24 || hora > 0 && hora <= 5) {//tercer tramo horario
				System.out.println("Buenas noches");
				
			} else {//todos los demas valores de un int
				System.out.println("Valor \"hora\" no valido");
			}
			
			//Trate de hacerlo primeramente en un switch pero los cases solo admiten igualdad
			/*switch (hora) {
			case (hora>=6 && hora <=12) : System.out.println("Buenos días");
			break;
			case(hora>=13 && hora <= 20) : System.out.println("Buenas tardes");
			break;
			case(hora>=21 && hora<=24 || hora > 0 && hora <= 5 ): System.out.println("Buenas noches");
			default: System.out.println("Valor \"hora\" no valido");
			}*/
		
	}

}
