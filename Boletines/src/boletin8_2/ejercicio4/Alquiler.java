package boletin8_2.ejercicio4;
import java.time.*;
public class Alquiler {
	//ATRIBUTOS
	public static final double IVA = 0.21;
		private Inquilino inquilinoAlquiler;
		private Piso pisoAlquiler;
		private LocalDate fechaInicio;
		private double precioAlquiler;
		
		private static Alquiler [] listaAlquileres;
		private static int contadorAlquileres = 0;
		//METODOS
		//Constructor de la lista de alquileres
		static {
			listaAlquileres = new Alquiler [100];
		}
			//Constructor
		public Alquiler(Inquilino inquilinoAlquiler, Piso pisoAlquiler, LocalDate fechaInicio) {
			super();
			this.inquilinoAlquiler = inquilinoAlquiler;
			this.pisoAlquiler = pisoAlquiler;
			this.fechaInicio = fechaInicio;
			añadirAlquilerALista(this);
		}
		private static void añadirAlquilerALista(Alquiler alquiler) {
			listaAlquileres[contadorAlquileres]=alquiler;
			contadorAlquileres++;
		}
			//constructor auxiliar
		public Alquiler() {//Para poder crear un alquiler nulo sin añadirlo a la lista de alquileres
			this.inquilinoAlquiler= new Inquilino();
			this.pisoAlquiler= new Piso();
		}
		
			//Getter n Setter
		public Inquilino getInquilinoAlquiler() {
			return inquilinoAlquiler;
		}
		public void setInquilinoAlquiler(Inquilino inquilinoAlquiler) {
			this.inquilinoAlquiler = inquilinoAlquiler;
		}
		public Piso getPisoAlquiler() {
			return pisoAlquiler;
		}
		public void setPisoAlquiler(Piso pisoAlquiler) {
			this.pisoAlquiler = pisoAlquiler;
		}
		public LocalDate getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public static Alquiler[] getListaAlquileres() {
			return listaAlquileres;
		}
		public static void setListaAlquileres(Alquiler[] listaAlquileres) {
			Alquiler.listaAlquileres = listaAlquileres;
		}
		

		@Override
		public String toString() {
			String answer="Alquiler " + inquilinoAlquiler + pisoAlquiler + " precioAlquiler="+ this.getPrecioAlquiler()
					+ ", fechaInicio=" + fechaInicio + "]\n";
			return answer;
		}
		public static String toStringListaAlquileres() {
			String answer="";
			for (int i = 0; i<contadorAlquileres;i++) {//Concatenamos al toString la lista de los alquileres creados
				answer+= "Alquiler "+i+": "+listaAlquileres[i]+"\n";
			}
			return answer;
		}
	
		@Override
		public boolean equals(Object obj) {
			boolean equals = false;
			
		    if (this == obj) {//si la referencia es la misma
		        equals = true;
		    }else{ 
		    Alquiler alquiler = (Alquiler) obj; //casting de objeto a clase Piso para comprobar la direccion
		    if  (this.inquilinoAlquiler.equals(alquiler.getInquilinoAlquiler()) && this.pisoAlquiler.equals(alquiler.getPisoAlquiler()))//Comprueba el inquilino y el piso de ambos alquileres sea el mismo
	    	equals = true;
		    }
		    if (obj.equals(null))
		    	equals= false;
		    
		    return equals ;
		}
		
		//precio del alquiler
		/**
		 * Como es un atributo derivado, necesitamos de calcularlo usando el iva
		 * Separandolo en 2 metodos, controlamos que no se vuelva a calcular en caso de haberse inicializado ya
		 * @return precio neto del alquiler
		 */
		public double getPrecioAlquiler() {
			
			return this.pisoAlquiler.getPrecioBase()+this.pisoAlquiler.getPrecioBase()*IVA;
		}
		
		
		
		public void setPrecioAlquiler(double precioAlquiler) {
			this.precioAlquiler=precioAlquiler;
		}
		
		/**
		 * Usamos un alquiler auxiliar nulo para inicializar el precio de alquiler en 0
		 * Recorremos todos los alquileres comparando menor que
		 * @return Alquiler con el precio mas alto
		 */
		public static Alquiler getAlquilerMasCaro() {
			Alquiler alquilerAuxiliar = new Alquiler();
			int bandera=-1;
			for(int i = 0; i < listaAlquileres.length; i++) {
				
				if(listaAlquileres[i]==null) //Controlamos las posiciones nulas
					break;
		
				if(alquilerAuxiliar.getPrecioAlquiler()<listaAlquileres[i].getPrecioAlquiler())
					bandera=i;
					alquilerAuxiliar.setPrecioAlquiler(listaAlquileres[i].getPrecioAlquiler());
			}
			
			return listaAlquileres[bandera];
		}
}
