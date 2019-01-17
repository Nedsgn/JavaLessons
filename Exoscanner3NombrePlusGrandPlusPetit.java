package testtttt;

import java.util.Scanner;

public class Exoscanner3NombrePlusGrandPlusPetit {

	public static void main(String[] args) {
		// 1. Demander à l'utilisateur de saisir le nombre1
		// 2. Demander à l'utilisateur de saisir le nombre2
		// 3. Demander à l'utilisateur de saisir le nombre3
		// 6. Afficher le nombre le plus petit

		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez le nombre 1");

		int nbr1 = sc.nextInt();

		System.out.println("Saisissez le nombre 2");

		int nbr2 = sc.nextInt();

		System.out.println("Saisissez le nombre 3");

		int nbr3 = sc.nextInt();

		if (nbr1 < nbr2 && nbr1 < nbr3) {
			System.out.println(nbr1 + " est le plus petit");
		} else if (nbr2 < nbr1 && nbr2 < nbr3) {
			System.out.println(nbr2 + " est le chiffre le plus petit");
		} else {
			System.out.println(nbr3 + " est le chiffre le plus petit");
		}
//ou

		// faire 3 variables aavec des float min et nombre1. et à chaque fois que
		// l'utilisateur saisi une valeur, elle sera comparée à min

		float min = Float.MAX_VALUE;// float min = 1_000_000;// valeur de départ de min

		// int min = Integer.MAX_VALUE; cette methode permet de ne pas taper la
		// valeur maximale. Ne pas oublier que le Integer est avec une majuscule

		System.out.println("Saisissez le nombre 1");// est ce que nbre 1 est inf à la valeur min je lui dit que la
													// valeur min est égale au 'nombre1'
		float nombre1 = sc.nextFloat();

		if (nombre1 < min) {
			min = nombre1;// ici le min prends la valeur du nombr1 donc si on écrit 10, le min vaudra 10
		}
		System.out.println("Saisissez le nombre 2");// est ce que nbre 1 est inf à la valeur min je lui dit que la
													// valeur min est égale au 'nombre1'
		float nombre2 = sc.nextFloat();// lma on affecte une valeur dans le nombre2
		if (nombre2 < min) {
			min = nombre2;
		}

		System.out.println("Saisissez le nombre 3");// est ce que nbre 1 est inf à la valeur min je lui dit que la
													// valeur min est égale au 'nombre1'
		float nombre3 = sc.nextFloat();
		if (nombre3 < min) {
			min = nombre3;
		}
		System.out.println(min + " est le nombre le plus petit");

	}

}
