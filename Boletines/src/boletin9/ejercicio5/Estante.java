package boletin9.ejercicio5;

import java.util.Arrays;

import boletin9.ejercicio5.interfaces.IAlmacen;

public class Estante {
//Atributos
	private Bebida [] estante = new Bebida [IAlmacen.NUM_BEBIDAS];
	private int idEstante;
	public static int contadorEstanteId=1;
	
	//Metodos
	public Estante() {
			this.idEstante = contadorEstanteId;
		contadorEstanteId++;
		
	}

	public Bebida[] getEstante() {
		return estante;
	}
	public void setEstante(Bebida[] estante) {
		this.estante = estante;
	}
	public int getId() {
		return idEstante;
	}
	
	public static int getContadorEstanteId() {
		return contadorEstanteId;
	}
	public static void setContadorEstanteId(int contadorEstanteId) {
		Estante.contadorEstanteId = contadorEstanteId;
	}

	@Override
	public String toString() {
		return "Estante =" + Arrays.toString(estante) + ", id=" + idEstante + "]";
	}
	
}
