package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.ProductoCooperativo;

class ProductoCooperativoTestCase {

	// SUT
	ProductoCooperativo gaseosa = new ProductoCooperativo(120.0);
	
	@Test
	void testGetPrecio() {
		assertEquals(gaseosa.getPrecio(), 108.0);
	}

}
