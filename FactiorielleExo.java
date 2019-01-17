package testtttt;

import java.util.Scanner;

public class FactiorielleExo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez saisir un nombre");

		int nombre = sc.nextInt();

		int res = AfficherFactorielle(nombre);

		System.out.println("Factorielle : " + res);

	}

	public static int AfficherFactorielle(int n) {// je donne le nombre à ma fonction et elle renvoie son resultat
		int produit = 1; // qui est dans nombre
		for (int i = n; i > 0; i--) {// tant que i donc 5 est plus grand que 0 je tourne
			produit = (produit * i);
		}

		return produit;
	}
}
//voir le cours ecrit