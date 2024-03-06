package arrays;
import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		// 
		Scanner sInt = new Scanner (System.in);
		Scanner sString = new Scanner (System.in);
		System.out.println("Cuantos nombres quiere introducir?");
		int n = sInt.nextInt();
		String [] nombres = new String [n];

		for (int i = 0; i < n; i++) {
			System.out.println("Introduzca el nombre "+(i+1));
			nombres[i]=sString.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Nombre "+(i+1)+": " +nombres[i]);
		}
	}

}
