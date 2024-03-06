package metodos;

import java.util.Scanner;

public class metodos {
	public static void mostrarOpcionesMenu () {
		System.out.println("Elige una de las siguientes opciones");
	   	 System.out.println("1. Sumar dos números");
	   	 System.out.println("2. Restar dos números");

	}

	public static boolean numPar(int n) {
		boolean par;
		if (n % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
	}
	
	public static int opcionSeleccionada () {
		Scanner s = new Scanner (System.in);
		int input;
		do {
		input = s.nextInt();
		if (input<1||input > 2) {
			System.out.println("Valor no valido.\n Introduzca otro valor.");
		}
		}while (input<0||input > 2);
		
		return input;
	}
	
	public static int suma (int n1, int n2) {
		 int s = n1 + n2;
		 return s;
	}
	public static int resta (int n1, int n2) {
		 int s = n1 - n2;
		 return s;
	}
	
	public static void realizarAccionSeleccionada(int i) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un numero:");
		int n1 = s.nextInt();
		System.out.println("Introduzca otro:");
		int n2 = s.nextInt();
		int r= 0;
		if (i==1) {
			r=suma(n1,n2);
		} else if (i==2) {
			r=resta(n1,n2);
		} else {
			System.out.println("Error en opcionSeleccionada");
		}
		System.out.println(r);
	}
}
