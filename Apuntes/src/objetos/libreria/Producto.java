package objetos.libreria;


public class Producto {
	//Atributo
	private int indice;
	private String nombre;
	private ValoracionObjeto []   valoraciones;
	//Metodos
	//Constructor
	public Producto(int indice, String nombre){
		this.indice=indice;
		this.nombre=nombre;
		this.valoraciones= new ValoracionObjeto[5];
	}
	
	//Getter y setter
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setValoracion(int lugar, ValoracionObjeto valoracion) {
		this.valoraciones[lugar]=valoracion;
	}

	public double getValoracionMedia() {
		double sumatorio=0;
		double contador = 0;
		double media;
		
		for(int i = 0; i<valoraciones.length ; i++) {
			
			if(valoraciones[i]!=null) {
				sumatorio += valoraciones[i].getEstrellas();
				contador++;
			}
		}
		media=sumatorio/contador;
		return media;
		}

	public ValoracionObjeto getValoracionMejor() {
		int indice=0,valor=0;
		for(int i = 0; i<valoraciones.length ; i++) {
			if(valoraciones[i].getEstrellas()>valor) {
				indice=i;
				valor=valoraciones[i].getEstrellas();
			}
		}
		return valoraciones[indice];
	}

	public ValoracionObjeto [] getValoracionesFiltrada(int valor) {
		int counter=0;
		
		for(int i = 0;i<valoraciones.length;i++) {
			if(valoraciones[i].getEstrellas()==valor) {
				counter++;
			}
		}
		ValoracionObjeto[] valoracionArray = new ValoracionObjeto [counter] ;
		
		for(int u=0;u<valoracionArray.length;u++) {
			for(int i = 0;i<valoraciones.length;i++) {
				if(valoraciones[i].getEstrellas()==valor||valoraciones[i]!=null) {
					valoracionArray[u].setEstrellas(valoraciones[i].getEstrellas());
				}
		}
	}
		return valoracionArray;
}
}
