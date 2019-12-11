import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BruchTest {

	@Test
	void ConstructorTest() {
		Bruch a = new Bruch(2, 4);

		assertEquals(2, a.zaehler);
		assertEquals(4, a.nenner);
	}

	@Test
	void ConstructorSingleTest() {
		Bruch a = new Bruch(4);

		assertEquals(1, a.zaehler);
		assertEquals(4, a.nenner);
	}

	@Test
	void toStringTest() {
		Bruch a = new Bruch(2, 4);
		assertEquals("2 / 4", a.toString());
	}

	@Test
	void kuerzeTest() {
		Bruch a = new Bruch(2, 8);
		Bruch d = new Bruch(25, 5);

		a.kuerze();
		d.kuerze();

		assertEquals(1, a.zaehler);
		assertEquals(4, a.nenner);

		assertEquals(5, d.zaehler);
		assertEquals(1, d.nenner);
	}

	@Test
	void addiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(4);

		Bruch c = new Bruch(2, 8);
		Bruch d = new Bruch(4, 7);

		a.addiere(b);
		c.addiere(d);

		assertEquals(3, a.zaehler);
		assertEquals(4, a.nenner);

		assertEquals(23, c.zaehler);
		assertEquals(28, c.nenner);
	}

	@Test
	void subtrahiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(4);

		Bruch c = new Bruch(2, 8);
		Bruch d = new Bruch(4, 7);

		a.subtrahiere(b);
		c.subtrahiere(d);

		assertEquals(1, a.zaehler);
		assertEquals(4, a.nenner);

		assertEquals(-9, c.zaehler);
		assertEquals(28, c.nenner);

	}

	@Test
	void multipliziereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(4);

		Bruch c = new Bruch(2, 8);
		Bruch d = new Bruch(4, 7);

		a.multipliziere(b);
		c.multipliziere(d);

		assertEquals(1, a.zaehler);
		assertEquals(8, a.nenner);

		assertEquals(1, c.zaehler);
		assertEquals(7, c.nenner);
	}

	@Test
	void dividiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(4);

		Bruch c = new Bruch(2, 8);
		Bruch d = new Bruch(4, 7);

		a.dividiere(b);
		c.dividiere(d);

		assertEquals(2, a.zaehler);
		assertEquals(1, a.nenner);

		assertEquals(7, c.zaehler);
		assertEquals(16, c.nenner);
	}

	@Test
	void wertTest() {
		Bruch a = new Bruch(2, 4);
		Bruch d = new Bruch(4, 7);

		double wertA = a.wert();
		double wertD = d.wert();

		assertEquals(0.5, wertA);
		assertEquals(0.5714285714, wertD, 0.0000001);
	}

	@Test
	void staticAddiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(3, 4);

		Bruch c = Bruch.addiere(a, b);

		assertEquals(5, c.zaehler);
		assertEquals(4, c.nenner);
	}

	@Test
	void staticSubtrahiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(-5, 4);

		Bruch c = Bruch.subtrahiere(a, b);

		assertEquals(7, c.zaehler);
		assertEquals(4, c.nenner);
	}

	@Test
	void staticDividiereTest() {
		Bruch a = new Bruch(2, 4);
		Bruch b = new Bruch(5, 8);

		Bruch c = Bruch.dividiere(a, b);

		assertEquals(4, c.zaehler);
		assertEquals(5, c.nenner);
	}

	@Test
	void staticMultipliziereTest() {
		Bruch a = new Bruch(2, 7);
		Bruch b = new Bruch(3, 9);

		Bruch c = Bruch.multipliziere(a, b);

		assertEquals(2, c.zaehler);
		assertEquals(21, c.nenner);
	}

}
