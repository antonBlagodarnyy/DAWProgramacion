package objetos.persona;
import java.time.*;

public class Persona {
	//Atributos
	private String nombre;

	private LocalDate fechaNacimiento;


	//Metodos

	//Constructor
	public Persona(String nombre) {
		this.nombre = nombre;

	}
	//Getter y setter
	public String getNombre() {
		return this.nombre;
	}
	 
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/*public static boolean masJoven(Persona persona1, Persona persona2) {
		int comparador = persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento());
		boolean masJoven; 
		if(comparador > 0) {
			masJoven = true;
		}else {
			masJoven = false;
		}
		return masJoven;
	}
*/
}
