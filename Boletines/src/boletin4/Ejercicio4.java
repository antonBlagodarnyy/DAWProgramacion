package boletin4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Escribe un programa que calcule el salario semanal de un trabajador
teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.
*/
		Scanner s = new Scanner(System.in);//creamos el escaner
		int sueldo;//declaramos una variable para el resultado
		
		System.out.println("¿Cuántas horas ha trabajado este mes?");
		int h = s.nextInt();//preguntamos las horas trabajadas
		
		if(h<=40) {
			sueldo = h*40;
			System.out.println("Su sueldo es de: "+sueldo);
		} else if( h > 40) {
			sueldo = 40 * 12 + 16 * (h - 40);
			System.out.println("Tiene sueldo extra y es de: "+sueldo);
		} else {
			System.out.println("Valor introducido no valido");
		}
		
		
	}

}
