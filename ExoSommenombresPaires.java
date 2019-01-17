package testtttt;

import java.util.Scanner;

public class ExoSommenombresPaires {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir un nombre 1");

		int nombre1 = sc.nextInt();

		System.out.println("veuillez saisir un nombre 2");

		int nombre2 = sc.nextInt();

		int somme = nombre1 + nombre2;

		for (int i = nombre1; i > nombre2; i++) {
			if (nombre1 % 2 == 0 && nombre2 % 2 == 0) {
				System.out.println(somme);
			} else {
				System.out.println("try again");
			}

		}
		System.out.println(somme);
	}

}
