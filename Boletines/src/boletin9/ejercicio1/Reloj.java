package boletin9.ejercicio1;
import java.time.*;
public abstract class Reloj {
	//Atributos
	private boolean alarmaInterruptor;//true encendido, false apagado
	private LocalTime tiempo;
	private LocalTime alarmaHora;

	//Metodos
	//Constructor
	public Reloj(boolean alarmaInterruptor, LocalTime alarmaHora) {
		super();
		this.alarmaInterruptor = alarmaInterruptor;
		//this.tiempo = LocalTime.now().withNano(0);
		this.alarmaHora = alarmaHora;
	}

	//Get n Set
	public boolean alarmaInterruptor() {
		return alarmaInterruptor;
	}

	public LocalTime getAlarmaHora() {
		return alarmaHora;
	}

	//Establece la alarma
	public void establecerAlarma(int hora, int minuto) {
		this.alarmaHora = LocalTime.of(hora,minuto);
	}

	public LocalTime getTiempo() {
		return tiempo;
	}

	//Metodos del interruptor
	public void activarAlarma() {
		this.alarmaInterruptor=true;
	}
	public void desactivarAlarma() {
		this.alarmaInterruptor=false;
	}

	//muestra la hora
	abstract String mostrarHora();

	@Override
	//No mostramos el tiempo, eso ya lo hacemos con mostrarHora();
	public String toString() {
		return "Reloj [alarmaInterruptor=" + alarmaInterruptor + ", tiempo="+tiempo+", alarmaHora=" +  alarmaHora
				+ ", mostrarHora()=" + mostrarHora() + "]";
	}

	
}
