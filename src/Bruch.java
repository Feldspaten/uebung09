

public class Bruch {
	int zaehler;
	int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Bruch(int nenner) {
		this(1, nenner);
	}

	public String toString() {
		return zaehler + " / " + nenner;
	}

	public void addiere(Bruch b) {
		int aZ;
		int bZ;
		int aN;
		aZ = zaehler * b.nenner;
		bZ = nenner * b.zaehler;
		aN = nenner * b.nenner;
		zaehler = aZ + bZ;
		nenner = aN;
		this.kuerze();
	}
	
	public void subtrahiere(Bruch b) {
		int aZ;
		int bZ;
		int aN;
		aZ = zaehler * b.nenner;
		bZ = nenner * b.zaehler;
		aN = nenner * b.nenner;
		zaehler = aZ - bZ;
		nenner = aN;
		this.kuerze();
	}
	
	public void multipliziere(Bruch b) {
		zaehler = zaehler * b.zaehler;
		nenner = nenner * b.nenner;
		this.kuerze();
	}
	
	public void dividiere(Bruch b) {
		zaehler = zaehler * b.nenner;
		nenner = nenner * b.zaehler;
		this.kuerze();
	}
	
	public double wert() {
		return zaehler / (double)nenner;
	}
	
	public void kuerze() {
		int teiler = ggT(zaehler, nenner);
		zaehler = zaehler / teiler;
		nenner = nenner / teiler;
	}
	
	private int ggT(int x, int y) {
		while (y != 0) {
			  int temp = x % y;
			  x = y;
			  y = temp;
			}
		return x;
	}
	
	public static Bruch addiere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler, a.nenner);
		c.addiere(b);
		return c;
	}
	
	public static Bruch subtrahiere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler, a.nenner);
		c.subtrahiere(b);
		return c;
	}
	
	public static Bruch multipliziere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler, a.nenner);
		c.multipliziere(b);
		return c;
	}
	
	public static Bruch dividiere(Bruch a, Bruch b) {
		Bruch c = new Bruch(a.zaehler, a.nenner);
		c.dividiere(b);
		return c;
	}
}
