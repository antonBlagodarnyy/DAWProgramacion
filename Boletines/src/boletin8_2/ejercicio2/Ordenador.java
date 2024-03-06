package boletin8_2.ejercicio2;

public class Ordenador {
	/**
	 * VALORES PERMITIDOS:
	 * 
	 * RAM:
	 * tiposRam:
	 * DDR3,DDR4,DDR5
	 * 
	 *  tamanioRam: 
	 * DDR3: 4GB, 8GB, 16GB;
	 * DDR4: 8GB, 16GB, 32GB, 64GB;
	 * DDR5: 16GB, 32GB, 64GB;
	 *
	 * velocidadRam:
	 * DDR3: 800 MHz, 1066 MHz, 1333MHz, 1600MHz;
	 * DDR4: 2400 MHz 2666 MHz 2933 MHz 3000 MHz 3200 MHz  3600 MHz 4000 MHz 4400 MHz
	 * DDR5: 3200 MHz 3600 MHz 4000 MHz  4800 MHz 5200 MHz 5600 MHz
	 *
	 *
	 *DISCO_DURO:
	 *tipoMemoria:
	 * SSD, HDD, SSHD, M.2 SSD, NVMe
	 * 
	 * capacidadMemoria:
	 * SSD: 120GB, 128GB, 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
	 * HDD: 500GB, 1TB, 2TB, 3TB, 4TB, 6TB, 8TB
	 * SSHD: 500GB, 1TB, 2TB
	 * M.2 SSD: 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
	 * NVMe: 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
	 *
	 *
	 *PROCESADOR
	 *Marca:
	 * Intel
	 * AMD 
	 * Modelo:
	 * 9,7,5,3
	 * 
	 * Velocidad: (Baja)2.0 GHz - 3.0 GHz, (Media) 3.0GHz - 4.0 GHz, (Alta) 3.5 GHz - 5 GHz
	 **/

	//SUBOJETOS:
	private class Ram{

		//Atributos
		private TipoRam tipoRamOrdenador;
		private int tamanioRam,velocidadRam; 

		//Constructor
		Ram (TipoRam tipoRam,int tamanioRam,int velocidadRam){
			this.tipoRamOrdenador=tipoRam;
			if(aplicarFiltroTipoRam(tipoRamOrdenador,tamanioRam)) {
				this.tamanioRam=tamanioRam;
			}else	{
				throw new IllegalArgumentException("Ram no valida");
			}
			if(aplicarFiltroVelocidadRam(tipoRam,velocidadRam)) {
				this.velocidadRam=velocidadRam;
			}

		}				
		private boolean aplicarFiltroTipoRam(TipoRam tipoRamOrdenador, int tamanioRam) {
			boolean filtro=false;
			switch (tipoRamOrdenador){
			case DDR3 :
				if(tamanioRam==4 || tamanioRam==8 || tamanioRam==16) 
					filtro=true;
				break;
			case DDR4 :
				if(tamanioRam==8 || tamanioRam==16 || tamanioRam==32||tamanioRam==64) 
					filtro=true;
				break;
			case DDR5 :
				if(tamanioRam==16 || tamanioRam==32 || tamanioRam==64) 
					filtro=true;
				break;
			default:	
				throw new IllegalArgumentException("Error en Switch de memoria ram");
			}
			return filtro;
		} 
		/* velocidadRam:
		 * DDR3: 800 MHz, 1066 MHz, 1333MHz, 1600MHz;
		 * DDR4: 2400 MHz 2666 MHz 2933 MHz 3000 MHz 3200 MHz  3600 MHz 4000 MHz 4400 MHz
		 * DDR5: 3200 MHz 3600 MHz 4000 MHz  4800 MHz 5200 MHz 5600 MHz
		 * */
		private boolean aplicarFiltroVelocidadRam(TipoRam tipoRamOrdenador, int velocidadRam) {
			boolean filtro=false;
			switch (tipoRamOrdenador){
			case DDR3 :
				if(velocidadRam==800 || velocidadRam==1066 || velocidadRam==1333 || velocidadRam==1600  ) 
					filtro=true;
				break;
			case DDR4 :
				if(velocidadRam==2400 || velocidadRam==2666 || velocidadRam==2933||velocidadRam==3000||velocidadRam==3200||velocidadRam==3600||velocidadRam==4000||velocidadRam==4400) 
					filtro=true;
				break;
			case DDR5 :
				if(velocidadRam==3200 || velocidadRam==3600 || velocidadRam==4000||velocidadRam==4800|| velocidadRam==5200 || velocidadRam==5600 ) 
					filtro=true;
				break;
			default:	
				throw new IllegalArgumentException("Error en Switch de velocidad ram");
			}
			return filtro;
		}
	}


	private class DiscoDuro{
		//tipos de disco duro permitidos
		//Atributos
		private TipoDiscoDuro tipoDiscoDuroOrdenador;
		private int capacidadMemoria; 


		//Constructor
		DiscoDuro (TipoDiscoDuro tipoDiscoDuro,int capacidadMemoria){
			this.tipoDiscoDuroOrdenador=tipoDiscoDuro;
			if(aplicarFiltroCapacidadMemoria(tipoDiscoDuro,capacidadMemoria)) {
				this.capacidadMemoria=capacidadMemoria;
			}else	{
				throw new IllegalArgumentException("Capacidad de memoria no valida");
			}
		}
		/*capacidadMemoria:
		 * SSD: 120GB, 128GB, 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
		 * HDD: 500GB, 1TB, 2TB, 3TB, 4TB, 6TB, 8TB
		 * SSHD: 500GB, 1TB, 2TB
		 * M.2 SSD: 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
		 * NVMe: 240GB, 256GB, 480GB, 512GB, 1TB, 2TB
		 */

