package testtttt;

public class StringExo {

	public static void main(String[] args) {

		String chaine = "hello";

		String nom = "Jack";

		String chaineEtNom = chaine + nom;// dans les chaines de caractere on a que le + qu'on peut utiliser

		System.out.println(chaineEtNom);
		// if (chaine == nom) {ne JAMAIS le mettre pour une chaine de caractere. le ==
		// compare l'adresse memoire ! il faut donc mettre :
		if (chaine.contentEquals(nom)) {
			System.out.println("les deux chaines sont identiques");
		}
		String chaineMaj = chaine.toUpperCase();
		System.out.println(chaineMaj);

		String nomMin = nom.toLowerCase();
		System.out.println(nomMin);

		System.out.println("Nom : " + nom);

		nom = "Jhon";

		System.out.println("Nouveau nom : " + nom);

		if (!nom.contentEquals(chaine)) {// le point d'exlcamation veut dire contraire de. Ici :si nom est diff�rent de
											// chaine
			System.out.println("cool");
		}

		chaine = "                  bonjour             ";// on fait expres de mettre des espaces AVANT et APRES
		System.out.println(chaine);

		String s = chaine.trim();// .trim supprime tous les epsaces � gauche et � droite . Par exmple quand on
									// veut rentrer un mail ds un formulaire, si ya un espace ce n'est pas grave car
									// par pris en compte avec trim
		System.out.println(s);

		// RECAP:

		// comparaison:
		// EQ
		// chaine1.equals(chaine2)
		// NOT EQ
		// !chaine1.equals(chaine2)

		// mettre en MAJ:
		// chaine.toUpperCase()
		// chaine.toLowerCase

		// Supprimer les espaces avant et apr�s:
		// chaine.trim();
	}

}
