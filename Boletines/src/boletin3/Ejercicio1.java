package boletin3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Un alumno desea saber cuál será su calificación final en la materia de Programación.
		 * Dicha calificación se compone de los siguientes porcentajes:
		 * 		55% Del promedio de sus tres calificaciones parciales.
		 * 		30% De la calificación del examen final.
		 * 		15% De la calificación de un trabajo final.
		 * Asigna las calificaciones que creas conveniente (entre 1 y 10) e imprime los valores de todas las notas,
		 * así como la calificacción final.
		 */
		
//Creamos el escaner.
		Scanner s = new Scanner(System.in);
		
//Asignamos las notas del alumno.
		System.out.println("Introduzca la nota del primer parcial");
int calificacionParcial1 = s.nextInt();
System.out.println("Introduzca la nota del segundo parcial");
int calificacionParcial2 =  s.nextInt();
System.out.println("Introduzca la nota del tercer parcial");
int calificacionParcial3 =  s.nextInt();

System.out.println("Introduzca la nota del examen final");
int calificacionFinal =  s.nextInt();
System.out.println("Introduzca la nota del trabajo final");
int calificacionTrabajoFinal = s.nextInt();

//Calculamos las notas de los parciales.
int promedioCalificacionParcial = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3)/3;

//Calculamos la calificacion del curso.
double calificacionCurso = (promedioCalificacionParcial*0.55)+(calificacionFinal*0.30)+(calificacionTrabajoFinal*0.15);
System.out.println("El alumno tiene un "+calificacionCurso);

	}

}
