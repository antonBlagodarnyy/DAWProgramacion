package boletin8_2.ejercicio6;

public class Deportivo extends Coche{
	//Atributos de subclase
	private String color;
	
	//Metodos
	//Constructor
	public Deportivo(String matricula,String color) {
		super(matricula);
		this.color=color;
	}
	public Deportivo(String matricula, int numHoras,String color) {
		super(matricula, numHoras);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public double getImporte(int numHoras) {
		double importe=0;
		this.setNumHoras(numHoras);
		importe= this.getNumHoras()*0.75;
		
		if(color.toLowerCase().equals("rojo")) 
			importe+= importe*0.1;
				
		return importe;
	}
	
	//toString
		@Override
		public String toString() {
			String answer="";
			if(this.getNumHoras()==0)
				answer+="Matricula: "+this.getMatricula()+" Color: "+color;
			else
				answer +="Matricula: "+this.getMatricula() +"Color: "+color+", numHoras=" + this.getNumHoras() + ", getImporte()=" + getImporte(getNumHoras());
			return answer;
		}

}
