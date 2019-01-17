package testtttt;

import java.util.Scanner;

public class ExoSommeNombresPairess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir un nombre 1");

		int nombre1 = sc.nextInt();

		System.out.println("veuillez saisir un nombre 2");

		int nombre2 = sc.nextInt();

		int res = AfficherSommeNombresPaires(nombre1, nombre2);

		System.out.println(res);
	}

	public static int AfficherSommeNombresPaires(int nb1, int nb2) {
		int somme = 0;

		for (int i = nb1; i <= nb2; i++) {// for (int i = debut, i<=fin

			if (i % 2 == 0) {
				somme = somme + i;
			}
		}
		return somme;
	}
}
