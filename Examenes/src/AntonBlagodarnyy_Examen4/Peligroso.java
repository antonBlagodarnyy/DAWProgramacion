package AntonBlagodarnyy_Examen4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Peligroso extends Animal {
	//Atributos
	public static final int CUIDADORES_MAXIMO=5;
	private Cuidador [] cuidadores = new Cuidador [CUIDADORES_MAXIMO];

	public Peligroso(double peso, String especie, int id, LocalDate fechaUbicacion, Cuidador[] cuidadores) {
		super(peso, especie, id, fechaUbicacion);
		this.cuidadores = cuidadores;
	}

	public Cuidador[] getCuidadores() {
		return cuidadores;
	}

	public void setCuidadores(Cuidador[] cuidadores) {
		this.cuidadores = cuidadores;
	}
	@Override
	public boolean isFeliz() {
		boolean isFeliz=false;
		if((int)ChronoUnit.DAYS.between(getFechaUbicacion(), LocalDate.now())<AGUANTE_DIAS+(int)(this.getPeso()/10)) {
			isFeliz=true;
		}
		return isFeliz;
	}

}
