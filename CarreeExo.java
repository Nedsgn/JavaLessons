package testtttt;

import java.util.Scanner;

public class CarreeExo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Vous êtes prêts ?");

		String ii = sc.nextLine();

		for (int i = 1; i <= 32; i++) { // le i++ incrémente le précédent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 4 == 0) {// multiple de 5

				System.out.println();
			}
			// ca fait un carré d'étoiles
			// System.out.println();
			// System.out.println(""); c'est pareil que le println
		}
//***faire un carré de 10/10****
		System.out.print("Et là ?");

		String p = sc.nextLine();

		for (int i = 1; i <= 100; i++) { // le i++ incrémente le précédent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 10 == 0) {// multiple de 10

				System.out.println();
			}
			// ca fait un carré d'étoiles
			// System.out.println();
			// System.out.println(""); c'est pareil que le println
		}

		// l'utilisateur doit entrer un nombre et dans tous les cas , ça nous affiche un
		// carré

		int cote = sc.nextInt();
		int total = cote * cote;
		for (int i = 1; i <= total; i++) { // le i++ incrémente le précédent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 10 == cote) {// multiple de 10

				System.out.println();
			}
		}

	}
}
