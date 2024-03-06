package boletin6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class metodosTest {


	@Test
	void areaCono() {
		assertEquals(metodos.areaCono(4,6),140.88);
	}
	@Test
	void volumenCono() {
		assertEquals(metodos.volumenCono(4,6), 100.53);
	}
	@Test
	void areaCilindro() {
		assertEquals(metodos.areaCilindro(4,6), 251.33);
	}
	@Test
	void volumenCilindro() {
		assertEquals(metodos.volumenCilindro(4,6), 301.59);
	}
}