		//TO DO en el toString, diferenciar entre GB y TB
		private boolean aplicarFiltroCapacidadMemoria(TipoDiscoDuro tipoDiscoDuro, int capacidadMemoria) {
			boolean filtro=false;
			switch (tipoDiscoDuro){
			case SSD :
				if(capacidadMemoria==120 || capacidadMemoria==128 || capacidadMemoria==240 || capacidadMemoria == 256 || capacidadMemoria == 480 || capacidadMemoria == 512 || capacidadMemoria==1 || capacidadMemoria ==2)  
					filtro=true;
				break;
			case HDD :
				if(capacidadMemoria==500 || capacidadMemoria==1 || capacidadMemoria==2 || capacidadMemoria == 3 || capacidadMemoria == 4 || capacidadMemoria == 6 || capacidadMemoria==8) 
					filtro=true;
				break;
			case SSHD :
				if(capacidadMemoria==500 || capacidadMemoria==1 || capacidadMemoria==2)
					filtro=true;
				break;
			case M2SSD :
				if(capacidadMemoria==240 || capacidadMemoria==256 || capacidadMemoria==480 || capacidadMemoria==512 || capacidadMemoria==1 || capacidadMemoria==2)
					filtro=true;
				break;
			case NVMe :
				if(capacidadMemoria==240 || capacidadMemoria==256 || capacidadMemoria==480 || capacidadMemoria==512 || capacidadMemoria==1 || capacidadMemoria==2)
					filtro=true;
				break;
			default:	
				throw new IllegalArgumentException("Error en Switch de capacidad de memoria");
			}
			return filtro;
		} 
	}

	private class Procesador{


		//Atributos
		public TipoModeloProcesador tipoModeloProcesador;
		private int numModelo;
		private double velocidad;

		//Constructor
		Procesador (TipoModeloProcesador MODELO_PROCESADOR,int numModelo, double velocidad){
			this.tipoModeloProcesador=MODELO_PROCESADOR;
			if(aplicarFiltroModeloProcesador(numModelo)) {//validamos un numModelo valido
				this.numModelo=numModelo;
			} else
				throw new IllegalArgumentException("Numero de modelo no valido.");
			this.tipoModeloProcesador= MODELO_PROCESADOR;


			if(aplicarFiltroVelocidadProcesador(this.numModelo, velocidad)) {
				this.velocidad=velocidad;
			} else
				throw new IllegalArgumentException("Velocidad de procesador no valido.");
		}


		private boolean aplicarFiltroModeloProcesador(int numModelo) {
			boolean valido = false;
			if(numModelo == 9||numModelo == 7 ||numModelo == 5 || numModelo == 3) {
				valido=true;
			} 
			return valido;
		}

		private boolean aplicarFiltroVelocidadProcesador(int numModelo ,double velocidad) {
			boolean valido = false;
			if (numModelo==3) {
				if(velocidad==2||velocidad==3)
					valido=true;
			}
			else if (numModelo==5) {
				if(velocidad==3||velocidad==4)
					valido=true;
			} else 
				if(velocidad==3.5||velocidad==5)
					valido=true;
			return valido;
		}
	}

	//Atributos:
	private double precioBase;
	public static final double IVA= 0.21;
	private double precioMercado;
	private Ram Ram;
	private DiscoDuro DiscoDuro;
	private Procesador Procesador;
	
	//CONSTRUCTOR
	public Ordenador(TipoRam tipoRamOrdenador, int tamanioRam, int velocidadRam,
			TipoDiscoDuro tipoDiscoDuroOrdenador , int capacidadMemoria,
			TipoModeloProcesador tipoModeloProcesador, int numModelo, double velocidad,
			double precioBase) {

		this.Ram = new Ram(tipoRamOrdenador, tamanioRam, velocidadRam);
		this.DiscoDuro = new DiscoDuro(tipoDiscoDuroOrdenador, capacidadMemoria);
		this.Procesador = new Procesador(tipoModeloProcesador, numModelo, velocidad);

		precioBase+=precioBase*IVA;
		this.precioMercado=precioBase;

	}
	
	@Override
	public String toString() {
		String Ordenador="RAM:\n"
				+ "Tipo ram: "+this.Ram.tipoRamOrdenador+"\n"
				+ "Tamanio ram: "+this.Ram.tamanioRam+"\n"
				+"Velocidad ram: "+this.Ram.velocidadRam+"\n"
				+"DISCO DURO:\n"
				+"Tipo disco duro: "+this.DiscoDuro.tipoDiscoDuroOrdenador+"\n"
				+"Capacidad memoria: "+this.DiscoDuro.capacidadMemoria+"\n"
				+"PROCESADOR:\n"
				+"Tipo modelo procesador: "+this.Procesador.tipoModeloProcesador+"\n"
				+"Numero modelo: "+this.Procesador.numModelo+"\n"
				+"Velocidad: "+this.Procesador.velocidad+"\n"
				+"PRECIO MERCADO: "+precioMercado;
		return Ordenador;


	}
}
