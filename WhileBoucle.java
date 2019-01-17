package testtttt;

public class WhileBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WHILE (boucles)
		// boucle a l'infini
		// int i = 0;
		// while (i == 0) {
		// System.out.println("bonjour");
		// }

		// boucle qui ecrit 100 fois

		int cpt = 1;
		while (cpt <= 100) {
			System.out.println("bonjour");
			cpt = cpt + 1;
		}

		// ou
		int cpt3 = 2;
		while (cpt3 <= 100) {
			System.out.println("bonjour");
			cpt3++;
		}
		int cpt2 = 10;
		while (cpt2 >= 1) {
			System.out.println("bonjffour" + cpt2);
			cpt2--;
		}

		System.out.println("fin");

		System.out.println("Début");
		int cptt = 1;
		while (cpt <= 10) {
			System.out.println("Bonjour " + cpt);
			cpt++;
			// equivalent cpt = cpt + 1; et du coup on en a 10. on en aurait eu 9 sio ce
			// n'étais pas inf ou égal à mais sur inf
		}

// il faut incrémenter un compteur pour sortir de la boucle while

		// int cpt4 = 0;
		// while (cpt4 <= 3) {
		// System.out.println("hello" + cpt4);
		// cpt4--;// là, ca va aussi boucler à linfini car va partir dazns les negatifs
		// }

		int cpt5 = 0;
		while (cpt5 <= 3) {
			System.out.println("helo" + cpt5);
			cpt5++;// là, il va afficher 4 chiffres car on commence à partir de 0, 0 est un chiffre
					// aussi
		}

		int cpt6 = 0;
		while (cpt6 < 5) {
			System.out.println("hellow" + cpt6);
			cpt6++;// là, ca va aussi boucler à linfini car va partir dazns les negatifs

		}

	}
}
