package no.hvl.dat100.lab5.tabeller;


public class Tabeller {
	public static void main(String[] args) {
		int[] heltall1 = { 1, 3, 5, 7, 9 };
		int[] heltall2 = { 42, 67, 81 };

		skrivUt(heltall1);
		System.out.println();
		tilStreng(heltall1);
		System.out.println();
		System.out.println(finnesTall(heltall1, 3));
		int[] kopitabell = reverser(heltall1);
		skrivUt(kopitabell);
		System.out.println();
		erSortert(heltall1);
		int[] nytabell1 = settSammen(heltall1, heltall2);
		skrivUt(nytabell1);

	}

	// opgave a
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println("observasjon " + i + ":" + tabell[i]);
		}
		// oppgave b

		int[] heltall2 = { 42, 67, 81 };
		System.out.println(tilStreng(heltall2));

		// oppgave c

		System.out.println(summer(tabell));
	}

	public static String tilStreng(int[] tabell) {

		String str = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i + 1 == tabell.length) {
				str += tabell[i];
			} else {
				str += tabell[i] + ",";
			}
		}
		return str + "]";

	}

	// oppgave c
	public static int summer(int[] tall) {
		int sum = 0;
		for (int i = 0; i < tall.length; i++) {
			sum += tall[i];
		}

		return sum;
	}

	public static int summer2(int[] tall) {
		int i = 0;
		int sum = 0;
		while (i < tall.length) {
			sum += tall[i];
			i++;
		}
		return sum;
	}

	public static int summer3(int[] tall) {

		int sum = 0;
		for (int a : tall) {
			sum += a;
		}
		return sum;
	}

	// oppgave d
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		System.out.println("false");

		int i = 0;
		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall)
				funnet = true;
			else {
				i++;
			}
		}
		System.out.println("true");

		return funnet;
	}

	// oppgave e
	
	public static int posisjonTall(int[] tabell, int tall) {
		int tal = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				tal = i;
			}
		}
		System.out.print("indeks nur " + ": " + tal);
		return tal;
	}

	// oppgave f

	public static int[] reverser(int[] tabell) {
		int[] kopitabell = new int[tabell.length];
		for (int i = 0, s = tabell.length - 1; i < tabell.length; i++, s--) {
			kopitabell[i] = tabell[s];

		}
		return kopitabell;
	}
	// oppgave g

	public static boolean erSortert(int[] tabell) {
		boolean sorter = true;
		int i = 1;
		while (!sorter && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i])
				i++;
			else
				sorter = false;

		}
		System.out.println(sorter);
		return false;
	}

	// opgave h
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nytabell1 = tabell1.length + tabell2.length;
		int[] nytabell2 = new int[nytabell1];
		for (int i = 0; i < tabell1.length; i++) {
			nytabell2[i] = tabell1[i];

		}
		for (int s = 0; s < tabell2.length; s++) {
			nytabell2[tabell1.length + s] = tabell2[s];

		}
		System.out.println(nytabell2);
		return nytabell2;
	}
}
