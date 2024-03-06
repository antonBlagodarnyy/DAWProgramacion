package boletin9.ejercicio3;

import java.util.Arrays;

public abstract class Producto {
	//Atributo
		private int indice;
		private ValoracionObjeto []   valoraciones;
		private static int indiceContador=0;
		//Metodos
		//Constructor
		public Producto(){
			this.valoraciones= new ValoracionObjeto[5];
			indiceContador++;
		}
		
		//Getter y setter
		public int getIndice() {
			return indice;
		}
		public void setIndice(int indice) {
			this.indice = indice;
		}

		public void setValoracion(int lugar, ValoracionObjeto valoracion) {
			this.valoraciones[lugar]=valoracion;
		}
		

		@Override
		public String toString() {
			return "Productos [indice=" + indice + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
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
