package boletin8_2.ejercicio6;
import java.util.Scanner;
import java.util.Arrays;

public class Aparcamiento {
	//Atributos
	public static final int PLAZAS_APARCAMIENTO=6;
	private  Coche [] plazas= new Coche [PLAZAS_APARCAMIENTO];
	
	//Metodos
	//Constructor
	public Aparcamiento() {
		super();
	}
	public Aparcamiento(Coche[] plazas) {
		super();
		this.plazas = plazas;
	}
	
	//Getter n Setter
	public Coche[] getPlazas() {
		return plazas;
	}
	public void setPlazas(Coche[] plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		String answer="| ";
		for (int i = 0; i<plazas.length;i++) {
			
			if(plazas[i]!=null)
				answer+=plazas[i].toString()+" |";
			else
				answer+="|               |";
		
		}
		return answer;
	}
	
	public void cargarDatos() {
		this.plazas[0] = new Coche ("4256 - BYZ");
		this.plazas[2] = new Deportivo ("2367- FFR","rojo");
		this.plazas[4] = new Deportivo ("46789- ZTG","amarillo");
	}
	
	public void registrarEntrada() {
		Scanner rEntrada = new Scanner(System.in);
		
		int plazaLibre = -1;
		for(int i =0; i< plazas.length;i++) {
			if(this.plazas[i]==null) {
				plazaLibre = i; 
				break;
			}
		}
		if (plazaLibre>=0) {
		Menu.pedirMatricula();
		this.plazas[plazaLibre] = new Coche(rEntrada.nextLine());
		Menu.cocheAparcado(plazaLibre);
		}
		else
			Menu.sinPlazas();
	}
	
	public void registrarSalida() {
		Scanner rSalidaString = new Scanner(System.in);
		Scanner rSalidaInt = new Scanner (System.in);
		boolean importeFlag=false;
		Menu.pedirMatricula();
		String matricula = rSalidaString.nextLine();
		
		for(int i = 0; i< plazas.length;i++) {
			if (plazas[i]!=null&&matricula.equals(plazas[i].getMatricula())) {
				Menu.pedirHoras();
				Menu.darImporte(plazas[i].getImporte(rSalidaInt.nextInt()));
				plazas[i]=null;
				importeFlag=true;
				break;
			}
		}
		if(!importeFlag)
			Menu.matriculaNoEncontrada();
	}



}