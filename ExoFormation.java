package testtttt;

public class ExoFormation {

	public static void main(String[] args) {

		String[] prenoms = { "Miloud", "Agn�s", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

		// Afficher tous les pr�noms
		for (int i = 0; i < prenoms.length; i++) {
			System.out.println(prenoms[i]);
		}
		// AFFICHER LE Message laurent existe dans la liste si c'est le cas

		// 1.parcourir mon tableau
		// 2.si une des valeurs ='laurent'
		// Afficher => Laurent existe dans la liste
		System.out.println("----------------------------------------------------------------------------------");

		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].contentEquals("Laurence")) {
				System.out.println("Laurence existe dans le tableau");
			}
		}

		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].startsWith("L")) {

				System.out.println("prenoms qui commencent par L :" + prenoms[i]);// il faut absolument le mettre apr�s
																					// la
			}

		} // fin boucle
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Prenoms qui Fini par E :");
		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].endsWith("e")) {

				System.out.println(prenoms[i]);// il faut absolument le mettre apr�s
												// la
			}

		} // fin boucle

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Prenom qui contient pas de a:");
		for (int i = 0; i < prenoms.length; i++) {
			if (!prenoms[i].contains("a") && !prenoms[i].contains("A")) {

				System.out.println(prenoms[i]);// il faut absolument le mettre apr�s
												// la
			}

		} // fin boucle

		// ou pour prenomqui contient pas de a

		for (int i = 0; i < prenoms.length; i++) {
			if (!prenoms[i].contains("a")) {
				if (!prenoms[i].contains("A"))
					System.out.println(prenoms[i]);

			}
		}
		// ou

		for (int i = 0; i < prenoms.length; i++) {
			String nomM = prenoms[i].toLowerCase();// il prends le pr�nom et le met directement en minuscule
			if (!nomM.contains("a")) {
				System.out.println(prenoms[i]);
			}

		}

		// afficher tous les prenoms qui se terminent par e et on va afficher uniquement
		// les 3 premi�res lettres
		System.out.println("----------------------------------------------------------------------------------");

		for (int i = 0; i < prenoms.length; i++) {
			// String nom = prenoms[i].substring(3);
			if (prenoms[i].endsWith("e")) {
				System.out.println(prenoms[i].substring(0, 3)); // affiche l'indice du tableau point les trois premiere
																// lettre c'est � dire de 0 � 3 exclus

			}

		}
		// afficher les 4 derniere lettre des prenoms qui contiennent un e
		for (int i = 0; i < prenoms.length; i++) {
			int tailleChaine = prenoms[i].length();
			if (prenoms[i].endsWith("e")) {
				System.out.println(prenoms[i].substring(tailleChaine - 4));
			}
		}
	}

}
