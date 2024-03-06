package mains;


import objetos.vehiculos.CamionFrig;

public class Main_CamionFrigorifico {

	public static void main(String[] args) {
		CamionFrig camionFrigTest = new CamionFrig("12345X");
		System.out.println(camionFrigTest.toString());

		camionFrigTest.arrancar();
		camionFrigTest.encender();
		camionFrigTest.acelerar();
		camionFrigTest.acelerar();
		camionFrigTest.acelerar();
		camionFrigTest.frenar(2);
		camionFrigTest.regularTemp(25);
		System.out.println(camionFrigTest.toString());
		
	}

}
