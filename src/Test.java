

public class Test {

	public static void main(String[] args) {
		Wuerfel w = new Wuerfel("blau", 5.0, 3.0, -5.0, 12.0);
		Wuerfel w1 = new Wuerfel("b", 2.0, 2.0, 2.0, 5.0);
		Koerper k = new Koerper();
		System.out.println(w.abstand(w1));
		System.out.println(w.abstand(k));

	}

}
