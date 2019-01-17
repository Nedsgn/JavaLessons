package testtttt;

public class tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombreEntier = 10;
		double nombreD = 12.5;

		String garage1 = "voiture 1";
		String garage2 = "voiture 2";
		String garage3 = "Voiture 3";
		String[] parking = { "voiture 1 P", "voiture 2 P", "voiture 3 P" };
		System.out.println(parking[0]); // premier élémeent
		System.out.println(parking[1]); // 2nd
		System.out.println(parking[2]); // 3

		String miloud = "Miloud";
		String agnes = "Agnès";
		String lionel = "Lionel";

		System.out.println(miloud);
		String[] prenoms = { "Miloud", "Agnès", "Lionel" };

		System.out.println(prenoms[2] + " , " + prenoms[1]);

		double[] notes = { 12.5, 12.5, 10.6, 15, 20 };
		int[] coefs = { 1, 5, 6, 7, 3, 2, 1 };

		System.out.println("Le coef à l'indice  0 est : " + coefs[0]);
		System.out.println("Le coef à l'indice  4 est : " + coefs[4]);

		String chaine = "";
		System.out.println("Taille de la chaine : " + chaine.length());
		System.out.println("Taille du tableau notes : " + notes.length);// le length est sans parenthèse car ici ce
																		// n'est pas une chaine de caractere qu'on veut
																		// utiliser
		System.out.println("Taille du tableau coef : " + coefs.length);

		System.out.println("FIN");

	}

}
