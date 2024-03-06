package objetos.persona;

import java.time.LocalDate;

public class Superheroe extends Persona {

	private String poder;
	public Superheroe( String nombre,String poder) {
		super(nombre);
		this.poder=poder;
	}
	
	public String getPoder() {
		return poder;
	}
}
