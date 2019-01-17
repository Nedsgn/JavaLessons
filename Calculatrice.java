package testtttt;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String operation = "";

		System.out.println("Veuillez saisir un nombre 1");
		double nombre1 = sc.nextDouble();

		do {
			System.out.println("Veuillez saisir l'opération");
			operation = sc.next();
		}

		while (!operation.contentEquals("+") && !operation.contentEquals("*") && !operation.contentEquals("-")
				&& !operation.contentEquals("/") && !operation.contentEquals("%"));//

		System.out.println("Veuillez saisir un nombre 2");
		double nombre2 = sc.nextDouble();

		if (operation.equals("+")) {// on met .equals parce que operation est une chaine de caracteres
			System.out.println(nombre1 + nombre2);

		} else if (operation.equals("-")) {
			System.out.println("resultat : " + (nombre1 - nombre2));
		} else if (operation.equals("*")) {
			System.out.println("resultat : " + nombre1 * nombre2);
		} else if (operation.equals("/")) {
			System.out.println("resultat : " + nombre1 / nombre2);
		} else if (operation.contentEquals("%")) {
			System.out.println("resultat : " + nombre1 % nombre2);
		}
		// ou

		int resultat = 0;

		System.out.println("Veuillez saisir un  nombre 1:");
		int nombre11 = sc.nextInt();

		System.out.println("Veuillez choisir l'operation:");
		String TypeOperation = sc.next();

		System.out.println("Veuillez saisir un  nombre 2:");
		int nombre22 = sc.nextInt();

		switch (TypeOperation) {

		case "/":
			resultat = nombre11 / nombre22;

			break;
		case "*":
			resultat = nombre11 * nombre22;
			break;
		case "+":
			resultat = nombre11 + nombre22;
			break;
		case "-":
			resultat = nombre11 - nombre22;
			break;

		}
		System.out.println("le résultat de " + nombre11 + " " + TypeOperation + " " + nombre22 + " = " + resultat);

		// ou

		System.out.println("Veuillez saisir un nombre 1: ");
		// lecture clavier et affectationd e la valeur à la variable nombre1

		int nombre111 = sc.nextInt();

		// String operation = "";

		do {
			System.out.println("Veuillez choisir l'opération: ");
			// lecture clavier et affectation de la valeur à la variable operation
			operation = sc.next();
		} while (!operation.equals("+") && !operation.equals("*") && !operation.equals("/") && !operation.equals("-"));

		System.out.println("Veuillez saisir un nombre 2: ");
		int nombre222 = sc.nextInt();
		// lecture clavier et affectation de la valeur à la variable nombre

		// int resultat = 0;
		if (operation.equals("+")) {
			resultat = nombre111 + nombre222;
		} else if (operation.equals("-")) {
			resultat = nombre111 - nombre222;
		} else if (operation.equals("*")) {
			resultat = nombre111 * nombre222;
		} else if (operation.equals("/")) {
			resultat = nombre111 / nombre222;
		}

		System.out.println("résultat: " + nombre111 + " " + operation + " " + nombre222 + " = " + resultat);
	}
}
