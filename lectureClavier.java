package testtttt;

import java.util.Scanner; //il faut cliquer sur l'erreur du mot "sc" pour importer java util scanner

//import java.util.Scanner;

public class lectureClavier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tout debut, tape donc un truc");
		Scanner sc = new Scanner(System.in); // le type scanner permet de faire un tunnel entre mon apllication et mon
												// clavier. on bloque loperaztion et on attends qu'un utilisateur ecrive
												// quelque chose

		// on a cr�er l'objet sc qui va bloquer le traitement et va permettre d'�crire
		// sur la console

		sc.nextLine();// nextline sattende � ce qu'on �crive du texte, donc il bloque le traitement.
						// il attend donc qu'on �crive

		System.out.println("fin, bravo tu as tap� un truc , maintenant recommence...");

//le scanner permet d'interargir avec la console, on va choisir la valeur que l'on veut trouver au lieu de passer par trop de boucles

		System.out.println("Rebonjouur, voici le nouveau debut, tape un truc, �a sera une chaine de caractere");

		Scanner scc = new Scanner(System.in);// on affecte une valeur/ le tunnel, mais on l'as pas encore utilis�e
		String saisie = scc.nextLine();// on d�clare une variable Saisie--- pour l'utilser il faut appeler le
										// nextLine(); mais il faut absolument
										// utiliser le String avant pas le Int -- le nextLine bloque jusqu'� temps qu'on
										// saisi qqch dans la console. ce qqch sera inject�/affect� dans saisie
		System.out.println("vous avez saisi : " + saisie + ", maintenant, tapez un nombre : ");

		int cpt = scc.nextInt();// la il bloque le traitement et il attend qu'on met un nombre dans la console
		System.out.println("Traitement en cours... ( n'oubliez pas qu'il prends en compte le 0");

		for (int i = 0; i < cpt; i++) { /// et on fait une boucle jusqu'� cette saisie cpt Par exemple j'ai mi 50 dans
										/// la console, il me compte tous les chiffres jusque 50
			System.out.println(i);
		}
		System.out.println("Et voil� ! Bluffant non ?");

		Scanner scnr = new Scanner(System.in);// 1
		System.out.println("Ecrivez un nouveau nombre :");
		int nombre = scnr.nextInt();// la il bloque la siasi eet attends un nombre, puis il va affecter ce nombre l�
									// � la valeur nombre
		System.out.println("Puis un nombre d�cimal :");
		double d = scnr.nextDouble();
		if (nombre == 10) {// si je saisi 10 ... sinon
			System.out.println("Vous avez saisi 10 !");
		} else {
			System.out.println("le nombre que vous avez saisi n'est pas 10");

		}
	}

}
