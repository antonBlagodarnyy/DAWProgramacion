package boletinAmpliacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class metodosTest {

	@Test
	void printPath() {
		assertEquals(metodos.printPath(1,1,3,3),2);
	}

}
