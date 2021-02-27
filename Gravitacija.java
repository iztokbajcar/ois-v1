import java.util.Scanner;

public class Gravitacija {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nv = sc.nextDouble();

		izpis(izracunGravitacije(nv), nv);
	}

	public static double izracunGravitacije(double v){
		double C = 6.674e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / (Math.pow(r + v, 2.0));
	}

	private static void izpis(double gPospesek, double nadVisina) {
		System.out.println(gPospesek);
		System.out.println(nadVisina);
	}
}
