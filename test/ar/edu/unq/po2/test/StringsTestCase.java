package ar.edu.unq.po2.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringsTestCase {

	@Test
	void test() {
		String a = "abc";
		String s = a;
		String t;
		
		assertEquals(s.length(), 3);
		assertEquals(1 + a, "1abc");
		
		System.out.println(a.toUpperCase());
		assertEquals("Libertad".indexOf("r"), 4);
		assertEquals("Universidad".lastIndexOf("i"), 7);
		assertEquals("Quilmes".substring(2,4), "il");
		assertFalse((a.length()+a).startsWith("a"));
		assertTrue(s == a);
		assertTrue(a.substring(1,3).equals("bc"));
	}

}
