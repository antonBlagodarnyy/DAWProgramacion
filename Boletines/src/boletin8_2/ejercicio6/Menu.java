package boletin8_2.ejercicio6;

public class Menu {
	public static void printMenu(){
		System.out.println("Que desea realizar?\n"
				+ "1. Cargar datos de prueba\n"
				+ "2. Registrar entrada de vehiculo\n"
				+ "3. Registrar salida de vehiculo\n"
				+ "4. Salir del programa");
		}
	
	//TO-DO Antes de hacer los sysout, necesito la clase aparcamiento *CHECK*
	public static void pedirMatricula() { System.out.println("¿Cual es su matricula?\n"); }
	
	public static void cocheAparcado(int plazaLibre){ System.out.println("El coche se aparcara en la plaza numero :"+plazaLibre+"\n");}

	public static void matriculaNoEncontrada() {System.out.println("No hay ningún coche con dicha matrícula ");}
	
	public static void pedirHoras() {System.out.println("Cuantas horas ha estado?");}
	
	public static void darImporte(double importe) {System.out.println("El importe a pagar es de "+importe+"€");}

	public static void end() {System.out.println("Fin del programa");}
	
	public static void sinPlazas() {System.out.println("No quedan plazas en el aparcamiento");
	}
}
