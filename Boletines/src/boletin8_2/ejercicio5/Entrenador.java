package boletin8_2.ejercicio5;

public class Entrenador {
//Atributos
	private int numColegiado;
	private Nacionalidades nacionalidadEntrenador;
	
	
	public Entrenador(int numColegiado, Nacionalidades nacionalidadEntrenador) {
		super();
		this.numColegiado = numColegiado;
		this.nacionalidadEntrenador = nacionalidadEntrenador;
	}
	public int getNumColegiado() {
		return numColegiado;
	}
	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}
	public Nacionalidades getNacionalidadEntrenador() {
		return nacionalidadEntrenador;
	}
	public void setNacionalidadEntrenador(Nacionalidades nacionalidadEntrenador) {
		this.nacionalidadEntrenador = nacionalidadEntrenador;
	}
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Entrenador entrenador = (Entrenador) obj;

        return numColegiado == entrenador.numColegiado &&
               nacionalidadEntrenador == entrenador.nacionalidadEntrenador;
    }
}
