package testtttt;

import java.util.Scanner;

public class CalculatriceAvecNewMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String operation = "";

		int resultat = 0;

		System.out.println("Veuillez saisir un nombre 1: ");
		// lecture clavier et affectationd e la valeur à la variable nombre1

		int nombre111 = sc.nextInt();

		// String operation = "";

		do {
			System.out.println("Veuillez choisir l'opération: ");
			// lecture clavier et affectation de la valeur à la variable operation
			operation = sc.next();
		} while (!operation.equals("+") && !operation.equals("*") && !operation.equals("/") && !operation.equals("-")
				&& !operation.equals("%"));

		System.out.println("Veuillez saisir un nombre 2: ");
		int nombre222 = sc.nextInt();
		// lecture clavier et affectation de la valeur à la variable nombre

		// int resultat = 0;
		if (operation.equals("+")) {
			resultat = addition(nombre111, nombre222);// on utilise la methode du dessous
		} else if (operation.equals("-")) {
			resultat = soustraction(nombre111, nombre222);
		} else if (operation.equals("*")) {
			resultat = multiplication(nombre111, nombre222);
		} else if (operation.equals("/")) {
			resultat = division(nombre111, nombre222);
		} else if (operation.equals("%")) {
			resultat = modulo(nombre111, nombre222);
		}

		System.out.println("résultat: " + nombre111 + " " + operation + " " + nombre222 + " = " + resultat);
	}

//add
	public static int addition(int nombre1, int nombre2) {// si on veut rajouter des conditions on les mettra ici plutot
															// que de toucher à lalgo du dessus
		int resultat = nombre1 + nombre2;
		return resultat;
	}

	// sous
	public static int soustraction(int nombre1, int nombre2) {
		int resultat = nombre1 - nombre2;
		return resultat;
	}

	public static int multiplication(int nombre1, int nombre2) {
		int resultat = nombre1 * nombre2;
		return resultat;
	}

	public static int division(int nombre1, int nombre2) {
		int resultat = nombre1 / nombre2;
		return resultat;
	}

	public static int modulo(int nombre1, int nombre2) {
		int resultat = nombre1 % nombre2;
		return resultat;
	}
}
