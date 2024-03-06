package boletin8_2.ejercicio2;

public class Main {

	public static void main(String[] args) {
		Ordenador pc1= new Ordenador (TipoRam.DDR4, 32,2666,TipoDiscoDuro.HDD,2,TipoModeloProcesador.INTEL,5,3,1200);
		System.out.println(pc1.toString());
		System.out.println();
		Ordenador pc2= new Ordenador (TipoRam.DDR3, 8,1066,TipoDiscoDuro.SSD,240,TipoModeloProcesador.AMD,3,2,900);
	System.out.println(pc2);
	
	}

}
