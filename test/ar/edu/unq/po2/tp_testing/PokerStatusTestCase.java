package ar.edu.unq.po2.tp_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	// SUM
	PokerStatus poker;
	Carta asCorazones; Carta asPicas; Carta asTreboles; Carta asDiamantes;
	Carta sietePicas; Carta reyCorazones; Carta diezCorazones; Carta cuatroCorazones;
	Carta reyTreboles; Carta seisTreboles; Carta tresCorazones; Carta reyPicas; 
	
	// SetUp
	@BeforeEach
	void setup() {
		poker = new PokerStatus();
		asCorazones = new Carta(Valor.AS, Palo.CORAZON); asPicas = new Carta(Valor.AS, Palo.PICA);
		asTreboles = new Carta(Valor.AS, Palo.TREBOL); asDiamantes = new Carta(Valor.AS, Palo.DIAMANTE);
		sietePicas = new Carta(Valor.SIETE, Palo.PICA); reyCorazones = new Carta(Valor.K, Palo.CORAZON);
		diezCorazones = new Carta(Valor.DIEZ, Palo.CORAZON); cuatroCorazones = new Carta(Valor.CUATRO, Palo.CORAZON);
		reyTreboles = new Carta(Valor.K, Palo.TREBOL); seisTreboles = new Carta(Valor.SEIS, Palo.TREBOL);
		tresCorazones = new Carta(Valor.TRES, Palo.CORAZON); reyPicas = new Carta(Valor.K, Palo.PICA);
	}
	
	// Exercise & Verify
	@Test
	void test() {
		// es poker
		assertEquals(poker.verificar(asCorazones, asDiamantes, asPicas, asTreboles, reyPicas), "Poker");
		
		// es trio
		assertEquals(poker.verificar(reyCorazones, reyPicas, reyTreboles, tresCorazones, seisTreboles), "Trio");
		
		// es color
		assertEquals(poker.verificar(asCorazones, reyCorazones, cuatroCorazones, tresCorazones, diezCorazones), "Color");
		
		// no es nada
		assertEquals(poker.verificar(reyCorazones, asPicas, tresCorazones, seisTreboles, reyTreboles), "Nada");
	}

}
