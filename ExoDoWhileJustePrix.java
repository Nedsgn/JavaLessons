package testtttt;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExoDoWhileJustePrix {

	public static void main(String[] args) {
		// exo: Le juste prix : 3 chances de gagner . faire en sorte qu'il nous
		// repropose de jouer si on a perdu

		Scanner sc = new Scanner(System.in);

		// double prix = 120;
		int prix = ThreadLocalRandom.current().nextInt(0, 10);// on utilise �a pour g�n�rer un nombre al�atoire . le
																// local random est a utiliser que la avec le INT. on
																// peut remarquer entre les parenth�ses les deux nombres
		int prixChoisi = 0;// IMPORTANT il faut d�clarer la variable avec un nombre au debut puis apr�s
							// l'inclure dans le do
		// double prixChoisi = sc.nextDouble();

		do {
			System.out.println("Veuillez saisir un nombre");
			prixChoisi = sc.nextInt();

			if (prixChoisi == prix) {
				System.out.println("Gagn� !");
			} else if (prixChoisi > prix) {
				System.out.println("Perdu, c'est moins !");
			} else {
				System.out.println("perdu c'est plus");
			}
		} while (prixChoisi != prix);

	}

}
