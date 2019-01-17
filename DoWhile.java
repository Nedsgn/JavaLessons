package testtttt;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// ***La boucle do… while***

		// Puisque je viens de vous expliquer comment fonctionne une boucle while, je ne
		// vais pas vraiment m'attarder sur la boucle do… while. En effet, ces deux
		// boucles ne sont pas cousines, mais plutôt sœurs. Leur fonctionnement est
		// identique à deux détails près.
// 
		// int nombre = 3;

		// do {
		// System.out.println(nombre + 5);

		// Instructions

		// } while (nombre < 5);

		// ***Première différence
		// La boucle do… while s'exécutera au moins une fois, contrairement à sa sœur.
		// C'est-à-dire que la phase de test de la condition se fait à la fin, car la
		// condition se met après le while.

		// ***Deuxième différence
		// C'est une différence de syntaxe, qui se situe après la condition du while.
		// Vous voyez la différence ? Oui ? Non ? Il y a un « ;» après le while. C'est
		// tout ! Ne l'oubliez cependant pas, sinon le programme ne compilera pas.

		// Mis à part ces deux éléments, ces boucles fonctionnent exactement de la même
		// manière. D'ailleurs, refaisons notre programme précédent avec une boucle do…
		// while.

		String prenom = new String();
		// Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
		char reponse = ' ';

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");

			do {
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');

		System.out.println("Au revoir…");

		// Vous voyez donc que ce code ressemble beaucoup à celui utilisé avec la boucle
		// while, mais il comporte une petite subtilité : ici, plus besoin de
		// réinitialiser la variable reponse, puisque de toute manière, la boucle

		// s'exécutera au moins une fois !

		// do {
		// Traitement à répeter comme un syso sans déclarer de variable dedans
		// } while (condition); //le while se termine alors TOUJOURS par un point
		// virgule

		// alors que le while tout seul : while (condition) {
		// Traitements
		// }

	}

}
