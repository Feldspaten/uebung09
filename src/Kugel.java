
public class Kugel extends Koerper {
	private double radius;

	public Kugel(String farbe, double x, double y, double z, double radius) {
		super(farbe, x, y, z);
		setRadius(radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double volumen() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double flaeche() {
		return 4 * Math.PI * (radius * radius);
	}

	public double abstand(Kugel k) {
		return this.abstand(k) - this.radius - k.radius;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s", farbe, koordinate.toString(), radius );
	}
}
