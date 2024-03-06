package boletin9.ejercicio4;

public class Cliente{
	//Atributos
	private String nombre,dni;
	
	//Metodos
	//constructor
	public Cliente(String nombre, String dni) {
	}

	//get n set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
