package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {

		final int[][] tabell1 = { {1,2,3}, {4,5,6}, {7,8,9} };
		final int[][] tabell2 = { {10,11,12}, {13,14,15}, {16,17,18} };

	skrivUt(tabell1);
	System.out.println();
	tilStreng(tabell1);
	System.out.println();
	skaler(3,tabell2);
	System.out.println();
	erLik(tabell1,tabell2);
	};
	
	
	
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int s = 0; s < matrise[i].length; s++) {
				System.out.println(matrise[i][s] + " ");

			}
			System.out.println();
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String m = " ";
		for (int i = 0; i < matrise.length; i++) {
			for (int s = 0; s < matrise[i].length; s++) {

				m += (matrise[i][s] + " ");
			}

			m += ("\n ");

		}
		System.out.print(m);
		return m;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] kopitabell = new int[matrise.length][matrise.length];
		for (int i = 0; i < matrise[i].length; i++) {
			for (int s = 0; s < matrise[s].length; s++) {
				System.out.print(matrise[i][s] * tall + " ");
			}
			System.out.print("\n");
		}
		return kopitabell;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int rad1, kolonne1, rad2 = 0,  kolonne2;
		boolean lik = true;
		kolonne1 = a[0].length;
		rad1 = a.length;
		kolonne2 = b[0].length;
		if (rad1 != rad2 || kolonne1 != kolonne2) {
			System.out.println(false);
		} else {
			for (int i = 0; i < rad1; i++) {
				for (int s = 0; s < kolonne1; s++) {
					if (a[i][s] != b[i][s]) {
						lik = false;
						break;
					}
				}
			}
			if (lik)
				System.out.println(true);
			else
				System.out.print(false);
		}
		return lik;
	}
}

