package testtttt;

import java.util.Scanner;

public class CarreeExo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Vous �tes pr�ts ?");

		String ii = sc.nextLine();

		for (int i = 1; i <= 32; i++) { // le i++ incr�mente le pr�c�dent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 4 == 0) {// multiple de 5

				System.out.println();
			}
			// ca fait un carr� d'�toiles
			// System.out.println();
			// System.out.println(""); c'est pareil que le println
		}
//***faire un carr� de 10/10****
		System.out.print("Et l� ?");

		String p = sc.nextLine();

		for (int i = 1; i <= 100; i++) { // le i++ incr�mente le pr�c�dent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 10 == 0) {// multiple de 10

				System.out.println();
			}
			// ca fait un carr� d'�toiles
			// System.out.println();
			// System.out.println(""); c'est pareil que le println
		}

		// l'utilisateur doit entrer un nombre et dans tous les cas , �a nous affiche un
		// carr�

		int cote = sc.nextInt();
		int total = cote * cote;
		for (int i = 1; i <= total; i++) { // le i++ incr�mente le pr�c�dent nombre, le 1 devient 2 puis 3 ...
			System.out.print("* ");

			if (i % 10 == cote) {// multiple de 10

				System.out.println();
			}
		}

	}
}
