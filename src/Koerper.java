
public class Koerper {
	public String farbe;
	public Punkt koordinate;

	public Koerper(String farbe, double x, double y, double z) {
		this.farbe = farbe;
		koordinate = new Punkt(x, y, z);
	}
	
	
	public Koerper() {
		this("schwarz", 0.0, 0.0, 0.0);
	}
	
	public double volumen() {
		return 0.0;
	}
	
	public double flaeche() {
		return 0.0;
	}
	
	public double abstand(Koerper k) {
		return koordinate.abstand(k.koordinate);
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %s", farbe, koordinate.x, koordinate.y, koordinate.z);
	}
}
