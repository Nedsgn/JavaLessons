package testtttt;

import java.util.Scanner;

public class ExoMacDoBoucledoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int menuChoisi = 0;// il faut lui mettre une valeur, on l'a sorti de la boucle

		do { // je fais quelques chose tant que. il s'excuter au moins une fois
			System.out.println("Bienvenue chez Mac Do, voici nos différents menus :");

			System.out.println("");
			System.out.println("1 : Big Mac");
			System.out.println("2 : Giant");
			System.out.println("3 : Cheese");
			System.out.println("4 : Enfant");
			System.out.println("");
			System.out.println("Veuillez choisir un nombre pour votre menu :");

			menuChoisi = sc.nextInt();

		} while (menuChoisi != 1 && menuChoisi != 2 && menuChoisi != 3 && menuChoisi != 4);// si cette condition est
																							// vrai donc différent de...
																							// je REFAIS le DO

		if (menuChoisi == 1) {
			System.out.println("Vous avez choisi le menu Big Mac");
		} else if (menuChoisi == 2) {
			System.out.println("Vous avez choisi le menu Giant");
		} else if (menuChoisi == 3) {
			System.out.println("Vous avez choisi le menu Cheese");
		} else if (menuChoisi == 4) {
			System.out.println("Vous avez choisi le menu Enfant");
		}

	}

}
