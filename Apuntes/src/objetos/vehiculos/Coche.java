package objetos.vehiculos;

import enums.MarcaCoche;

public class Coche {
	//Atributos
	private String modelo;
	private String matricula;
	private MarcaCoche marca;
	private int km;
	
	
	private static int kmTotales;
	private static int cochesCreados=0;
//Metodos
	//constructor
	public Coche(String modelo,String matricula) {
		this.modelo=modelo;
		this.matricula=matricula;
		cochesCreados++;
	}
	
	//Setter y getter
	public static int getCochesCreados() {
		return cochesCreados;
	}
	
	public void setKm(int km) {
		this.km=km;
		this.kmTotales+=km;
	}
	public int getKm() {
		return km;
	}
	
	public static int getKmTotales() {
		return kmTotales;
	}
}
