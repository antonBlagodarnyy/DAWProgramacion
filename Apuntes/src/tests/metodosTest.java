package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metodos.metodos;

class metodosTest {

	@Test
	void suma() {
		assertEquals(metodos.suma(4,6),10);
	}
	@Test
	void sumaPrimeroNegativo() {
		assertEquals(metodos.suma(-4,6),2);
	}
	@Test
	void sumaSegundoNegativo() {
		assertEquals(metodos.suma(4,-6),-2);
	}
	@Test
	void resta() {
		assertEquals(metodos.resta(4,6),-2);
	}
	@Test
	void restaSegundoNegativo() {
		assertEquals(metodos.resta(4,-6),10);
	}
	@Test
	void restaPrimeroNegativo() {
		assertEquals(metodos.resta(-4,6),-10);
	}

}
