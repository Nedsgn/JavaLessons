package testtttt;

public class ExoBoucle1WhileIfAfficherNombre {

	public static void main(String[] args) {
		// **** afficher tous les nombres de 1 à 100 ****
		int cpt = 1;
		while (cpt <= 100) {
			System.out.println(cpt);
			cpt++;
		}

		// **** afficher tous les nombres de 50 jusqu'à 10 ****

		int cptr = 50;
		while (cptr >= 10) {
			System.out.println("yo " + cptr);
			cptr--;
		}

		int compteur = 25;// tant que c inf a 100 je v faire un traitement : une declaration, des
							// boucles...

		// while (compteur <= 100) // est ce que 1 est = 100 : oui donc il rentre dans
		// if puios else if et finti
		// par else si rien n'est égal
		// {
		// if (compteur == 25) {
		// System.out.println("Bravo c'est 25 !");
		// compteur++;
		// } else if (compteur == 50) {
		// System.out.println("bravo cest 50");
		// compteur++;
		// } else if (compteur == 45) {
		// System.out.println("bravo cest 45");
		// compteur++;
		// } else {
		// System.out.println("compteur");
		// compteur++;
		// }
		// }

		// ou

		while (compteur <= 100) {
			if (compteur == 25) {
				System.out.println("Bravo c'est 25 !");

			} else if (compteur == 50) {
				System.out.println("bravo cest 50");

			} else if (compteur == 45) {
				System.out.println("bravo cest 45");

			} else {

			}
			compteur++;
		}

		// if (compteur == 25) {
		// }System.out.println("Bravo c'est 25 !");
		// }else if(compteur == 50) {
		// System.out.println("bravo cest 50");
		// compteur++; <---- là il va bloquer à 6 car la boucle ne passe nullepart
		// d'autre
		// }else if(compteur == 45) {
		// System.out.println("bravo cest 45");
		// }else {System.out.println("compteur");
		// }

		// }

		// }

	}
}