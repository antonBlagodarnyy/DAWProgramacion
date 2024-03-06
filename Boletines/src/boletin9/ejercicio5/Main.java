package boletin9.ejercicio5;

import boletin9.ejercicio5.bebidas.Azucarada;
import boletin9.ejercicio5.bebidas.Mineral;

public class Main {

	public static void main(String[] args) {
		Almacen almacenTest = new Almacen();
		System.out.println("Almacen vacio: "+almacenTest.toString());
		
		Mineral mineralTest = new Mineral(2,2.5,"Manantial FontBella", Marca.Bezolla);
		Azucarada azucaradaTest = new Azucarada(2,3,0.23,true, Marca.Fanta);
		Azucarada azucaradaTest2 = new Azucarada(2,3,0.23,true, Marca.Fanta);
		almacenTest.agregarProducto(mineralTest);
		almacenTest.agregarProducto(mineralTest);
		almacenTest.agregarProducto(azucaradaTest);
		almacenTest.agregarProducto(azucaradaTest2);
		System.out.println("Almacen con 3 productos:" +almacenTest.toString());
		
		System.out.println("Precios finales:");
		System.out.println(azucaradaTest.getPrecioFinal());
		System.out.println(mineralTest.getPrecioFinal());
		
		System.out.println("Precio total:");
		System.out.println(almacenTest.getPrecioTotal());
	
		System.out.println("Precio estanteria: ");
		System.out.println(almacenTest.getPrecioEstanteria(1));
		
		System.out.println("Eliminamos 2 productos y agregamos 1:");
		almacenTest.eliminarProducto(1);
		almacenTest.eliminarProducto(2);
		almacenTest.agregarProducto(azucaradaTest);
		System.out.println(almacenTest.toString());
		
		System.out.println("Precio de la marca fanta:");
		System.out.println(almacenTest.getPrecioMarca(Marca.Fanta));
		
	}
}
