package testtttt;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExoDoWhileJustePrix {

	public static void main(String[] args) {
		// exo: Le juste prix : 3 chances de gagner . faire en sorte qu'il nous
		// repropose de jouer si on a perdu

		Scanner sc = new Scanner(System.in);

		// double prix = 120;
		int prix = ThreadLocalRandom.current().nextInt(0, 10);// on utilise ça pour générer un nombre aléatoire . le
																// local random est a utiliser que la avec le INT. on
																// peut remarquer entre les parenthèses les deux nombres
		int prixChoisi = 0;// IMPORTANT il faut déclarer la variable avec un nombre au debut puis après
							// l'inclure dans le do
		// double prixChoisi = sc.nextDouble();

		do {
			System.out.println("Veuillez saisir un nombre");
			prixChoisi = sc.nextInt();

			if (prixChoisi == prix) {
				System.out.println("Gagné !");
			} else if (prixChoisi > prix) {
				System.out.println("Perdu, c'est moins !");
			} else {
				System.out.println("perdu c'est plus");
			}
		} while (prixChoisi != prix);

	}

}
