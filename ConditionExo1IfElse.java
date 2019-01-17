package testtttt;

public class ConditionExo1IfElse {

	public static void main(String[] args) {

		// **** si la personne a 18 ans majeur inférieur mineur***

		int age = 18;

		if (age >= 18) {
			System.out.println("vous êtes majeur");
		}
		if (age <= 18) {
			System.out.println("vous êtes mineur");
		}

		// note double
		// > 15 TB
		// > 12 AB
		// > 10 Bien
		// > 5 PMF
		// > 0 EN

		double note = 20;

		if (note >= 0 && note <= 5) {// ici il y a une condition le && (et)
			System.out.println("EN");

		}
		if (note > 5 && note <= 10) {
			System.out.println("PMF");

		}
		if (note > 10 && note <= 12) {
			System.out.println("Bien");

		}
		if (note > 12 && note <= 15) {
			System.out.println("AB");

		}
		if (note > 15 && note <= 20) {
			System.out.println("TB");

		}

		// nouvelle conditioon le ou ||
		if (note < 0 || note > 20) {
			System.out.println("Note non valide");
			// ici on a couvert toutes les intervalles
		}

		// if else : si sinon

		if (age >= 18) {
			System.out.println("Vous êtes majeur");

		} else {
			System.out.println("Vous êtes mineur");
		}

//if else if.....else
		if (note > 15 && note <= 20) {
			System.out.println("TB");
		} else if (note > 12 && note <= 15) {
			System.out.println(" AB");
		} else if (note > 10 && note <= 12) {
			System.out.println("bien");
		} else if (note > 5 && note < 10) {
			System.out.println("PMF");
		} else if (note >= 0 && note <= 5) {
			System.out.println("en");
		}

		// if(<condition_1>){
		// <traitement_1>
		// } else if(<condition_2>){
		// <traitement_2>
		// } else if(<condition_x>){
		// <traitement_x>
		// }else{
		// <traitement si aucune des conditions ni vraie>
		// }

	}

}
