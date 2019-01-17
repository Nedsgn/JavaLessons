package testtttt;

import java.util.Scanner;

public class RectangleExoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RECTANGLE
		Scanner sc = new Scanner(System.in);

		System.out.print("Vous êtes prêts ?");

		String ii = sc.nextLine();

		System.out.println("Entrez une longueur");

		int longueur = sc.nextInt();

		System.out.println("Entrez une largeur");
		int largeur = sc.nextInt();

		int totalEtoiles = longueur * largeur;

		for (int i = 1; i <= totalEtoiles; i++) { // le i++ incrémente le précédent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % longueur == 0) {

				System.out.println();
			}
		}
	}

}
