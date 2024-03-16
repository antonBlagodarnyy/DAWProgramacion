package modelo.Producto;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class ProductoElectronico extends Producto{

	public ProductoElectronico(int id, String nombre, String descripcion, double precio, String imagen) {
		super(id, nombre, descripcion, precio, imagen);

	}
	
	/*@Override
	public double getPrecioFinal() {
		// TODO Los productos electronicos, tienen un descuento del 20% enMarzo
		//y del 50% en el blackfriday (cuarto viernes de Noviembre)
		double precioFinal=super.getPrecioFinal();
		if(LocalDate.now().getMonthValue()==11&&LocalDate.now().getDayOfYear()%6=={
			precioFinal-=precioFinal*0.2;
		}
		if(LocalDate.now()){
			precioFinal-=precioFinal*0.2;
		}
		
		return ;
	}
	*/
	@Override

	public double getPrecioFinal() {

		double precio=0;

		

		if(LocalDate.now().getMonthValue()==3) {

			precio=super.getPrecioFinal()*0.80;

		}else if(LocalDate.now().getMonthValue()==11&&LocalDate.now().getDayOfMonth()>=21&&LocalDate.now().getDayOfMonth()<28&&LocalDate.now().getDayOfWeek()==DayOfWeek.FRIDAY){

			precio=super.getPrecioFinal()*0.50;

		}

		

		// TODO Los productos electronicos, tienen un descuento del 20% enMarzo

		//y del 50% en el blackfriday (cuarto viernes de Noviembre)

		return precio;

	}

}
