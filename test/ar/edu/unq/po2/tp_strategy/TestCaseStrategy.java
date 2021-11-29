package ar.edu.unq.po2.tp_strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseStrategy {

	private EncriptadorNaive encrNaive;
	private EncriptadorGeneral encrNumerico;
	private EncriptadorGeneral encrVocal;
	
	@BeforeEach
	void setup() {
		encrNumerico = new EncriptadorNumerico();
		encrVocal = new EncriptadorVocal();
		
		encrNaive = new EncriptadorNaive(encrVocal);
	}
	
	@Test
	void testEncriptadorVocal() {
		assertEquals(encrNaive.encriptar("Hola mundo"), "Hule mandu");
		assertEquals(encrNaive.desencriptar("Jeve Cudi"), "Java Code");
	}
	
	@Test
	void testEncriptadorNum() {
		encrNaive.setEstrategia(encrNumerico);
		assertTrue(encrNaive.encriptar("jinx").equals("10,9,14,24"));
		assertEquals(encrNaive.desencriptar("15,2,10,5,20,15"), "objeto");
	}

}
