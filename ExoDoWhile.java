package testtttt;

import java.util.Scanner;

public class ExoDoWhile {

	public static void main(String[] args) {
		// ****exo : mettre " saisir le nombre zero" tant qu'on a pas mi le nombre
		// zéro***

		Scanner sc = new Scanner(System.in);

		int nombre = 0;// si on met 12 par exemple ca va pas marcher et ca va boucler

		do {
			System.out.println("veuillez saisir le nombre zéro ou un");

			nombre = sc.nextInt();// il bloque le traitement puis la boucle pourra alors s'executer

		} while (nombre != 0 && nombre != 1);

		System.out.println("Vous avez saisi : " + nombre);
		System.out.println("fin");

		System.out.println("voulez vous recommencer ?");
	}

}
