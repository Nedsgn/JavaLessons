package testtttt;

import java.util.Scanner;

public class MoyenneScanner {

	public static void main(String[] args) {
		// on va demander à l'utilisateur de saisir la note en java,html,javaScript,Sql
		// donc 4 variables de type float
		// puis afficher la moyenne des 4 notes - 5e variable
		Scanner sc = new Scanner(System.in);

		System.out.println("veuillez entrer la note en java");

		float noteJava = sc.nextFloat();
		System.out.println("veuillez entrer la note en html");

		float noteHtml = sc.nextFloat();

		System.out.println("veuillez entrer la note en javascript");

		float noteJavaScript = sc.nextFloat();

		System.out.println("veuillez entrer la note en sql");

		float noteSql = sc.nextFloat();

		System.out.println("voici la moyenne de ces notes :");

		float moyenne = (noteJava + noteHtml + noteJavaScript + noteSql) / 4;

		System.out.println(moyenne);
	}

}
