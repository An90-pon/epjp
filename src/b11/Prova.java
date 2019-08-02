package b11;

import java.util.Scanner;

public class Prova {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 0; j < n - 1; j++) {
				double z = 0;
				z = z + a + b * Math.pow(2, j);
				System.out.print(z + " ");
			}
			in.close();
		}
	}
}
