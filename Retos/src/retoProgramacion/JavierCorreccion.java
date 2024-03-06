package retoProgramacion;
import java.util.Scanner;

public class JavierCorreccion {

	public static void main(String[] args) {
		// 

		//ejercicio1();
		//calculadora();
		//fractorial();
	//fibonacci();
		rectangulo();

	}

	
	//EJERCICIO 1
	
	public static void ejercicio1() {
		int inicio=1;

		while(inicio<=100) {



			if(inicio%3==0 && inicio%5==0) {
				System.out.println("");

			}else if(inicio%5==0) {
				System.out.println("buzz");
			}else if(inicio%3==0) {
				System.out.println("fizz");
			}else {
				System.out.println(inicio);
			}

			inicio++;
		}

	}
	
	//CALCULADORA
	
	
	public static void calculadora() {
		System.out.println("Elija una opcion (suma/resta/multiplicacion/division)");
		Scanner usuario= new Scanner (System.in);
		String opcion=usuario.nextLine();

		switch(opcion) {
		case "suma": suma();
		break;
		case "resta": resta();
			break;
		case "multiplicacion": multiplicacion();
			break;
		case "division": division();
			break;
		default : System.out.println("debe elegir una opcion");
		break;



		}

	}
	public static void suma () {
		System.out.println("introduzca el primer numero para la suma");
		Scanner suma1 = new Scanner (System.in);
		double numero1=suma1.nextDouble();

		System.out.println("introduzca el segundo numero");
		Scanner suma2 = new Scanner (System.in);
		double numero2=suma2.nextDouble();

		double resultado=numero1 + numero2;

		System.out.println("resultado: " + resultado);
	}

	public static void resta () {
		System.out.println("introduzca el primer numero para la resta");
		Scanner resta1 = new Scanner (System.in);
		double numero1=resta1.nextDouble();

		System.out.println("introduzca el segundo numero");
		Scanner resta2 = new Scanner (System.in);
		double numero2=resta2.nextDouble();

		double resultado=numero1 - numero2;

		System.out.println("resultado: " + resultado);
	}
	public static void multiplicacion () {
		System.out.println("introduzca el primer numero para la multiplicacion");
		Scanner multiplicacion1 = new Scanner (System.in);
		double numero1=multiplicacion1.nextDouble();

		System.out.println("introduzca el segundo numero");
		Scanner multiplicacion2 = new Scanner (System.in);
		double numero2=multiplicacion2.nextDouble();

		double resultado=numero1 * numero2;

		System.out.println("resultado: " + resultado);
	}
	public static void division () {
		System.out.println("introduzca el primer numero para la division");
		Scanner division1 = new Scanner (System.in);
		double numero1=division1.nextDouble();

		System.out.println("introduzca el segundo numero");
		Scanner division2 = new Scanner (System.in);
		double numero2=division2.nextDouble();

		double resultado=numero1 / numero2;

		System.out.println("resultado: " + resultado);
	}
	
	//CALCULADORA FRACTORIAL
	
	public static void fractorial() {
		
		Scanner fractorial = new Scanner(System.in);
		int numero1=fractorial.nextInt();
		System.out.print(numero1 + " = ");
		
		while(numero1>1) {
			
			
		}
		
		
	
	
	}
public static void fibonacci() {
	System.out.println("introduzca un numero");
	Scanner fibonacci = new Scanner (System.in);
	int numero1=fibonacci.nextInt();
	
	
	
	while(numero1<0) {
		System.out.println("valor incorrecto: introduzca un numero positivo");
		numero1=fibonacci.nextInt();
		System.out.println("numero introducido");
		
	}
	
	int incremento=numero1;
	int contador=0;
	
	while(contador<=5) {
		
   System.out.println(numero1);
		
   	
		numero1+=incremento;
		
		
		contador++;
		
		
		
	}
	
	}


 public static void rectangulo () {
	 Scanner teclado = new Scanner (System.in);
	    System.out.print ("Digite número de ladrillo para la basen\n recuerde que no puede ser mayor a 15\n");
	    int n= teclado.nextInt();
	    
	    if (n>=0 && n <=15){
	    System.out.print ("Gracia por introducir un número correcto!!");
	    }
	    else if (n<0 || n>15){
	        System.out.print ("No has introducido un número correcto");    
	         }
	            for (int i=0; i<n; i++){
	            System.out.println ("");
	         
	                                
	            for (int j=0; j<n; j++){
	            System.out.print ("*");
	            
	            }
	    }
 }
}

