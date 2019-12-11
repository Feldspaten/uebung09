
public class Punkt {
	public double x;
	public double y;
	public double z;

	public Punkt(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void bewege(double dX, double dY, double dZ) {
		x = x + dX;
		y = y + dY;
		z = z + dZ;
	}

	public double abstand(Punkt p) {
		double result;
		result = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2) + Math.pow((p.z - z), 2));
		return result;
	}
	
	public String toString() {
		return String.format("(%s, %s, %s)", x, y, z);
	}
}
