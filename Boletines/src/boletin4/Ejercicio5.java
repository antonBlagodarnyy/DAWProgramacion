package boletin4;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Realiza un programa que pida 3 notas y calcule su media.
		//El programa ha de indicar la nota en formato boletín (insuficiente, suficiente, bien,
		//notable o sobresaliente).
		
		Scanner s = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;//declaramos las variables
		
		
		System.out.println("¿Qué nota has sacado en tu primer examen?");//pedimos todas las notas
		nota1 = s.nextInt();
		System.out.println("¿En el segundo?");
		nota2 = s.nextInt();
		System.out.println("¿Y en el tercero?");
		nota3 = s.nextInt();
		
		media = (nota1 + nota2 + nota3)/3;//calculamos la media
		
		if (media <5 && media > 0) {
			System.out.println("Insuficiente");
		} else if (media == 5) {
			System.out.println("Suficiente");
		} else if (media >= 6 && media < 7) {
			System.out.println("Bien");
		} else if (media >=7 && media < 9) {
			System.out.println("Notable");
		} else if (media >= 9 && media<=10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Valor introducido no valido");
		}
		
	}

}
