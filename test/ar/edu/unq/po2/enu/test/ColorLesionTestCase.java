package ar.edu.unq.po2.enu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.enu.ColorLesion;

class ColorLesionTestCase {

	//SUT
	ColorLesion rojo = ColorLesion.ROJO;
	
	@Test
	void testSiguienteRojo() {
		assertEquals(rojo.siguiente(), ColorLesion.GRIS);
	}
	
	@Test
	void testNivelRiesgo() {
		assertEquals(rojo.getNivelRiesgo(), 1);
	}
	
	@Test
	void testDescripcion() {
		assertEquals(rojo.getDescripcion(), "Lesion Roja");
	}

}
