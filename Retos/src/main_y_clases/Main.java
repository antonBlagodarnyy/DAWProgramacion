package main_y_clases;

public class Main {

	public static void main(String[] args) {
		
naveEspacial naveTest = new naveEspacial("Apollo", 8, 20);
System.out.println(naveTest.toString());

naveTest.despegar(1412);
System.out.println(naveTest.toString());
naveTest.aterrizar(1856);
System.out.println(naveTest.toString());

naveTest.acelerar(12.3);
System.out.println(naveTest.toString());

naveTest.cargarCarga(14);
System.out.println(naveTest.toString());
naveTest.cargarCarga(1400);
System.out.println(naveTest.toString());

naveTest.descargarCarga(100);
System.out.println(naveTest.toString());

naveTest.descargarCarga(250);
System.out.println(naveTest.toString());

	}

}
