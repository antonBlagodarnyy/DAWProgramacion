package boletin2;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Suponiendo que ingresamos 5000 euros en un banco que nos paga el 6% de interes, 
		 * calcula el dinero que tendremos después de un año. 
		 * Imprima el resultado por pantalla.*/
		int ingreso = 5000;
		double interes = 0.06;
		double interesObtenido = ingreso * interes;
		double saldo = ingreso + interesObtenido;
		
		System.out.println("Su ingreso es de: "+ingreso+"\nSu interes del: "+interes+"\nSu saldo de :"+saldo);

	}

}
