package testtttt;

import java.util.Scanner;

public class ExoMacdo2 {

	public static void main(String[] args) {
		// Exo : faire une boucle pour qu'il me redemande de chosiir un menu si je met
		// un chiffre hors sujet
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue chez Mac Do, voici nos différents menus :");
		System.out.println("");
		System.out.println("1 : Big Mac");
		System.out.println("2 : Giant");
		System.out.println("3 : Cheese");
		System.out.println("4 : Enfant");
		System.out.println("");
		System.out.println("Veuillez choisir un nombre pour votre menu :");

		// int menuChoisi = sc.nextInt();
		// if (menuChoisi == 1) {
		// System.out.println("Vous avez choisi le menu Big Mac");
		// } else if (menuChoisi == 2) {
		// System.out.println("Vous avez choisi le menu Giant");
		// } else if (menuChoisi == 3) {
		// System.out.println("Vous avez choisi le menu Cheese");
		// } else if (menuChoisi == 4) {
		// System.out.println("Vous avez choisi le menu Enfant");
		// } else {
		// System.out.println("Ce menu n'existe pas");
		// }
		int menuChoisi = sc.nextInt();
		while (menuChoisi != 1 && menuChoisi != 2 && menuChoisi != 3 && menuChoisi != 4) {// si on a saisi ni 1,2,3 ou 4
																							// il rentre dans la boucle
																							// jusqu'a mettre un bon
																							// chiffre
			System.out.println("Bienvenue chez Mac Do, voici nos différents menus :");
			System.out.println("");
			System.out.println("1 : Big Mac");
			System.out.println("2 : Giant");
			System.out.println("3 : Cheese");
			System.out.println("4 : Enfant");
			System.out.println("");
			System.out.println("Veuillez choisir un nombre pour votre menu :");
			menuChoisi = sc.nextInt();// grave au nextint on repart au début de la boucle
		}

		if (menuChoisi == 1) {
			System.out.println("Vous avez choisi le menu Big Mac");
		} else if (menuChoisi == 2) {
			System.out.println("Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Vous avez choisi le menu Cheese");
		} else {
			System.out.println("Vous avez choisi le menu Enfant");
		}

	}
}
