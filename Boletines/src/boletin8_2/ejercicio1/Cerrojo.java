package boletin8_2.ejercicio1;

public class Cerrojo {
	//Atributos
	private int combinacion;
	private boolean abierto = false;
	public final int COMBINACION_MAXIMA = 999;
	public final int COMBINACION_MINIMA = 100;
	public static boolean cerrojoCreado=  false;


	//Metodos
	//Getter
	public boolean getAbierto() {
		return this.abierto;
	}

	//Constructor
	/**
	 * se le pasa la combinacion y despues de comprobar que es una combinacion valida, crea el cerrojo
	 * @param combinacion
	 */
	Cerrojo(int combinacion) {
		if(!cerrojoCreado) {//comprueba que no se haya creado un cerrojo
			if(combinacion>COMBINACION_MINIMA&&combinacion<COMBINACION_MAXIMA) {//si se encuentra dentro de los valores limites
				this.combinacion=combinacion;

			} else
				throw new IllegalArgumentException("Combinacion fuera de parametros limites");
		} else 
			throw new IllegalArgumentException("Ya existe un cerrojo");
	}

	public  void setCombinacion(int combinacion) {
		this.combinacion=combinacion;
	}
	/**
	 * trata de abrir el cerrojo y devuelve un boolean en funcion del resultado de la operacion
	 * @param combinacion
	 * @return true si se ha abierto
	 */
	public boolean abrirCerrojo(int combinacion){
		boolean abrirCerrojo=false;

		if(combinacionValida(combinacion)) {
			this.abierto=true;
			abrirCerrojo=true;
		}
		return abrirCerrojo;
	}
	public boolean combinacionValida(int combinacion) {//comprueba que la combinacion es valida
		boolean combinacionValida=false;
		if(combinacion==this.combinacion && !abierto) {
			combinacionValida=true;
		}
		return combinacionValida;
	}



	public void cerrarCerrojo() {
		this.abierto=false;
	}
}