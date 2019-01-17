package testtttt;

import java.util.Scanner;

public class ExoScannerAffichenombresImpairs {

	public static void main(String[] args) {
		// ***demander à l'utilisateur de choisir un nombre minimum, puis un nombre max,
		// puis afficher tous les nombres IMPAIRS entre le min et le max***

		// on aura deux variables min/max , le scanner, et une boucle for ou while

		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez entrer un  nombre minimum :");
		int nombreMin = sc.nextInt();

		System.out.println("Maintenant, saisissez un nombre maximum");
		int nombreMax = sc.nextInt();

		System.out.println("une suite de nombre va safficher, veuillez confirmer par ok :");
		String ok = sc.next();

		// if (ok == "ok") {

		while (nombreMin <= nombreMax) {
			if (nombreMin % 2 != 0) {
				System.out.println(nombreMin);
			}
			nombreMin++;
			// }else {
			// System.out.println("veuillez confirmer svp");
			// }
			// }
		}

	}

}
