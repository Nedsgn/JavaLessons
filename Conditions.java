package testtttt;

public class Conditions {

	public static void main(String[] args) {// si ya pas de main dans le java ca marchera pas c'est notre point d'entree

		// l'équivalent du where en java :
		// if(<conditions>) {
		// <Traitements>
		// }

		int note = 19; // on peut déclarer qu'une seule fois le type
		if (note > 10) {
			System.out.println("Bravo vous avez la moyenne");
		}
		// si la condition est fausse, elle ne s'affichera pas. Ne pas oublier les
		// accolades

		System.out.println("FIN");// si la boucle est fausse il affichera que cette phrase

		note = 15;

		if (note > 10) {
			System.out.println("Vous n'avez pas la moyenne");

		}

		System.out.println(note);
		System.out.println("FIN");

		if (note == 10) {
			System.out.println("Vous avez 10");

		}
		if (note != 12) {
			System.out.println("la note est # de 12");
			note = 10;
		}
		System.out.println(note);
		System.out.println("FIN");

		// >
		// <
		// >=
		// <=
		// ==
		// !=

	}
}
