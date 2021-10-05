package ar.edu.unq.po2.enu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.enu.ActividadSemanal;
import ar.edu.unq.po2.enu.Deporte;
import ar.edu.unq.po2.enu.DiaDeLaSemana;

class ActividadSemanalTestCase {

	//SUT
	ActividadSemanal futbol = new ActividadSemanal(DiaDeLaSemana.LUNES, "15:00", 90, Deporte.FUTBOL);
	
	@Test
	void testCostoDeActividad() {
		assertEquals(futbol.costo(), 1150.0);	
	}
	
	@Test
	void testComplejidad() {
		assertTrue(futbol.getDeporte().getComplejidad() == 2);		
	}
	
	@Test
	void testImpresion() {
		String futPrint = futbol.toString();
		assertEquals(futPrint, ("Deporte: " + futbol.getDeporte() 
								+ " Dia: " + futbol.getDia() 
								+ " A LAS: " + futbol.getHoraInicio() 
								+ " Duración: " + (futbol.getDuracion() / 60) 
								+ " hora(s)"));
	}

	// ------------------------------------------------------------------
	
	@Test
	void testEsDeDeporte() {
		assertTrue(futbol.esDe(Deporte.FUTBOL));
		assertFalse(futbol.esDe(Deporte.JABALINA));
	}
	
}
