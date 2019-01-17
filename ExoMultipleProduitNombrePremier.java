package testtttt;

public class ExoMultipleProduitNombrePremier {

	public static void main(String[] args) {
		// trouver le produit des multiples de 5
		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };

		int produit = 1;// si on met zero le resultat sera forcemment zero

		for (int i = 0; i < nombresPremiers.length; i++) {
			if (nombresPremiers[i] % 5 == 0) {// c'est le contenu qui doit etre multiple de 5 et non le tableau, il faut
												// donc rajouter [i]
				produit = produit * nombresPremiers[i];
			}
		}

		System.out.println("Le produit du tableau est : " + produit);

		// ou
		//

		for (int i = 0; i < nombresPremiers.length; i++) {

			int valPlus1 = nombresPremiers[i] + 1;

			if (valPlus1 % 5 == 0) {
				produit = (produit * nombresPremiers[i]);

			}

		}
		System.out.println("le produit plus 1 : " + produit);

		// ou

		for (int i = 0; i < nombresPremiers.length; i++) {

			if (nombresPremiers[i] + 1 % 5 == 0) {
				produit = (produit * nombresPremiers[i]);

			}

		}
		System.out.println(produit);
	}

}
