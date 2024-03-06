package boletin9.ejercicio2;

public class Main {

	public static void main(String[] args) {
		Circulo circuloTest = new Circulo(12);
		Circulo circuloTest2 = new Circulo(15);
		Rectangulo rectanguloTest = new Rectangulo(10,13);
		Rectangulo rectanguloTest2 = new Rectangulo(8,5);

		IFigura[] arrayDeFiguras = new IFigura[]{circuloTest, circuloTest2,
				rectanguloTest,rectanguloTest2 };
		
		System.out.println(circuloTest.toString());
		System.out.println(circuloTest2.toString());
		System.out.println(rectanguloTest.toString());
		System.out.println(rectanguloTest2.toString());
		
		double biggestArea=0;
		for (int i = 0; i < arrayDeFiguras.length; i++) {
			if(biggestArea < arrayDeFiguras[i].getArea())
			biggestArea = arrayDeFiguras[i].getArea();
		}
	System.out.println(biggestArea);
	}

}
