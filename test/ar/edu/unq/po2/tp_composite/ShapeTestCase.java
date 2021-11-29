package ar.edu.unq.po2.tp_composite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTestCase {

	private ShapeLeaf a;
	private ShapeLeaf b;
	private ShapeLeaf c;
	
	@BeforeEach
	void setup() {
		a = new ShapeLeaf(1);
		b = new ShapeLeaf(0);
		c = new ShapeLeaf(7);
	}
	
	@Test
	void testDeepest() {
		assertTrue(a.deepest() == 0);
		
		IShapeShifter compose = a.compose(b.compose(c));
		assertTrue(compose.deepest() == 2);
	}
	
	@Test
	void testFlat() {
		assertTrue(a.flat().deepest() == 0);
		
		IShapeShifter compose = a.compose(b.compose(c));
		assertTrue(compose.flat().deepest() == 1);
	}
	
	@Test
	void testValues() {
		assertTrue(a.values().size() == 1);
		
		IShapeShifter extraShape = (new ShapeLeaf(5)).compose(a);
		IShapeShifter compose = (a.compose(b.compose(c)).compose(extraShape ));
		
		assertTrue(compose.values().size() == 5);
	}

}
