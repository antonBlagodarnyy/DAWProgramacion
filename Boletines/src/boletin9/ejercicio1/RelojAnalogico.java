package boletin9.ejercicio1;

import java.time.LocalTime;

public class RelojAnalogico extends Reloj {

	public RelojAnalogico(boolean alarmaInterruptor, LocalTime alarmaHora) {
		super(alarmaInterruptor, alarmaHora);

	}
	@Override
	public String mostrarHora(){
		return "En construccion";
	}

}
