package boletin9.ejercicio3;


public abstract class Persona {
	//Atributos
		private String nombre,dni;

		//Metodos

		//Constructor
		public Persona(String nombre,String dni) {
			this.nombre = nombre;
			this.dni=dni;
		}
		//Getter y setter
		public String getNombre() {
			return this.nombre;
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
			return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
		}


}
