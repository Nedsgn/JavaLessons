package testtttt;

import java.util.Scanner;

public class ExoScanner2MesureAireRectangle {

	public static void main(String[] args) {
		// 1.Demander à l'utilisateur de saisir la longueur du rectangle
		// 2. Demander à l'utilisateur de saisir la largeur
		// 3. Afficher L'aire du rectangle
//faire deux variable longeur et largeur

		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir la longueur du rectangle : ");

		float longueur = sc.nextFloat();

		System.out.println("Saisir la largeur du rectangle : ");

		float largeur = sc.nextFloat();

		float aire = largeur * longueur;

		System.out.println("Voici l'aire du rectangle : " + aire);
	}

}
