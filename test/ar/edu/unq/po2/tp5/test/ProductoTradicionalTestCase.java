package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.ProductoTradicional;

class ProductoTradicionalTestCase {

	// SUT
	ProductoTradicional fideos = new ProductoTradicional(80.0);
	
	@Test
	void testGetPrecio() {
		assertEquals(fideos.getPrecio(), 80.0);
	}

}
