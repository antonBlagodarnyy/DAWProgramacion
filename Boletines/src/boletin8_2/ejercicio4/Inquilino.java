package boletin8_2.ejercicio4;

public class Inquilino {
	//Atributos
	private String nombreCompleto;
	private String nif;
	
	
	//Metodos
		//Constructor
	public Inquilino(String nombreCompleto, String nif) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.nif = nif;
	}
		//Constructor auxiliar
	public Inquilino() {//Para poder crear un alquiler nulo
		
	}
		//Getter and Setter
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Inquilino [nombreCompleto=" + nombreCompleto + ", nif=" + nif + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		
	    if (this == obj) {//si la referencia es la misma
	        equals = true;
	    }else{ 
	    Inquilino inquilino = (Inquilino) obj; //casting de objeto a clase Inquilino para comprobar los nifs
	    if  (this.nif != null && this.nif.equals(inquilino.getNif()))//Comprueba los nifs
    	equals = true;
	    }
	   
	    return equals ;
	}
}
