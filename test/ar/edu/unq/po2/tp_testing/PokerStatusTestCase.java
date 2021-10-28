package ar.edu.unq.po2.tp_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	// SUM
	PokerStatus poker;
	
	// SetUp
	@BeforeEach
	void setup() {
		poker = new PokerStatus();
	}
	
	// Exercise & Verify
	@Test
	void test() {
		// es poker
		assertEquals(poker.verificar("2C", "2D", "2T", "2P", "AC"), "Poker");
		
		// es trio
		assertEquals(poker.verificar("7T", "7C", "7P", "3D", "QC"), "Trio");
		
		// es color
		assertEquals(poker.verificar("3C", "7C", "AC", "KC", "10C"), "Color");
		
		// no es nada
		assertEquals(poker.verificar("3C", "8D", "AD", "9P", "KT"), "Nada");
	}

}
