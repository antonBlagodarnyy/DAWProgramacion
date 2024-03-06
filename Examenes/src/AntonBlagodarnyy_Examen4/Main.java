package AntonBlagodarnyy_Examen4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		Cuidador rafaelNadal = new Cuidador("Rafael Nadal");
		Cuidador lydiaValentin = new Cuidador("Lydia Valentin");
		Cuidador manuelCarmona = new Cuidador("Manuel Carmona");

		Cuidador[] cuidadoresLeon = new Cuidador[5];
		cuidadoresLeon[0]=rafaelNadal;
		cuidadoresLeon[1]=lydiaValentin;
		Peligroso leon = new Peligroso(200,"Leon",10,LocalDate.of(2000, 1, 1),cuidadoresLeon);

		Cuidador[] cuidadoresCobraPrimera = new Cuidador[5];
		cuidadoresLeon[0]=rafaelNadal;
		Peligroso cobraPrimera = new Peligroso(12,"Cobra",12,LocalDate.of(2024, 3, 5),cuidadoresCobraPrimera);

		Cuidador[] cuidadoresCobraSegunda = new Cuidador[5];
		cuidadoresCobraSegunda[0]=manuelCarmona;
		cuidadoresCobraSegunda[1]=lydiaValentin;
		Peligroso cobraSegunda = new Peligroso(13,"Cobra",13,LocalDate.of(2024, 3, 5),cuidadoresCobraSegunda);

		Manso jirafa = new Manso(700,"Jirafa",20,LocalDate.of(2024, 3, 4),manuelCarmona);

		Animal[] habitaculos = new Animal[5];
		habitaculos[0]=leon;
		habitaculos[1]=cobraPrimera;
		habitaculos[3]=cobraSegunda;
		habitaculos[4]=jirafa;
		Zoo.setHabitaculos(habitaculos);

		System.out.println(
				Zoo.contarAnimalesBienUbicados()
				);
		System.out.println(
				esCuidadoPor(2, rafaelNadal)+"\n"
				+esCuidadoPor(4, rafaelNadal)+"\n"
				+esCuidadoPor(0, rafaelNadal)
				);
		
}
	public static boolean esCuidadoPor(int numeroHabitaculo,Cuidador cuidadorBuscado) {
		boolean esCuidadoPor=false;
		
		Animal animalAux = Zoo.getHabitaculos()[numeroHabitaculo];
		if (animalAux instanceof Manso) {
			Manso animalManso = (Manso) animalAux;
			if(animalManso.getCuidador().equals(cuidadorBuscado)) {
				esCuidadoPor=true;
			}
			
		} else if (animalAux instanceof Peligroso) {
			Peligroso animalPeligroso = (Peligroso) animalAux;
			Cuidador cuidadores []= animalPeligroso.getCuidadores();
			for (Cuidador cuidador : cuidadores) {
				if(cuidador!=null) {
					if(cuidador.equals(cuidadorBuscado)) {
						esCuidadoPor=true;
						break;
					}
				}
			}
		}
		
		return esCuidadoPor;
	}
}
