package boletin9.ejercicio4;

import java.time.LocalDate;

import boletin9.ejercicio4.tiposBarcos.Deportivo;
import boletin9.ejercicio4.tiposBarcos.Velero;
import boletin9.ejercicio4.tiposBarcos.Yate;

public class Main {
	public static void main(String[] args) {
		Yate yateTest = new Yate("yateMatricula",4,1982,45,6);
		Deportivo deportivoTest = new Deportivo("deportivoMatricula",2,2005,70);
		Velero veleroTest = new Velero("veleroMatricula",8,2001,8);
		System.out.println(yateTest.toString());
		System.out.println(deportivoTest.toString());
		System.out.println(veleroTest.toString());
		
		Alquiler alquilerYateTest = new Alquiler("Pepe","pepedni",LocalDate.of(2008, 9, 27),LocalDate.of(2008, 9,30),1,3,yateTest);
		System.out.println(alquilerYateTest.toString());
		Alquiler alquilerDeportivoTest = new Alquiler("Pepe","pepedni",LocalDate.of(2008, 9, 27),LocalDate.of(2008, 9,30),1,3,deportivoTest);
		System.out.println(alquilerDeportivoTest.toString());
		Alquiler alquilerVeleroTest = new Alquiler("Pepe","pepedni",LocalDate.of(2008, 9, 27),LocalDate.of(2008, 9,30),1,3,veleroTest);
		System.out.println(alquilerVeleroTest.toString());
	
	}

}
