package arrays;
import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// array bidimensional 4f 8c con los nombres de las personas de la clase
		Scanner s = new Scanner (System.in);
		String [] [] clase = new String [8] [4];
		for (int i = 3; i >=0; i--) {
			for (int j = 0; j < 7; j++) {
				System.out.println("Introduzca a la persona sentada en el puesto "+j+","+i); 
				clase [j][i]= s.nextLine();
			}
		}
		imprimirArray(clase);
	}
	public static void imprimirArray(String [] []array) {
		for (int i = 3; i >=0; i--) {
			for (int j = 0; j < 7; j++) {
				System.out.println(array[j][i]); 	
			}
		}
		System.out.println();
	}
//array bidimensional el usuario mete cuantas filas y columnas quiere y cree cuantos colores aleatorios
	//preguntator
	}

