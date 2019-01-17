package testtttt;

public class ConditionsExo2JustePrix {

	public static void main(String[] args) {

		double prix = 120;

		double prixChoisi = 132;
		// **** exo: si prixChoisi equivalent prix : bravo
		// si prixcHOISI superieur prix : perdu c'ets moins
		// si prixChoisi inférieur prix :perdu cest plus****

		if (prixChoisi == prix) {
			System.out.println("bravooo");
		} else if (prixChoisi > prix) {
			System.out.println("perdu, c'est moins !");
		} else {
			System.out.println("perdu c'est plus");
		}

	}

}
