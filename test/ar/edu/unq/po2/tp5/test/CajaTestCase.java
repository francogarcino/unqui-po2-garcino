package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativo;
import ar.edu.unq.po2.tp5.ProductoTradicional;

class CajaTestCase {

	// SUT
	Caja caja = new Caja();
	ProductoCooperativo cereales = new ProductoCooperativo(50.0);
	ProductoTradicional agua = new ProductoTradicional(30.0);
	List<Producto> productos = new ArrayList<Producto>();
	
	@BeforeEach
	void setUp() {
		productos.add(cereales);
		productos.add(agua);
	}
	
	@Test
	void testPrecioPorProductos() {
		List<Producto> productosLocal = new ArrayList<Producto>();
		
		assertEquals(caja.precioAPagar(productosLocal), 0.0);
		productosLocal.add(cereales);
		productosLocal.add(agua);
		assertEquals(caja.precioAPagar(productosLocal), 75.0);
	}
	
}
