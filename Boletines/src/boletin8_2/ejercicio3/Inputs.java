package boletin8_2.ejercicio3;


public class Inputs {

	/**
	 *solicite al usuario un día, un mes, y un año,  e indique si dicha fecha es válida.
	 *@param int dia mes anio: fecha introducida
	 *@return boolean: fechaValida
	 */
	public static boolean fechaValida(int dia, int mes,int anio) {

		//banderas:
		boolean bisiesto = false, fechaValida = true;

		if (anio < 1 ) {//comprobamos valor año
			fechaValida = false;
		}
		if (anio % 4 == 0 || anio % 1000 == 0 && anio % 400 == 0) {
			bisiesto = true;
		}
		if (mes < 1 || mes > 12) {//comprobamos mes
			fechaValida = false;
		}

		if (mes == 2) {//comprobacion mes de febrero

			if (bisiesto) {
				if (dia < 1 || dia >29) {//comprobacion febrero bisiesto
					fechaValida = false;
				} 
			} else {
				if (dia < 1 || dia > 28) {
					fechaValida = false;
				}
			}
		} else if(mes ==1 || mes ==3|| mes == 6 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia <1 || dia >31) {
				fechaValida=false;
			}
		} else {
			if (dia <1 || dia >30) {
				fechaValida=false;
			}
		}

		return fechaValida;	
	}
}
