package modelo;

import objetos.animales.Perro;

public class Persona {
private String nombre;
private Perro[] perro;
private static final int MAXIMO_PERROS=5;

public Persona(String nombre, Perro perro) {
	super();
	this.nombre = nombre;
	this.perro = new Perro[MAXIMO_PERROS];
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Perro[] getPerro() {
	return perro;
}
public void setPerro(Perro []perro) {
	this.perro = perro;
}

}
