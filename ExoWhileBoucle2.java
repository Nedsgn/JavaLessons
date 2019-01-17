package testtttt;

public class ExoWhileBoucle2 {

	public static void main(String[] args) {
		// afficher les numeros 2,4,6,8 int compteure = 0;

		int compteure = 0;

		while (compteure <= 10) {
			if (compteure == 0) {
				System.out.println(compteure);
				compteure++;
			} else if (compteure == 2) {
				System.out.println(compteure);
				compteure++;
			} else if (compteure == 4) {
				System.out.println(compteure);
				compteure++;
			} else if (compteure == 6) {
				System.out.println(compteure);
				compteure++;
			} else if (compteure == 8) {
				System.out.println(compteure);
				compteure++;
			} else if (compteure == 10) {
				System.out.println(compteure);
				compteure++;
			} else {

				compteure++;
			}
		}

		// ou

		int cpt4 = 0;
		while (cpt4 <= 10) {
			if (cpt4 == 0) {
				System.out.println(cpt4);
			} else if (cpt4 == 2) {
				System.out.println(cpt4);
			} else if (cpt4 == 4) {
				System.out.println(cpt4);
			} else if (cpt4 == 6) {
				System.out.println(cpt4);
			} else if (cpt4 == 8) {
				System.out.println(cpt4);
			} else if (cpt4 == 10) {
				System.out.println(cpt4);
			}
			cpt4++;
		}

//ou

		int cpt7 = 0;
		while (cpt7 <= 5) {
			System.out.println(cpt7 * 2);
			cpt7++;
		}

		// ou

		int cptp = 0;
		while (cptp <= 10) {
			System.out.println(cptp);
			cptp = cptp + 2;
		}

		// ou

		int compteur1 = 0;
		while (compteur1 <= 10) {
			if (compteur1 == 0 || compteur1 == 2 || compteur1 == 4 || compteur1 == 6 || compteur1 == 8
					|| compteur1 == 10) {
				System.out.println(compteur1);
			}
			compteur1++;
		}

		// ou - dans l'odre inverse avec des espaces vides

		int cpt3 = 0;
		while (cpt3 <= 10) {
			if (cpt3 == 1) {
				System.out.println(" ");
			} else if (cpt3 == 3) {
				System.out.println(" ");
			} else if (cpt3 == 5) {
				System.out.println(" ");
			} else if (cpt3 == 7) {
				System.out.println(" ");
			} else if (cpt3 == 9)
				System.out.println(" ");
			else {
				System.out.println(cpt3);
			}
			cpt3++;
		}

		// ou avec le modulo - c'est pour chercher des multiples

		int compteur = 0;
		while (compteur <= 10) {
			if (compteur % 2 == 0) {
				System.out.println(compteur);
			}
			compteur++;
		}
//on fait un traitement et ensuite on verifie. do while le traitement est fait entre 1 et l'infini
		int compt = 13;
		do {
			if (compt % 7 != 0)
				System.out.println(compt + " n'est pas multiple de 7");
			compt++;
		} while (compteur <= 10);

//ici ca ne passe pas car 13 est plus grand que 10
		int i = 13;
		while (i <= 10) {
			if (i % 7 != 0) {
				System.out.println("nest pas multiple ");
			}
			i++;
		}

	}

}
