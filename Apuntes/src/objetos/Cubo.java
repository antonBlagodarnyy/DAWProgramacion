package objetos;

public class Cubo {
//Atributos
 String	material,  color;
 public final int CAPACIDAD_MAXIMA=10;
 int capacidadActual;
 boolean asa;
 
//Metodos 
 	//constructores
 	
 public Cubo() {//por defecto
		this.material="plastico";
		this.color="negro";
		this.asa=false;
		
		this.capacidadActual=0;
	}
 public Cubo(String material, String color, boolean asa, int capacidadActual) {//con parametros
		this.material=material;
		this.color=color;
		this.asa=asa;
	
		this.capacidadActual=capacidadActual;
	}
 
//Getter
	public String getMaterial() {
		return this.material;
	}
	public String getColor() {
		return this.color;
	}
	public boolean getAsa() {
		return this.asa;
	}
	
	public int getcapacidadActual() {
		return this.capacidadActual;
	}
	
	//Setter
	public void setMaterial(String material) {
		this.material=material;
	}
	public void setColor (String color) {
		this.color=color;
	}
	public void setAsa(boolean asa) {
		this.asa=asa;
	}
	
	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual=capacidadActual;
	}	
	
	//Constructor copia
	public Cubo(Cubo cuboOriginal) {
		this.material=cuboOriginal.material;
		this.color=cuboOriginal.color;
		this.asa=cuboOriginal.asa;
		
		this.capacidadActual=cuboOriginal.capacidadActual;
	}

	//Metodos
	public void llenarEntero() {
		this.capacidadActual=CAPACIDAD_MAXIMA;
	}
	public void llenarCubo(int l, Cubo cuboALlenar) {
		int capacidadActual=this.capacidadActual;
		if(l>0) {
			if (capacidadActual+l<CAPACIDAD_MAXIMA) {
				cuboALlenar.setCapacidadActual(l);
			} else {
				cuboALlenar.setCapacidadActual(CAPACIDAD_MAXIMA-l);
			}
		}
		
	}
	public void vaciar() {
		this.capacidadActual=0;
	}
	public void pintar() {
		int espaciosVacios = CAPACIDAD_MAXIMA-capacidadActual, anchura=5;
		for (int i = CAPACIDAD_MAXIMA; i>0;i--) {
			System.out.print("|");
			for (int u = anchura;u>0;u--) {
				if(espaciosVacios>0) {
					System.out.print(" ");
				} else {
					System.out.print("=");
				}
			}
			espaciosVacios--;
			System.out.print("|");
				System.out.println();
		}
		System.out.print(" ");
		for (int i = anchura; i >0;i--) {
			System.out.print("-");
		}
		System.out.print(" ");
	}
	
	public void volcarCubo(Cubo otroCubo) {
		int litrosCubo=this.capacidadActual;//guardamos los litros de ambos cubos
		int litrosOtroCubo = otroCubo.capacidadActual;
		
		int litrosTotales = litrosCubo +litrosOtroCubo;//sacamos los litros totales
		int litrosALlenar = 0;//inicializamos una var para los litros que va a llenar
		
			if(litrosTotales<CAPACIDAD_MAXIMA) {//si caben todos los litros
				litrosALlenar = litrosOtroCubo;//volcamos todos los litros
			}else {
				litrosALlenar = litrosCubo - CAPACIDAD_MAXIMA;//en caso contrario, solo lo llenamos hasta que este lleno
				
			}
			litrosCubo += litrosALlenar;//volcamos los litros calculados
			litrosOtroCubo-=litrosALlenar;//se lo restamos al cubo del otro cubo
			
			this.capacidadActual=litrosCubo;//atribuimos los nuevos litros a los objetos
			otroCubo.capacidadActual=litrosOtroCubo;
			
	}
}
