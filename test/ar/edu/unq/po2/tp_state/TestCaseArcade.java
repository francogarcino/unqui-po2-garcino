package ar.edu.unq.po2.tp_state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseArcade {

	private MaquinaArcade maquina;
	
	@BeforeEach
	void setup() {
		maquina = new MaquinaArcade();
	}
	
	@Test
	void test() {
		maquina.botonInicioPulsado();
		maquina.ingresaFicha(); maquina.ingresaFicha();
		maquina.botonInicioPulsado();
		maquina.gameOver();
		maquina.botonInicioPulsado();
	}

}
