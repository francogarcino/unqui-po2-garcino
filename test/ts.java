import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ts {

	LocalDateTime dt;
	DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	@BeforeEach
	void setup() {
		dt = LocalDateTime.of(2021, 7, 10, 21, 0);
	}
	
	@Test
	void test() {
		System.out.println(LocalDateTime.now().format(form));
		dt = dt.plusDays(21);
		System.out.println(dt);
	}
	
	@Test
	void update12Hours() {
		System.out.println("ACA v");
		System.out.println(dt);
		System.out.println(dt.plusHours(12));
	}
	
	@Test
	void testListPrint() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);a.add(9);a.add(4);a.add(2);
		List<Integer> b = a;
		b = b.subList(0, 1);
		System.out.println(a);
		System.out.println(b);
	}
	
}
