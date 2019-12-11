public class Wuerfel extends Koerper {
    private double laenge;

    public Wuerfel(String farbe, double x, double y, double z, double laenge){
        super(farbe, x, y, z);
        setLaenge(laenge);
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public double flaeche() {
        return 6 * (laenge * laenge);
    }

    @Override
    public double volumen() {
        return laenge * laenge * laenge;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), this.getLaenge());
    }

    public double abstand(Wuerfel w) {
        return super.abstand(w) + (Math.sqrt(2 * (this.laenge * this.laenge))/2) - (Math.sqrt(2 * (w.laenge * w.laenge))/2);
    }
}
