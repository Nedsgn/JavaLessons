package testtttt;

import java.util.Scanner;

public class testdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String prenom = "";

		do {
			System.out.println("entrez votre prénom");
			prenom = sc.next();

		} while (prenom.length() < 2);
		System.out.println("Votre prénom est " + prenom);
	}

}
