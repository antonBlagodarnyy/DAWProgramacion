package boletin9.ejercicio1;

import java.time.LocalDate;
import java.time.LocalTime;

public class RelojDigital extends Reloj {

	public RelojDigital(boolean alarmaInterruptor, LocalTime alarmaHora) {
		super(alarmaInterruptor, alarmaHora);

	}

	@Override
	public String mostrarHora(){
		String hora = LocalTime.now().withSecond(0).withNano(0).toString();
		if(alarmaInterruptor()
				&&LocalTime.now().withSecond(0).withNano(0).equals(
						getAlarmaHora()))
			hora+=" RING!!!!!";

		return hora;
	}

}
