package testtttt;

public class Variable {

	public static void main(String[] args) {
		// <type_de_la_variable> <nom_de_la_variable> = <valeur>; Une variable contient
		// toujours un type (string...), dans chaque main on peut d�clarer une variable
		// qu'une seule fois

		// d�claration
		// <type_de_la_variable> <nom_de_la_variable>; je d�clare la variable d'un type

		// affectation
		// <nom_de_la_variable> = <valeur>;

		// exemple de d�claration:
		String nom; // c'est de type string , donc chaine de caractere , il donc toujours utiliser
					// les "" et ne pas oublier la majuscule

		// Premi�re m�thode de d�claration
		// String phrase;
		// phrase = "Titi et Grosminet";

		// Deuxi�me m�thode de d�claration
		// String str = new String();
		// str = "Une autre cha�ne de caract�res";

		// Troisi�me m�thode de d�claration
		// String string = "Une autre cha�ne";

		// Quatri�me m�thode de d�claration
		// String chaine = new String("Et une de plus !");

		// avec l'affectation (valeur de la variable)
		nom = "jack";
		System.out.println(nom);

		// d�claration+affectation
		String prenom = "jo";

		System.out.println(nom);
		System.out.println(prenom);

		// Afficher -> nom prenom : concat�nation
		System.out.println(nom + prenom);// il n'y a pas d'espace donc mettre :
		System.out.println(nom + " " + prenom + ".");

		// string <nom_variable> = <valeur>; On peut r�affecter � souhait une valeur
		nom = "Jhon";

		System.out.println(nom);

		nom = "un autre nom";
		System.out.println(nom);

		// short -32 768 => 32 767

		short nombrePetit; // met pas d'espaces mais des underscores en sql, en java on met une majuscule,
							// par exemple : short nombrePetitpourNousLesHumains
//affectation*
		nombrePetit = 12;

		System.out.println(nombrePetit);
		System.out.println(nombrePetit + 14);

		String nombrePetitEnString = "12";

		System.out.println(nombrePetit);
		System.out.println(nombrePetit + 14);

		// int -2 147 483 648 => 2 147 483 647
		int nombreGrand = 145;

		System.out.println(nombreGrand * 12);

		nombreGrand = 125896;

		System.out.println(nombreGrand / 2);

		System.out.println(nombreGrand - 10000);

		// long -9 223 372 036 854 775 808 => 9 223 372 036 854 775 807

		long nombreTropGrand = 123456789;

		System.out.println(nombreTropGrand + nombreGrand);

		long extraGrand = 578_123;

		System.out.println(extraGrand + nombreGrand);

		long coordonneeSpace = 120_123_120_120l;

		System.out.println(coordonneeSpace);

		// double type pour les nombres d�cimaux/� virgule qui contient des nombres de
		// 4.9406564584124654E-324 => 1.797693134862316E308
		// Le typedouble(8 octets) est identique � float, si ce n'est qu'il contient
		// plus
		// de chiffres derri�re la virgule et qu'il n'a pas de suffixe.

		double tva = 20.0;

		System.out.println(tva * 20);

		// float -1.40239846E-45 => 3.40282347E38

		float taxe = 33.5f;// on est oblig� de rajouter le F pour pr�ciser qu'on travaille avec du float
		// Vous remarquerez que nous ne mettons pas une virgule, mais un point ! Et vous
		// remarquerez aussi que m�me si le nombre en question est rond, on �crit � .0 �
		// derri�re celui-ci, le tout suivi de � f �.

		System.out.println(15 / taxe);

		int prix = 100;

		// afficher la tva * prix = valeur
		// 20.0 * 100 = 200.0

		System.out.println(tva + " * " + prix + " = ");// la il va juste concat�ner il ny a pas de calcul

		// l� je veux qu'il fasse le calcul : tva c'est un double multipli� par un
		// entier
		System.out.println(tva * prix);

		// un nombre + une chaine de caractere = chaine de caractere / nombre + nombre :
		// op�ration math�matique - une double + un entier = un double

		// la r�ponse est donc :
		System.out.println(tva + " * " + prix + " = " + (tva * prix));

		short longueur = 32000;
		short largeur = 1000;
		System.out.println("l * L = " + (longueur * largeur));
		System.out.println(largeur + longueur);
		System.out.println(longueur / largeur);

		System.out.println(longueur * tva);
		System.out.println(longueur * prix);

		int entier1 = 10;
		int entier2 = 3;
		double d1 = 3.0;
		System.out.println(entier1 / entier2); // malgr� que le r�sultat est cens� etre un double , donc � virgule, il
												// nous affiche un entier (3) car nous avons utilis� un entier + un
												// entier

		System.out.println(entier1 / d1); // ici on a un double

		float f1 = 3f;
		System.out.println(entier1 / f1); // ici on a un float donc ce n'est pas vraiment pareil pck le double c'est
											// plus puissant (puissance 300)

		int a = 2;
		int b = 10;
		int c = 10;

		// System.out.println(c / (a / b));//l� on nous retourne une erreur : il
		// s'attendait � avoir un entier, il faut vraiment savoir ce qu'on veut si c'est
		// une divion, multiplication d�s le depart zsinon le projet plante

		// Affectation

		int somme = 1;
		somme = 2;
		System.out.println(somme);
		// on peut lui affecter le r�sultat d'un calcul
		somme = 12 + 10; // il va dabord r�soudre � droite du �gal : 12 + 10 = 22 et ensuite je vais
							// affecter le 22 dans somme
		System.out.println(somme);

		// plus on avance plus la valeur change. ici somme vaut 22
		somme = somme + 10; // tu prends somme tu lui rajoute 10 et tu l'affectes � somme, jobtiens 32 et
							// c'est cette valeur que j'ajoute � somme
		System.out.println(somme);

		somme = somme - 5; // il enleve 5 � somme et il affecte la nouvelle valeur � somme
		System.out.println(somme); // d�sormais somme vaut 27

		// char veut dire qu'il yauraz qu'un seul caractere

		// char c = "f";// pour lui c'est une chaine de caractere et il faut absolument
		// mettre des
		// simples quotes
		String s = "fille";

		// comparaison

		boolean vrai = true;
		boolean faux = false;

		boolean bool = (somme == 27 && somme != 98);
		System.out.println("La variable boolean b = " + bool);// afficher ce que contient bool
	}

}
