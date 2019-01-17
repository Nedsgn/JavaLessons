package testtttt;

import java.util.Scanner;

public class RechercheTableauNewmethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

		System.out.println("Veuillez saisir un  prénom svp:");

		String prenomRech = sc.nextLine();

		rechercherNomDansTableau(prenomRech, prenoms);// la saisie et le nom du tableau

	}

	public static void rechercherNomDansTableau(String nom, String[] prenoms) {// le nom et le nom du tableau

		boolean existe = false;// de base la variable est fausse

		for (int i = 0; i < prenoms.length; i++) {

			if (prenoms[i].Equals(nom)) {
				existe = true;
			}
		}
		if (existe == true) {// le seul moyen pour que existe vale true(donc est vraie) c'est qu'il soit
								// rentré dans la boucle

			// le boolean n'existe pas jusqu'à ce qu'il prouve/trouve qu'il existe
			System.out.println(nom + "existe dans le tableau");
		} else {
			System.out.println(nom + "n'existe pas");
		}
	}
}
