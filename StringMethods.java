package testtttt;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String chaine = "bonjour";
		System.out.println("entrez quelqueschose");
		String uneAutreChaine = sc.next();// on met juste next parce que par defaut c'est une chaine de caractere
		// String chaine3 = "hello";

		if (chaine.contentEquals(uneAutreChaine)) {
			System.out.println("vous avez saisi 'bonjour'");
		} else {
			System.out.println("autre chose ?");
		}
		String chaine3 = sc.next();

		if (chaine3.contentEquals("hello")) {
			System.out.println("Ca va ?");
		}

		if (chaine.startsWith("bon")) {// starts -> commence par
			System.out.println("Oui et toi ?");
		}
		chaine3 = sc.next();

		if (chaine3.endsWith("lo")) {// termine par...
			System.out.println("Peut-être");
		}

		if (chaine.contains("on")) {
			System.out.println("La chaine contient 'on'!");
		}
		// afficher la taille d'une chaine de caractere
		System.out.println("la chaine contient " + chaine.length() + " caracteres");

		String sousChaineDelaFin = chaine.substring(2);

		System.out.println("La String Chaine, à partir du 5e caractere : " + "'" + sousChaineDelaFin + "'");

		String sousChaine = chaine.substring(3, 6);
		System.out.println("La String Chaine, qui commence du 3e au caractere au 6e : " + "'" + sousChaine + "'");

		String s = chaine.concat(" hello"); // concaténation . c'est équivalent au signe +

		System.out.println(s);

		String nom = "";
		// si on a une chaine de caractere qui est vide
		if (nom.isEmpty()) {
			nom = "Le nom est VIDE";
		}
		System.out.println(nom);

		String hash = chaine.replaceAll("bo", "cool");// on remplace bo par cool
		System.out.println(hash);

		// chaine.equals(uneAtreChaine)
		// chaine.startsWith(debu)
		// chaine.endsWith(fin)
		// chaine.contains(mot)
		// chaine.substring(3);
		// chaine.substring(3, 7);
		// chaine.concat("hello");
		// Comparaison

		// EQ
		// chaine1.equals(chaine2)

		// NOT EQ
		// !chaine1.equals(chaine2)

		// mettre en MAJ
		// chaine.toUpperCase()
		// chaine.toLowerCase

		// Supprimer les espaces avant et après
		// chaine.trim()
	}

}
