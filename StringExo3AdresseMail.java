package testtttt;

import java.util.Scanner;

public class StringExo3AdresseMail {

	public static void main(String[] args) {
		// tant qu'il a pas une adresse gmail on lui demande de saisir une adresse gmail
		// Scanner sc = new Scanner(System.in);
		// String mail = "";
		// System.out.println("Veuillez saisir votre mail");

		// mail = sc.nextLine();

		// do {
		System.out.println("Entrez une adresse valide");
		// mail = sc.nextLine();// si on ne le met pas ça boucle car le traitement ne
		// s'arrete pas
		// } while (!mail.contains("gmail.com") || !mail.contains("@") ||
		// !mail.contains(".com"));
//
		// System.out.println("Merci");

		Scanner sc = new Scanner(System.in);

		String mail = "";

		do {
			System.out.println("entrez une adresse");
			mail = sc.nextLine();

			if (!mail.endsWith("@gmail.com")) {
				System.out.println("Veuillez saisir une adresse gmail");
			}
			if (mail.endsWith("@gmail.com")) {
				System.out.println("Merci");
			}
		} while (!mail.endsWith("@gmail.com"));

		// ou

		String email = "";
		do {
			System.out.println("VEuillez saisir une adresse GMAIL : ");
			email = sc.nextLine();
		} while (!email.endsWith("@gmail.com"));
		System.out.println("Merci");

	}

}
