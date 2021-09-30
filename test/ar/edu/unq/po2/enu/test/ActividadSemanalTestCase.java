package ar.edu.unq.po2.enu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.enu.ActividadSemanal;
import ar.edu.unq.po2.enu.Deporte;
import ar.edu.unq.po2.enu.DiaDeLaSemana;

class ActividadSemanalTestCase {

	ActividadSemanal futbol = new ActividadSemanal(DiaDeLaSemana.LUNES, "15:00", 90, Deporte.FUTBOL);
	
	@Test
	void costoDeFutbol() {
		assertEquals(futbol.costo(), 1150.0);
		assertTrue(futbol.getDeporte().getComplejidad() == 2);
	}

}
