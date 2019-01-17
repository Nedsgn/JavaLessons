package testtttt;

public class LesMethodes {

	public static void main(String[] args) {
		System.out.println("debut");
		int d = doubleNombre(12);// je declare une variable dans laquelle je stocke le nom de la methode ci
									// dessous
		System.out.println(d);

		int unAutreDouble = doubleNombre(100); // on met un nouveau nombre
		System.out.println(unAutreDouble);

		// TODO Auto-generated method stub

		int add = addition(12, 14); // on met les valeurs des parametres de la methode addition
		System.out.println(add);

		int add2 = addition(15, 10000);
		System.out.println(add2);
		System.out.println("fin");
	}

	public static int doubleNombre(int entier) {
		System.out.println("debut doublenombre");
		int resultat = entier * 2;
		return resultat;
	}

	// addition de deux nombres
	public static int addition(int entier1, int entier2) {

		System.out.println("debut addition");
		int resultat = entier1 + entier2;
		return resultat;
	}

	public static double Pi() {
		double nombrePi = 3.1416;
		return nombrePi;
	}
}
