package testtttt;

import java.util.Scanner;

public class ExoRechercheTableauFormation {
	public static void main(String[] args) {
		// si notre tableau contient laurent afficher laurent existe sinon dire quile st
		// pas la

		Scanner sc = new Scanner(System.in);
		while (1 == 1) {// ou while (true)
			String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
					"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

			System.out.println("----------------------------------------------------------------------------------");

			boolean existe = false;// de base la variable est fausse

			for (int i = 0; i < prenoms.length; i++) {

				if (prenoms[i].contentEquals("Laurent")) {
					existe = true;
				}
			}
			if (existe == true) {// le seul moyen pour que existe vale true(donc est vraie) c'est qu'il soit
									// rentré dans la boucle

				// le boolean n'existe pas jusqu'à ce qu'il prouve/trouve qu'il existe
				System.out.println("laurent existe dans le tableau");
			} else {
				System.out.println("laurent n'existe pas");
			}

			// autree explle

			System.out.println("Veuillez saisir un  prénom svp:");
			String prenomRech = sc.nextLine();

			for (int i = 0; i < prenoms.length; i++) {
				if (prenoms[i].equals(prenomRech)) {
					existe = true;
				}
			}
			if (existe == true) {
				System.out.println(prenomRech + " existe dans la liste des prénoms");
			} else {
				System.out.println(prenomRech + " n'existe pas dans la liste des prénoms");
			}

			// pour tout repeter
		}

	}
}
