package ar.edu.unq.po2.enu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.enu.ActividadSemanal;
import ar.edu.unq.po2.enu.AgendaSemanal;
import ar.edu.unq.po2.enu.Deporte;
import ar.edu.unq.po2.enu.DiaDeLaSemana;

class AgendaSemanalTestCase {

	AgendaSemanal agenda = new AgendaSemanal();
	ActividadSemanal entrenamientoF = new ActividadSemanal(DiaDeLaSemana.MARTES, "9:00", 120, Deporte.FUTBOL);
	ActividadSemanal partidoF = new ActividadSemanal(DiaDeLaSemana.VIERNES, "18:00", 90, Deporte.FUTBOL);
	ActividadSemanal tenis = new ActividadSemanal(DiaDeLaSemana.JUEVES, "13:00", 60, Deporte.TENNIS);
	
	@BeforeEach
	void setUp() {
		agenda.agregarActividad(tenis);
		agenda.agregarActividad(entrenamientoF);
		agenda.agregarActividad(partidoF);
		System.out.println("- Setup realizado ---------------");
	}
	
	// ------------------------------------------
	
	@Test
	void testAgregarActividad() {
		AgendaSemanal agendaLocal = new AgendaSemanal();
		
		assertEquals(agendaLocal.getActividades().size(), 0);
		agendaLocal.agregarActividad(entrenamientoF);
		agendaLocal.agregarActividad(tenis);
		assertEquals(agendaLocal.getActividades().size(), 2);
	}
	
	// ------------------------------------------
	// a
	@Test
	void testTodosFutbol() {
		assertEquals(agenda.todosLosFutbol().size(), 2);
		assertTrue(agenda.todosLosFutbol().contains(entrenamientoF));
		assertTrue(agenda.todosLosFutbol().contains(partidoF));
	}
	
	// ------------------------------------------
	// b
	@Test
	void testSegunComplejidad() {
		assertEquals(agenda.lasDeComplejidad(2).size(), 2);
		assertTrue(agenda.todosLosFutbol().contains(entrenamientoF));
		assertTrue(agenda.todosLosFutbol().contains(partidoF));
	}
	
	// ------------------------------------------
	// c
	@Test
	void testHorasTotales() {
		assertEquals(agenda.horasSemanales(), 4.5);
	}
	
	// ------------------------------------------
	// d
	@Test
	void testMasBarata() {
		assertEquals(agenda.masBarataDe(Deporte.FUTBOL) , entrenamientoF);
	}
	
	// ------------------------------------------
	// e
	@Test
	void testMasBarataPorDeporte() {
		assertEquals(agenda.masBarataPorDeporte().size(), 2);
		assertTrue(agenda.masBarataPorDeporte().containsKey(Deporte.TENNIS));
		assertEquals(agenda.masBarataPorDeporte().get(Deporte.TENNIS), tenis);
	}
	
}
