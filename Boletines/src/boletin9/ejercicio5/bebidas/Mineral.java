package boletin9.ejercicio5.bebidas;

import boletin9.ejercicio5.Bebida;
import boletin9.ejercicio5.Marca;
import boletin9.ejercicio5.interfaces.IBebida;

public class Mineral extends Bebida implements IBebida {
	//Atributos
	private String origen;
	

	//Metodos
	public Mineral(int litros, double precioBase, String mineral, Marca marca) {
		super( litros, precioBase,marca);
		this.origen = mineral;

	}

	@Override
	public String toString() {
		return super.toString()+"Mineral [mineral=" + origen + "  ]";
	}



	
}
