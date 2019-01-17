package testtttt;

public class ForBoucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int cpt = 0; cpt <= 10; cpt++) // tout se retrouve sur la même ligne par rapport à while
		// Traitement
		{
			System.out.println(cpt);
		}
//si cpt modulo est égal à 0 alors affiche moi
		for (int cpt = 0; cpt <= 10; cpt++) {
			if (cpt % 2 == 0) {
				System.out.println("Nombre " + cpt);
			}
		}

		// avec while ça fait ça
		// int i = 0;
		// while (i <= 10) {
		// System.out.println("hellow");
		// i++;
		// }

		// afficher les chiffres qui sont uniquement multiple de 3 et 7
		// for (int i = 1; i <= 9; i++) {

		// }
	}

}
