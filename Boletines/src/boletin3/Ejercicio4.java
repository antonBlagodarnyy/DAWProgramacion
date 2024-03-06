package boletin3;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* El dueño de una tienda compra un artículo a un precio determinado.
		 * Obtener el precio a que lo debe vender para obtener una ganancia del 30%. 
		 * Asigna el precio que creas conveniente, e intenta realizarlo utilizando operadores con asignación (*=,+=,-=...)
		 */
		
		//Creamos el escaner.
				Scanner s = new Scanner(System.in);
		//Pedimos el precio
				System.out.println("Introduzca el precio del articulo");
				double precio = s.nextDouble();
				
		//Le sumamos el 30%
				precio*=1.3;
				System.out.println("Lo debería vender a "+precio+"€ para obtener un beneficio del 30%");

	}

}
