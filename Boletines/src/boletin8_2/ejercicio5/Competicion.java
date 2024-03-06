package boletin8_2.ejercicio5;

public class Competicion {
	//Atributos
	private Saltador [] saltadores;
	int counterSaltadores=0;

	public Competicion() {
		this.saltadores= new Saltador[10];
	}
	public void darAlta(String nombre, String apellidos, Nacionalidades nacionalidadSaltador,
			Entrenador entrenador) { 
		Saltador nuevo = new Saltador (nombre, apellidos, nacionalidadSaltador,entrenador);
		saltadores[counterSaltadores]=nuevo;
		counterSaltadores++;		
	}
	public void simularCompeticion() {
		for (int i = 0; i<saltadores.length;i++) {
			if (saltadores[i]!=null)
				saltadores[i].saltar();

		}
	}
	public String verEstado() {
		String answer = "Campeon de la competicion: \n";
		int highestPosition=0;
		double highestValue=0;

		for (int i = 0; i < saltadores.length;i++){//buscamos al saltador con la mayor puntuacion
			if(saltadores[i]!=null&&saltadores[i].getPuntuacion()>highestValue) {
				highestValue=saltadores[i].getPuntuacion();
				highestPosition = i;
			}
		}
		answer += saltadores[highestPosition].toString();
		return answer;
	}
}




