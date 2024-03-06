package boletin8_1.ejercicio2;

public class Cuadrado {
	//Atributos
	int lado;

	//Metodos
	//Constructor
	public Cuadrado() {

	}

	//Setter
	public void setLado(int lado) {
		if(lado>0){
		this.lado=lado;
		}
		
	}

	//Getter
	public int getLado() {
		
		return this.lado;
	}
	
	public int getArea() {//Devuelve el area del cuadrado
		int area = this.lado*this.lado;
		return area;
	}

	//Print
	public void printCuadrado(){
		for (int i = this.lado; i>0;i--) {//Recorre altura
			for (int u = this.lado; u>0;u--) {//Recorre ancho
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
