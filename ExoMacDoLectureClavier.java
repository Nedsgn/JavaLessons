package testtttt;

import java.util.Scanner;

public class ExoMacDoLectureClavier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue chez Mac Do, voici nos différents menus :");
		System.out.println("");
		System.out.println("1 : Big Mac");
		System.out.println("2 : Giant");
		System.out.println("3 : Cheese");
		System.out.println("4 : Enfant");
		System.out.println("");
		System.out.println("Veuillez choisir un nombre pour votre menu :");

		int menuChoisi = sc.nextInt();
		if (menuChoisi == 1) {
			System.out.println("Vous avez choisi le menu Big Mac");
		} else if (menuChoisi == 2) {
			System.out.println("Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Vous avez choisi le menu Cheese");
		} else if (menuChoisi == 4) {
			System.out.println("Vous avez choisi le menu Enfant");
		} else {
			System.out.println("Ce menu n'existe pas");
		}
		System.out.println("");
		System.out.println("Veuillez confirmer votre choix :");

		menuChoisi = sc.nextInt();

		if (menuChoisi == 1) {
			System.out.println("Confirmé : Vous avez choisi le menu Big Mac");
		} else if (menuChoisi == 2) {
			System.out.println(" Confirmé : Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Confirmé : Vous avez choisi le menu Cheese");
		} else if (menuChoisi == 4) {
			System.out.println("Confirmé : Vous avez choisi le menu Enfant");

		} else {
			System.out.println("Ce menu n'existe pas");
		}

		// on est pas obligé de ferme le scnaner sinon c'est sc.close();
	}

}
