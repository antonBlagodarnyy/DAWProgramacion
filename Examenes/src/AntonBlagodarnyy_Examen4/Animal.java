package AntonBlagodarnyy_Examen4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Animal {
	//Atributos
	public static final int AGUANTE_DIAS=20;
private double peso;
private String especie;
private int id;
private LocalDate fechaUbicacion;

//Metodos
//Constructor
public Animal(double peso, String especie, int id, LocalDate fechaUbicacion) {
	super();
	this.peso = peso;
	this.especie = especie;
	this.id = id;
	this.fechaUbicacion = fechaUbicacion;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public int getId() {
	return id;
}

public LocalDate getFechaUbicacion() {
	return fechaUbicacion;
}
public void setFechaUbicacion(LocalDate fechaUbicacion) {
	this.fechaUbicacion = fechaUbicacion;
}
@Override
public String toString() {
	return "*************************\n"
			+ "Identificado: "+this.id+"\n"
					+ "Especie: "+this.especie+"\n"
							+ "*****************************\n"
			;
}
@Override
public int hashCode() {
	return Objects.hash(especie, fechaUbicacion, id, peso);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Animal other = (Animal) obj;
	return   id == other.id ;
}
//Atributo derivado
public boolean isFeliz() {
	boolean isFeliz=false;
	if(this.getEstancia()<AGUANTE_DIAS) {
		isFeliz=true;
	}
	return isFeliz;
}


//Funcionalidades
protected int getEstancia() {
	return (int)ChronoUnit.DAYS.between(getFechaUbicacion(), LocalDate.now());
}


}
