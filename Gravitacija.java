public class Gravitacija {

	public static void main(String[] args) {
		System.out.println("OIS je zakon!");
	}

	public static double izracunGravitacije(double v){
		double C = 6.674e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / (Math.pow(r + v, 2.0));
	}

	private static void izpis(int gPospesek, int nadVisina) {
		System.out.println(gPospesek);
		System.out.println(nadVisina);
	}
}
