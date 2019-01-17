package testtttt;

import java.util.Scanner;

public class ExoMailMaison {

	public static void main(String[] args) {
		// saisir 3 caracteres . 3 caracteres min puis @gmail.colm :
		// nom.prenom@gmail.com

		Scanner sc = new Scanner(System.in);

		String email = "";
		do {
			System.out.println("VEuillez saisir une adresse GMAIL : ");
			email = sc.nextLine();
		} while (!email.endsWith("@gmail.com") || email.length() < 13);// on met 13 : cest la taille maximale de la
																		// chaine de caractere. si elle fait moins de 13
																		// car , on rerfais la boucle
		// le ou est important sinon l'un des conditions serait passr cest a dire que si
		// on met gmail.com malgré qu'il y a pas au moins 13 caractere , ça aurait
		// marché quand meme
		System.out.println("Merci");

	}

}
