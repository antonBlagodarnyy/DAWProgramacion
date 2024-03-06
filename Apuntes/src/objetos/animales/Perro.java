package objetos.animales;

import enums.Color;
import modelo.Juguete;

public class Perro {
	private String nombre, raza;
	private Color color;
	private Juguete jugueteFavorito;
	private boolean hambriento;

	//Metodos
	//Constructor
	public Perro(Perro perroOriginal) {
		this.color=perroOriginal.color;
		this.hambriento=perroOriginal.hambriento;
		this.nombre=perroOriginal.nombre;
		this.raza=perroOriginal.raza;
	}


	//Get n set
	public boolean getHambriento() {
		return this.hambriento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza=raza;
	}
	public Juguete getJugueteFavorito() {
		return jugueteFavorito;
	}
	public void setJugueteFavorito(Juguete jugueteFavorito) {
		this.jugueteFavorito = jugueteFavorito;
	}
	public void setHambriento(boolean hambriento) {
		this.hambriento=hambriento;
	}

	public Perro(String nombre, Color color, Juguete jugueteFavorito) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.jugueteFavorito = jugueteFavorito;
	}

	//Metodos propios
	public void comer () {//realiza una accion
		this.hambriento=false;
	}
	//Sobrecarga
	public void comer (String comida) {
		if (comida.toLowerCase().equals("jamon")) {
			System.out.println(comida+", ummmm que bueno");
		} else {
			System.out.println(comida + ",aghh, no gracias!");
		}
	}

	public void ladrar () {
		System.out.println("Guau Guau");
	}
	@Override
	public String toString() {
		String mensaje="nombre: "+this.nombre+"\n"
				+" raza: "+this.raza+"\n"
				+ "color: "+this.color+"\n"
				+ "hambriento: "+this.hambriento+"\n";
		return mensaje;
	}
}
