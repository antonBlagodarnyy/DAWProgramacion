package main_y_clases;
import java.util.Iterator;

public class naveEspacial {
	//Atributo
	protected String nombre;
	protected int tripulacion;
	protected double velocidad;
	protected static int [] historicoDespegues = new int [100];
	protected static int [] historicoAterrizajes = new int [100];
	protected static final int LIMITE_CARGA = 1000;
	protected static final int LIMITE_DESCARGA = 200;
	
	//Constructor
	public naveEspacial(String nombre, int tripulacion, double velocidad) {

		this.nombre = nombre;
		this.tripulacion = tripulacion;
		this.velocidad = velocidad;
	}
	
	//Getter n setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTripulacion() {
		return tripulacion;
	}
	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public static int[] getHistoricoDespegues() {
		return historicoDespegues;
	}
	public static void setHistoricoDespegues(int[] historicoDespegues) {
		naveEspacial.historicoDespegues = historicoDespegues;
	}
	public static int[] getHistoricoAterrizajes() {
		return historicoAterrizajes;
	}
	public static void setHistoricoAterrizajes(int[] historicoAterrizajes) {
		naveEspacial.historicoAterrizajes = historicoAterrizajes;
	}

	public static int getLimiteCarga() {
		return LIMITE_CARGA;
	}

	public static int getLimiteDescarga() {
		return LIMITE_DESCARGA;
	}
	
	public  int[] despegar(int despegue) {
		for (int i = 0; i < historicoDespegues.length; i++) {
			if(historicoDespegues==null)
			historicoDespegues[i]=despegue;
		}
		return historicoDespegues;
					}
			
	public  int[] aterrizar(int aterrizaje) {
		for (int i = 0; i < historicoAterrizajes.length; i++) {
			if(historicoAterrizajes==null)
				historicoAterrizajes[i]=aterrizaje;
		}
		return historicoAterrizajes;
					}
	
	//Acelera la nave espacial multiplicando su velocidad actual por la potencia de aceleración especificada.
	public double acelerar(double potencia) {
		this.velocidad *= potencia;
		return velocidad;
	}

	//Intenta cargar una cantidad especifica de carga en la nave espacial. Devuelve verdadero si la carga se
	//pudo cargar correctamente falso si excede el límite de carga.
	public boolean cargarCarga(double carga) {
		boolean cargada=true;
		return cargada;	
}
	
	public boolean descargarCarga(int carga) {
		boolean descargada=true;
		return descargada;
	}
}