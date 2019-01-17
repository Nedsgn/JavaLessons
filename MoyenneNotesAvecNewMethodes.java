package testtttt;

public class MoyenneNotesAvecNewMethodes {

	public static void main(String[] args) {

		double noteJava = 18;
		double noteSql = 16;
		double noteHtml = 18.2;
		double noteJavascript = 19.5;

		int coefJava = 5;
		int coefSql = 2;
		int coefHtml = 1;
		int coefJavascript = 3;

		double moyenne = recupMoyenne(noteJava, noteSql, noteHtml, noteJavascript, coefJava, coefSql, coefHtml,
				coefJavascript);// on doit spécifier avant quelles notes il y a pour calculer la moyenne ensuite

		System.out.println("la moyenne : " + moyenne);

		afficherLesMentions(moyenne);// on appelle la fonction mais sans jamais avec le void, donc on afffiche les
										// mentions en fonction de la moyenne

	}

	public static void afficherLesMentions(double moyenne) {// cette methode ne retourne rien mais il faut quand même
															// mettre un
		// type de retour , ici void
		if (moyenne >= 0 && moyenne <= 8) {
			System.out.println("nul");
		} else if (moyenne >= 8 && moyenne <= 10) {
			System.out.println("RA");
		} else if (moyenne >= 10 && moyenne <= 12) {
			System.out.println("bien");
		} else if (moyenne >= 12 && moyenne > 15) {
			System.out.println("ab");
		} else if (moyenne >= 15) {
			System.out.println("tb");
		}

	}

	public static double recupMoyenne(double noteJava, double noteSql, double noteHtml, double noteJavascript,
			int coefJava, int coefHtml, int coefSql, int coefJavascript) {

		int sommeCoef = coefJava + coefHtml + coefSql + coefJavascript;
		double resultatJava = noteJava * coefJava;
		double resultatSql = noteSql * coefSql;
		double sommeResultat = resultatJava + (noteHtml * coefHtml) + (noteJavascript * coefJavascript) + resultatSql;
		double laMoyenne = sommeResultat / sommeCoef;

		return laMoyenne;
	}

}
