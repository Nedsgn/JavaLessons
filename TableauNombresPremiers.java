package testtttt;

public class TableauNombresPremiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 10 };
		System.out.println("La taille du tableau : " + nombresPremiers.length);
		System.out.println(nombresPremiers[0]);// 2
		System.out.println(nombresPremiers[1]);// 3
		System.out.println(nombresPremiers[2]);
		System.out.println(nombresPremiers[3]);
		System.out.println(nombresPremiers[4]);
		System.out.println(nombresPremiers[5]);
		System.out.println(nombresPremiers[6]);
		System.out.println(nombresPremiers[7]);
		System.out.println(nombresPremiers[8]);
		System.out.println(nombresPremiers[nombresPremiers.length - 1]);// 29

//on peut donc utiliser une boucle for pour "réduire l'affichage" du tableau avec des syso / nze pa sles écrire un par un avec des syso

		for (int i = 0; i < nombresPremiers.length; i++) {// declare un varaiable qui est initlaisé à 0, tant que i est
															// inf à la taille du taile du tableau tu incremente
			// ici le .length vaut 10 car il y a 10 nombres. --> Est ce que le 3e élement
			// (par ex) du tableau est inférieur au 10e élément du tableau ? si oui, il nous
			// affiche alors l'élément en question

			// cette boucle permet dappliquer un traitement à TOUS les élements du tableau
			System.out.println("A l'indice " + i + " : " + nombresPremiers[i]); // cette appellation nous permet de
																				// mieux comprendre lexecution du code

		}

		// ou

		int[] nombresPremier = { 2, 3, 5, 7, 11 };
		System.out.println(nombresPremiers.length); // 5

		for (int i = 0; i < nombresPremiers.length; i++) {
			System.out.println("A l'indice " + i + " : " + nombresPremiers[i]);
		}

		String[] parking = { "V1", "V2", "V3", "V4", "V5" };
		for (int i = 0; i < parking.length; i++) {
			System.out.println(parking[i]);
		}
	}

}
