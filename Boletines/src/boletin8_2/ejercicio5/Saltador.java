package boletin8_2.ejercicio5;

import java.util.Arrays;

public class Saltador {
	//Atributos
	private String nombre, apellidos;
	private Nacionalidades nacionalidadSaltador;
	private Entrenador entrenador;
	private boolean saltoRealizado= false;
	//private double puntuacionTotal; derivado
	private  Salto [] saltos;


	//Metodos
	//Constructor
	public Saltador(String nombre, String apellidos, Nacionalidades nacionalidadSaltador,
			Entrenador entrenador) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidadSaltador = nacionalidadSaltador;

		this.entrenador = entrenador;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Nacionalidades getNacionalidadSaltador() {
		return nacionalidadSaltador;
	}
	public void setNacionalidadSaltador(Nacionalidades nacionalidadSaltador) {
		this.nacionalidadSaltador = nacionalidadSaltador;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}


	/**
	 * Imprime los datos del saltador.
	 * Si ha saltado, con su puntuacion
	 * @param saltoRealizado
	 * @return
	 *
	 */
	@Override
	public String toString() {
		String answer = "";
		if(this.saltoRealizado) {
			answer+="- Nombre completo: " + nombre +" "+ apellidos + "\n\n"
					+ "- Nº colegiador del entrenador: "+ this.entrenador.getNumColegiado() +"\n\n"
					+"- Saltos Realizados\n\n";

			for(int i = 0; i < 5;i++) {
				answer+="SALTO "+i+": "+saltos[i].toString()+"\n";
			}
		}
		else
			answer+="- Nombre completo: " + nombre + " "+apellidos + "\n\n"
					+ "- Nº colegiador del entrenador: "+ this.entrenador.getNumColegiado() +"\n\n";
		return answer;

	}
	/**
	 * Intercambia un entrenador con otro.
	 * 	
	 */
	public void intercambiarEntrenador(Saltador saltadorUno) {
		Entrenador entrenadorAuxiliar = new Entrenador(saltadorUno.getEntrenador().getNumColegiado(),saltadorUno.getEntrenador().getNacionalidadEntrenador());

		saltadorUno.getEntrenador().setNacionalidadEntrenador(this.entrenador.getNacionalidadEntrenador());
		this.entrenador.setNacionalidadEntrenador(entrenadorAuxiliar.getNacionalidadEntrenador());

		saltadorUno.getEntrenador().setNumColegiado(this.entrenador.getNumColegiado());
		this.entrenador.setNumColegiado(entrenadorAuxiliar.getNumColegiado());

	}
	/**
	 * Inicializa los 5 saltos del saltador
	 */
	public void saltar() {

		Salto [] saltosSaltador = new Salto [5];
		for(int i =0; i<5;i++) {
			saltosSaltador[i]= new Salto();
		}
		this.saltoRealizado=true;
		this.saltos=saltosSaltador;

	}

	/**
	 * Obtiene la puntuacion del saltador
	 */
	public double getPuntuacion() {
		int lowestPosition=10, highestPosition=0,counter=0,sum=0;
		double media;
		
		for (int i = 0; i<saltos.length;i++) {//sacamos las posiciones que no vamos a contar
			if(saltos[i].getPuntuacion()<lowestPosition&&saltos[i].getValidez()) {
				lowestPosition=i;
			}
			if(saltos[i].getPuntuacion()>highestPosition&&saltos[i].getValidez()) {
				highestPosition=i;
			}	
		}

		for (int i = 0; i<saltos.length;i++) {//sumamos los valores validos y la cantidad de ellos
			if(saltos[i].getValidez()&&(i!=highestPosition||i!=lowestPosition)) {
				sum+=saltos[i].getPuntuacion();
				counter++;
			}
		}
		
		return media=(double)sum/counter;//calculamos la media
	}
}
