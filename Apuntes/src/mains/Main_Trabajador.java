package mains;

import abstracts.Trabajador;
import objetos.persona.Comisionista;
import objetos.persona.Trabajador_fijo;

public class Main_Trabajador {
	public static void main(String[] args) {
	Trabajador_fijo trabajador_fijoTest = new Trabajador_fijo(1300);
	Comisionista comisionistaTest = new Comisionista();
	
	Trabajador trabajador_fijoTestTrabajador = (Trabajador) trabajador_fijoTest;
	Trabajador comisionistaTestTrabajador = (Trabajador) comisionistaTest;
	
	trabajador_fijoTest.cobrar();
	comisionistaTestTrabajador.cobrar(1200);
	System.out.println(comisionistaTestTrabajador.toString());
	System.out.println(trabajador_fijoTest.toString());
	
	trabajador_fijoTest.cobrar(1200);
	comisionistaTestTrabajador.cobrar();
	System.out.println(comisionistaTestTrabajador.toString());
	System.out.println(trabajador_fijoTest.toString());
	}
	
			
}
