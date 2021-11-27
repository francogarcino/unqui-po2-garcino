package ar.edu.unq.po2.tp_template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Empleados {

	Empleado empleadoTemporal;
	Empleado empleadoPasante;
	Empleado empleadoPlanta;
	
	@BeforeEach
	void setup() {
		empleadoTemporal = new EmpleadoTemporario(false, 2);
		empleadoPasante = new EmpleadoPasante();
		empleadoPlanta = new EmpleadoPlanta(3);
	}
	
	@Test
	void testSueldo() {
		empleadoTemporal.registrarHoras(10);
		assertEquals(empleadoTemporal.sueldo(), 1000.5);
		
		empleadoPasante.registrarHoras(8);
		assertEquals(empleadoPasante.sueldo(), 278.4);
		
		empleadoPlanta.registrarHoras(40);
		assertEquals(empleadoPlanta.sueldo(), 3001.5);
	}

}
