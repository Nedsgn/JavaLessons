package testtttt;

import java.util.Scanner;

public class ForBoucle2SysoPrintLn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		for (int i = 1; i <= 30; i++) { // le i++ incréemnte le précédent nombre, le 1 devient2 puis 3 ...
			System.out.print(" Nombre " + i);
			// si on a un 5, ce qui est le cas on rendre dans ce if
			// if (i == 3 || i == 6 || i == 9) {
			// si on veut retourner à la ligne chaque multiple de 3 par ex :
			if (i % 10 == 0) {

				System.out.println();
			}

			// System.out.println();
			// System.out.println(""); c'est pareil que le println
		}

	}

}
