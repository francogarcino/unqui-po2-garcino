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
		assertFalse(poker.verificar("2D", "AC", "4C", "4T", "QP"));
		assertTrue(poker.verificar("2D", "2C", "4C", "2T", "2P"));
	}

}
