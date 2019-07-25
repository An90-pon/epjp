package b04;

public class Mainphysics {
	public static void main(String[] args) {

		double s = 30.23;
		double t = 5.56;
		double x0 = 56.0;
		double x1 = 45.0;
		double x2 = 89.0;
		double x3 = 78.0;
		int n = 3;
		double ales = 45.0;
		double corsa = 23.0;

		Speed reference = new Speed();
		// double result = reference.Vmed(s, t);
		System.out.println("La velocità media è: " + reference.Vmed(s, t));

		Distance reference1 = new Distance();
		// double result1 = reference1.D(x0, x1, x2, x3);
		System.out.println("La distanza tra i due punti è: " + reference1.D(x0, x1, x2, x3));

		Enginecapacity reference2 = new Enginecapacity();
		// double result2 = reference2.Ec(n, ales, corsa);
		System.out.println("La cilindrata del motore è: " + reference2.Ec(n, ales, corsa));

	}

}
