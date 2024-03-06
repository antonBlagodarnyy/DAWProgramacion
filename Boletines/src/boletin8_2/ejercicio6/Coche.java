package boletin8_2.ejercicio6;

public class Coche {
	//Atributos
	private String matricula;
	private int numHoras;
	// private double importeTotal; derivado


	//Metodos
	//Constructor
	public Coche(String matricula) {//constructor sin horas
		super();
		this.matricula = matricula;

	}
	public Coche(String matricula, int numHoras) {//constructor con horas
		super();
		this.matricula = matricula;
		this.numHoras = numHoras;
	}

	//Getters n Setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	//Importe a pagar
	public double getImporte(int numHoras) {
		setNumHoras(numHoras);
		return  this.numHoras*0.75;
	}

	//toString
	@Override
	public String toString() {
		String answer="";
		if(numHoras==0)
			answer+="Matricula: "+matricula;
		else
			answer +="Matricula: "+matricula +", numHoras=" + numHoras + ", getImporte()=" + getImporte(this.numHoras);
		return answer;
	}


	
}
