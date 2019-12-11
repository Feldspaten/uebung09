import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PunktTest {

	@Test
	void constructorTest() {
		Punkt p = new Punkt(5.0, 1, -2.0);
		
		assertEquals(5.0, p.x);
		assertEquals(1.0, p.y);
		assertEquals(-2.0, p.z);
	}
	
	@Test
	void bewegeTest() {
		Punkt p = new Punkt(5.0, 1, -2.0);
		p.bewege(5.5, -1, 2.0);
		
		assertEquals(10.5, p.x);
		assertEquals(0.0, p.y);
		assertEquals(0.0, p.z);
	}
	
	@Test
	void abstandTest() {
		Punkt p1 = new Punkt(5.0, 2.0, 1.0);
		Punkt p2 = new Punkt(-5.0, 5, 7.5);
		
		double result = p1.abstand(p2);
		
		assertEquals(12.298373876248844, result,  0.0000000001);
	}
	
	@Test
	void toStringTest() {
		Punkt p1 = new Punkt(5.0, 2.0, 1.0);
		
		String result = p1.toString();
		
		assertEquals("(5.0, 2.0, 1.0)", result);
	}

}
