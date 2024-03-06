package boletin8_2.ejercicio3;
import java.time.LocalDate;
public class ReciboDeLuz {
	//ATRIBUTOS
	private LocalDate primeraFechaCobro;
	private  LocalDate[]  historicoFechasCobro;

	//METODOS
	//Constructor
	public ReciboDeLuz(LocalDate primeraFechaCobro) {
		super();
		this.primeraFechaCobro = primeraFechaCobro;
		this.historicoFechasCobro = createHistoricoFechas() ;

	}
	private LocalDate [] createHistoricoFechas() {
		LocalDate [] historicoFechasCobro = new LocalDate [11];//array a devolver
		LocalDate  fechaAux = this.primeraFechaCobro;//array para incrementar el dia en 10

		for  (int i = 0; i < 11; i++) {
			historicoFechasCobro [i]= fechaAux;//asignamos la fecha
			fechaAux=fechaAux.plusDays(15);//la incrementamos en 10
		}

		return historicoFechasCobro;
	}

	//Getter/Setter
	public LocalDate getPrimeraFechaCobro() {
		return primeraFechaCobro;
	}

	public void setPrimeraFechaCobro(LocalDate primeraFechaCobro) {
		this.primeraFechaCobro = primeraFechaCobro;
	}

	public LocalDate[] getHistoricoFechasCobro() {
		return historicoFechasCobro;
	}

	public void setHistoricoFechasCobro(LocalDate[] historicoFechasCobro) {
		this.historicoFechasCobro = historicoFechasCobro;
	}
	//toString
	@Override public String toString() {
		String answer= "Recibo de Luz:\n";
		for (int i = 0; i<11;i++) {
			answer+=i+" Fecha de Cobro: "+historicoFechasCobro[i]+"\n";
		} 
		
		return answer;

	}

}
