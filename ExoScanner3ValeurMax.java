package testtttt;

import java.util.Scanner;

public class ExoScanner3ValeurMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. Demander à l'utilisateur de saisir le nombre1
		// 2. Demander à l'utilisateur de saisir le nombre2
		// 3. Demander à l'utilisateur de saisir le nombre3
		// 6. Afficher le nombre le plus grand

		int max = Integer.MIN_VALUE;

		System.out.println("Saisissez le nombre 1");

		int nombre1 = sc.nextInt();

		if (nombre1 > max) {
			max = nombre1;

		}

		System.out.println("Saisissez le nombre 2");// est ce que nombre 1 est sup à la valeur max je lui dit que la
		// valeur mmax est égale au 'nombre1'

		int nombre2 = sc.nextInt();// la on affecte une valeur dans le nombre2

		if (nombre2 > max) {
			max = nombre2;
		}

		System.out.println("Saisissez le nombre 3");// est ce que nbre 1 est inf à la valeur max je lui dit que la
		// valeur max est égale au 'nombre1'
		int nombre3 = sc.nextInt();
		if (nombre3 > max) {
			max = nombre3;
		}
		System.out.println(max + " est le nombre le plus grand");

		// OU
		System.out.println("");
		//

		System.out.println("Saisissez le nombre 1");
		float nbr1 = sc.nextFloat();

		System.out.println("Saisissez le nombre 2");
		float nbr2 = sc.nextFloat();

		System.out.println("saisissez le nombre 3");
		float nbr3 = sc.nextFloat();

		if (nbr1 > nbr2 && nbr1 > nbr3) {
			System.out.println(nbr1 + " est plus le plus grand");
		}

		if (nbr2 > nbr1 && nbr2 > nbr3) {
			System.out.println(nbr2 + " est plus le plus grand");
		}

		if (nbr3 > nbr2 && nbr3 > nbr1) {
			System.out.println(nbr3 + " est plus le plus grand");
		}
	}
}
