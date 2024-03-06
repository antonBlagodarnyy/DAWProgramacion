package retoProgramacion;

import java.util.Scanner;

public class AntonioJesusAntonBlagodarnyy {

	public static void main(String[] args) {
		//fizzbuzz();
		//calculadora();
		//calculadoraFactorial();
		//Estrellas();
		Fibonacci();
	}
	public static void fizzbuzz(){
		/*Escribe un programa que muestre por consola los números de 1 a 100
	
	(ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los
	siguientes:
	- Múltiplos de 3 por la palabra "fizz".
	- Múltiplos de 5 por la palabra "buzz".
	- Múltiplos de 3 y de 5 a la vez por la palabra "".*/
	
	for (int i = 1 ; i<= 100 ; i++) {
	if (i %3==0 && i % 5 != 0) {
		System.out.println("fizz");
	} else if (i %5==0 && i % 3 != 0) {
		System.out.println("buzz");
	} else if (i %5==0 && i % 3 == 0){
		System.out.println( "");
	} else {
		System.out.println(i);
	}
	
	
	}
}

public static void calculadora() {
	/*Calculadora Simple: Crea una calculadora que pueda realizar las cuatro operaciones

	básicas (suma, resta, multiplicación y división) en función de la entrada del usuario.
	Pide al usuario que ingrese dos números enteros y elija una operación.*/
	Scanner sInt = new Scanner (System.in);

	int n1, n2;
	double resultado = 0;
	int o;
	System.out.println("Introduzca un numero.");
	n1 = sInt.nextInt();
	System.out.println("Introduzca un segundo numero.");
	n2 = sInt.nextInt();
	
	System.out.println("Que operacion realizamos?\n"
			+ "1.-Multiplicacion.\n"
			+ "2.-Division.\n"
			+ "3.-Suma.\n"
			+ "4.-Resta.\n");
	o = sInt.nextInt();
	
	switch (o) {
	case 1:
		resultado = n1* n2;
		break;
	case 2: 
		resultado =  (n1*1.0/ n2);
		break;
	case 3:
		resultado = n1+ n2;
		break;
	case 4:
		resultado = n1- n2;
		break;
		default:
			System.out.println("Error en menu operacion");
			
	}
	System.out.println(resultado);
	
}

public static void calculadoraFactorial() {
	
/*Calculadora de Factorial: Solicita al usuario que ingrese un número entero positivo y
calcula su factorial.*/
	Scanner s = new Scanner(System.in);
	int n, resultado = 1;
	System.out.println("Introduzca un numero");
	n = s.nextInt();
	if (n >= 0) {
	for (int i = n ; i > 0; i--) {
		resultado *= i; 
	}
	System.out.println(resultado);
} else {
	System.out.println("error");
}
}

public static void Estrellas() {
	
/*Generador de Patrones de Estrellas: Pide al usuario que ingrese las medidas válidas
del rectángulo y luego muestra un patrón de estrellas en forma de rectángulo.*/
	Scanner s = new Scanner(System.in);
	
	int a, l;
	System.out.println("Introduzca el lado del rectangulo");
	l = s.nextInt();
	System.out.println("Y la altura");
	a = s.nextInt();
	for ( int i = a; i>0; i--) {
		
		for ( int u = l ; u >0; u--) {
			
			if ( u > 1 ) {
				System.out.print("*");
				
			} else {
				System.out.println("*");
			}
	}
	}
	for ( int i = l; i>0; i-- ) {
		System.out.print("*");
	}
	
	/*for ( int i = a; i>0; i--) {
		System.out.print("*");
			for (int u = (l-2); u>0; u-- ) {
				System.out.print(" ");
			}
			System.out.print("*\n");
	}*/
	
}

public static void Fibonacci() {
	/*Serie Fibonacci: Escribe un programa que solicite al usuario un número entero
positivo y luego muestre los primeros n números de la serie de Fibonacci, donde n es el
número ingresado. La serie de Fibonacci comienza con 0 y 1, y cada número posterior
es la suma de los dos anteriores.*/
	Scanner s = new Scanner (System.in);
	int n;
	int suma=1, numero1 = 1, numero0 = 0;
	System.out.println("Introduzca el numero:");
	n = s.nextInt();
	if ( n >0) {
	System.out.println(numero0);

	for ( int i = 2 ; i <= n ; i++) {
		suma =numero0+numero1;
		System.out.println(numero1);
		numero0=numero1;
		numero1=suma;
		
	}
} else {
	System.out.println("error");
}
}
}
