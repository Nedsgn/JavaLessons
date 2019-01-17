package testtttt;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// ***La boucle do� while***

		// Puisque je viens de vous expliquer comment fonctionne une boucle while, je ne
		// vais pas vraiment m'attarder sur la boucle do� while. En effet, ces deux
		// boucles ne sont pas cousines, mais plut�t s�urs. Leur fonctionnement est
		// identique � deux d�tails pr�s.
// 
		// int nombre = 3;

		// do {
		// System.out.println(nombre + 5);

		// Instructions

		// } while (nombre < 5);

		// ***Premi�re diff�rence
		// La boucle do� while s'ex�cutera au moins une fois, contrairement � sa s�ur.
		// C'est-�-dire que la phase de test de la condition se fait � la fin, car la
		// condition se met apr�s le while.

		// ***Deuxi�me diff�rence
		// C'est une diff�rence de syntaxe, qui se situe apr�s la condition du while.
		// Vous voyez la diff�rence ? Oui ? Non ? Il y a un � ;� apr�s le while. C'est
		// tout ! Ne l'oubliez cependant pas, sinon le programme ne compilera pas.

		// Mis � part ces deux �l�ments, ces boucles fonctionnent exactement de la m�me
		// mani�re. D'ailleurs, refaisons notre programme pr�c�dent avec une boucle do�
		// while.

		String prenom = new String();
		// Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
		char reponse = ' ';

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Donnez un pr�nom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");

			do {
				System.out.println("Voulez-vous r�essayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');

		System.out.println("Au revoir�");

		// Vous voyez donc que ce code ressemble beaucoup � celui utilis� avec la boucle
		// while, mais il comporte une petite subtilit� : ici, plus besoin de
		// r�initialiser la variable reponse, puisque de toute mani�re, la boucle

		// s'ex�cutera au moins une fois !

		// do {
		// Traitement � r�peter comme un syso sans d�clarer de variable dedans
		// } while (condition); //le while se termine alors TOUJOURS par un point
		// virgule

		// alors que le while tout seul : while (condition) {
		// Traitements
		// }

	}

}
