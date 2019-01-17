package testtttt;

public class ExoForBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// afficher les chiffres qui sont uniquement multiple de 3 et 7
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 7 == 0) {// c'est toujours modulo + le nombre qu'on veut plus == 0
				System.out.println("la boucle " + i);
			}
		}
	}

}
