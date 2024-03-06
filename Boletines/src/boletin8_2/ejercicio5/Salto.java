package boletin8_2.ejercicio5;

public class Salto {
	//Atributos
	private int puntuacion;
	private boolean validez;
	
	//Metodos
	//Constructor
	Salto(){
	this.puntuacion=(int)Math.floor(Math.random()*11);
	int validez = (int)Math.floor(Math.random()*100);
	
	if (validez>15) 
		this.validez=true;
	else
		this.validez=false;
	}

	
	public int getPuntuacion() {
		return puntuacion;
	}
	public boolean getValidez() {
		return validez;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public boolean isValidez() {
		return validez;
	}


	public void setValidez(boolean validez) {
		this.validez = validez;
	}


	@Override
	public String toString() {
		String answer="";
		if(validez)
			answer +="es valido, votacion: "+ puntuacion;
		else
			answer +="es invalido, votacion: "+ puntuacion;
		return answer;
	}
	
}
