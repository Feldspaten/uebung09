import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KoerperTest {

	@Test
	void constructorEmptyTest() {
		Koerper k = new Koerper();
		assertEquals("schwarz", k.farbe);
		assertEquals(0.0, k.koordinate.x);
		assertEquals(0.0, k.koordinate.y);
		assertEquals(0.0, k.koordinate.z);
	}
	
	@Test
	void constructorTest() {
		Koerper k = new Koerper("blau", 5.0, 1.0, -6.0);
		assertEquals("blau", k.farbe);
		assertEquals(5.0, k.koordinate.x);
		assertEquals(1.0, k.koordinate.y);
		assertEquals(-6.0, k.koordinate.z);
	}
	
	@Test
	void volumenTest() {
		Koerper k = new Koerper("blau", 5.0, 1.0, -6.0);
		double result = k.volumen();
		assertEquals(0.0, result);
	}
	
	@Test
	void flaecheTest() {
		Koerper k = new Koerper("blau", 5.0, 1.0, -6.0);
		double result = k.flaeche();
		assertEquals(0.0, result);
	}
	
	@Test
	void abstandTest() {
		Koerper k1 = new Koerper("blau", 5.0, 1.0, -6.0);
		Koerper k2 = new Koerper();
		
		double result = k1.abstand(k2);
		
		assertEquals(7.874007874011811, result, 0.000000001);
	}
	
	@Test
	void toStringTest() {
		Koerper k = new Koerper("blau", 5.0, 1.0, -6.0);
		String result = k.toString();
		assertEquals("blau, 5.0, 1.0, -6.0", result);
	}
	
	
	
	
}
