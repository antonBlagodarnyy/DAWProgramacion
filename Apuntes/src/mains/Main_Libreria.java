package mains;

import java.time.LocalDate;

import objetos.libreria.Producto;
import objetos.libreria.ValoracionObjeto;

public class Main_Libreria {

	public static void main(String[] args) {
		Producto libro = new Producto (1,"El señor de los anillos");

		ValoracionObjeto valoracion1= new ValoracionObjeto(5,LocalDate.of(2003, 3, 4));
		ValoracionObjeto valoracion2= new ValoracionObjeto(1,LocalDate.of(2001, 2, 4));
		ValoracionObjeto valoracion3= new ValoracionObjeto(4,LocalDate.of(2002, 7, 4));
		ValoracionObjeto valoracion4= new ValoracionObjeto(9,LocalDate.of(2008, 9, 4));
		ValoracionObjeto valoracion5= new ValoracionObjeto(7,LocalDate.of(2010, 1, 4));

		libro.setValoracion(0,valoracion1);
		libro.setValoracion(1,valoracion2);
		libro.setValoracion(2,valoracion3);
		libro.setValoracion(3,valoracion4);
		libro.setValoracion(4,valoracion5);

System.out.println(libro.getValoracionMedia());
	
System.out.println(libro.getValoracionMejor().getEstrellas());
	
ValoracionObjeto [] valoracionesFiltradas=libro.getValoracionesFiltrada(4);
	
for(int i = 0; i<valoracionesFiltradas.length;i++) {
	System.out.println(valoracionesFiltradas[i]);
}
	}
}
