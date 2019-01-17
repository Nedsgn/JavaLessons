package testtttt;

public class ExoProduitNombre {

	public static void main(String[] args) {
		// faire le produit de tous les nombres premiers

		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };

		int produit = 1;// si on met zero le resultat sera forcemment zero

		for (int i = 0; i < nombresPremiers.length; i++) {
			produit = produit * nombresPremiers[i];
		}

		System.out.println("Le produit du tableau est : " + produit);
	}

}
