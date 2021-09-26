package ar.edu.unq.po2.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTestCase {

	public Counter counter;
	
	@BeforeEach
	public void setup() throws Exception {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(5);
		counter.addNumber(1);
		counter.addNumber(17);
		counter.addNumber(4);
	}
	
	@Test
	public void testPares() {
		int cantidadpares = counter.getNPares();
		
		assertEquals(cantidadpares, 1);
	}
	
	@Test
	public void testImpares() {
		int cantidadImpares = counter.getNImpares();
		
		assertEquals(cantidadImpares, 9);
	}
	
	@Test
	public void testMultiplos() {
		int multiplos = counter.cantidadDeMultiplosDe(2);
		
		assertEquals(multiplos, 1);
	}

	
}
