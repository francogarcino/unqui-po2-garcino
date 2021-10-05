package ar.edu.unq.po2.enu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.enu.Deporte;

class DeporteTestCase {

	//SUT
	Deporte futbol = Deporte.FUTBOL;
	
	@Test
	void testComplejidad() {
		assertEquals(futbol.getComplejidad(), 2);
	}

}
