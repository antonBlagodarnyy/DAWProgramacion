package boletin8_1.ejercicio7;


public class Carta {
	//Atributos
	Palo palo;
	Valor valor; 
	private static double sumaTotal;
	
	//Metodos
	
	/**
	 * Constructor
	 * Genera 2 num aleatorios, uno del 1 al 4 y otro del 1 al 10, y atribuye valor y palo en su funcion
	 *  
	 */
	public Carta() {
		int randomPalo =(int) Math.floor(Math.random()*4+1);
		int randomValor =(int) Math.floor(Math.random()*10+1);
			switch (randomPalo) {
			case 1:
				this.palo=Palo.COPAS;
			break;
			case 2:
				this.palo=Palo.BASTOS;
				break;
			case 3:
				this.palo=Palo.ESPADAS;
				break;
			case 4:
				this.palo=Palo.OROS;
			}
			
				switch (randomValor) {
				case 1:
					this.valor=Valor.UNO;
					sumaTotal+=1;
				break;
				case 2:
					this.valor=Valor.DOS;
					sumaTotal+=2;
					break;
				case 3:
					this.valor=Valor.TRES;
					sumaTotal+=3;
					break;
				case 4:
					this.valor=Valor.CUATRO;
					sumaTotal+=4;
					break;
				case 5:
					this.valor=Valor.CINCO;
					sumaTotal+=5;
					break;
				case 6:
					this.valor=Valor.SEIS;
					sumaTotal+=6;
					break;
				case 7:
					this.valor=Valor.SIETE;
					sumaTotal+=7;
					break;
				case 8:
					this.valor=Valor.SOTA;
					sumaTotal+=0.5;
					break;
				case 9:
					this.valor=Valor.CABALLO;
					sumaTotal+=0.5;
					break;
				case 10:
					this.valor=Valor.REY;
					sumaTotal+=0.5;
					break;
			}
			
			
			}

	public static double getSumaTotal() {
		return sumaTotal;
	}
	
	@Override
	public String toString() {
		String answer="";
		answer+=this.valor+" de "+this.palo+"\n"
		+ "Total: "+ consultarTotal();		;
		return answer;
	}
	
	public double consultarTotal() {
		return sumaTotal;
	}

	/**Imprime el menu
	 * 
	 */
	public static void Menu(){
		pintaLinea();
		System.out.println("Que opcion desea realizar?\n"
				+ "1 - Nueva Carta.\n"
				+ "2 - Me planto.");
		pintaLinea();
	
	}
	/**
	 * Pinta una linea
	 */
	private static void pintaLinea() {
		for (int i = 10; i > 0; i--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

	
