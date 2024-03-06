package mains;
import java.util.Scanner;

import metodos.metodos;

public class Main_Metodos {
	public static void main(String[] args) {
	//declaracion variables
		int opcionSeleccionada;
		metodos.mostrarOpcionesMenu();
		opcionSeleccionada=metodos.opcionSeleccionada();
		
		metodos.realizarAccionSeleccionada(opcionSeleccionada);
	}
}
