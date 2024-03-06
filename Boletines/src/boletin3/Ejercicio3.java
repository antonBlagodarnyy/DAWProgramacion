package boletin3;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología.
		El presupuesto anual del hospital se reparte conforme a la siguiente tabla:
		****
		*Obtener la cantidad de dinero que recibirá cada área, teniendo en cuenta que su presupuesto es de 120000 euros.
		*/
		
		//declaramos el presupuesto del que disponemos.
		int presupuesto = 120000;
		
		//Calculamos cuanto se lleva cada departamento.
		double ginecología = presupuesto * 0.4;
		double traumatología = presupuesto * 0.3;
		double pediatría = presupuesto * 0.3;
		
		//Imprimimos los resultados.
		System.out.println("Presupuesto total: "+presupuesto);
		
		System.out.println("\nPresupuestos de cada departamento:\n"
				+ "Ginecología: "+ ginecología+"\n"
				+ "Traumatología: "+ traumatología+"\n"
				 + "Pediatría: "+ pediatría);
		

	}

}
