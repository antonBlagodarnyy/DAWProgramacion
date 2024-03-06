package AntonBlagodarnyy_Examen4;

import java.util.Objects;

public class Cuidador {
//Atributos
	private String nombre;

//Metodos
	public Cuidador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cuidador [nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuidador other = (Cuidador) obj;
		return Objects.equals(nombre, other.nombre);
	}	

}
