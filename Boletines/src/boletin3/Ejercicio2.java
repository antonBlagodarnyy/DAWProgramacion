package boletin3;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Un profesor  desea saber el porcentaje de hombres y el porcentaje
		 *  de mujeres hay en un grupo de estudiantes, sabiendo que hay 3 mujeres y 22 hombres. Imprime ambos porcentasjes por pantalla.*/
		
		//Definimos la cantidad de cada uno que hay.
		double hombres = 22;
		 double mujeres = 3;
		 
		 //Calculamos el total.
		 double total = hombres + mujeres;
		 
		 //Calculamos los porcentajes
		 double porcentHombres = hombres/total*100;
		 double porcentMujeres = mujeres/total*100;
		 
		 //Los imprimimos
		 System.out.println("Hay un "+porcentHombres+"% de hombres.");
		 System.out.println("Hay un "+porcentMujeres+"% de mujeres.");
		 
	}

}
