package AntonBlagodarnyy_Examen4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Manso extends Animal {
	private Cuidador cuidador;

	public Manso(double peso, String especie, int id, LocalDate fechaUbicacion, Cuidador cuidador) {
		super(peso, especie, id, fechaUbicacion);
		this.cuidador = cuidador;
	}

	public Cuidador getCuidador() {
		return cuidador;
	}

	public void setCuidador(Cuidador cuidador) {
		this.cuidador = cuidador;
	}
	
	
}
