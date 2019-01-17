package testtttt;

public class Conditionexo3MoyenneNotesIfElseIf {

	public static void main(String[] args) {

		double noteJava = 18;
		double noteSql = 16;
		double noteHtml = 18.2;
		double noteJavascript = 19.5;

		int coefJava = 5;
		int coefSql = 2;
		int coefHtml = 1;
		int coefJavascript = 3;

		// *****calculer la moyenne et l'affecter à une variable qu'on appelle
		// Moyenne*********

		// noteJava*coefJava
		// divisé par 4
		// double moyenne = ((noteJava * coefJava) + (noteSql * coefSql) + (noteHtml *
		// coefHtml)
		// + (noteJavascript * coefJavascript)) / (coefJava + coefHtml + coefSql +
		// coefJavascript);
		// System.out.println(moyenne);

		// ou

		int sommeCoef = coefJava + coefHtml + coefSql + coefJavascript;
		double resultatJava = noteJava * coefJava;
		double resultatSql = noteSql * coefSql;
		double sommeResultat = resultatJava + (noteHtml * coefHtml) + (noteJavascript * coefJavascript) + resultatSql;
		double moyenne = sommeResultat / sommeCoef;
		System.out.println("la moyenne : " + moyenne);

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

		if (moyenne >= 15) {
			System.out.println("tres bien");
		} else if (moyenne > 12) {
			System.out.println("asser bien");
		} else if (moyenne >= 10) {
			System.out.println("bien");
		} else if (moyenne >= 8) {
			System.out.println("ra");
		}

		// ici les deux solutions sont possibles, la 2e est un peu plus difficile car il
		// faut déduire

		if (moyenne >= 8 && moyenne < 10) {
			System.out.println("ra");
		} else if (moyenne >= 10 && moyenne <= 12) {
			System.out.println("bien");
		} else if (moyenne > 12 && moyenne <= 15) {
			System.out.println("ab");
		} else if (moyenne > 15) {
			System.out.println("tb");
		}
		// ici si on ne met ELSE tout seul car les notes qui ne sont pas spécifiée dans
		// l'algorithme ne seront pas affichées, le else prends sans conditions
		else {
			System.out.println("a lanne pro");
		}

		if (moyenne < 10 && noteJava >= 10) {
			System.out.println("conseil de classe");
		} else if (moyenne > 10 && noteJava >= 10) {
			System.out.println("yes tu passes");
		}

		// ******exercice : si leleve a entre 8 et 10 et que 'lune de ses notes est sup
		// à 15,
		// il passe*****

		if ((moyenne >= 8 && moyenne < 10) // si la moyenne est entre 8 inclus et 10 exclus
				&& (noteJava > 15 || noteJavascript > 15 || noteSql > 15 || noteHtml > 15))// ici il faut mettre les
																							// conditions dans deux
																							// grand parenthèses
		{
			System.out.println("tu passes bravooo");
		} else {
			System.out.println("noon, tu passes pas");
		}
//ici le boolean est de valeur true or false
		boolean noteEntre8Et10 = (moyenne >= 8 && moyenne < 10);
		boolean uneDesNotesEstSupA15 = (noteJava > 15 || noteHtml > 15 || noteSql > 15 || noteJavascript > 15);
		if (noteEntre8Et10 && uneDesNotesEstSupA15) {
			System.out.println("il passe, trop fort");
		}

//******exercice : si la moyenne est sup à 17 ET que toutes les notes sont sup ou égales à 15 il a les félicitations****

		if (moyenne > 17 && (noteJavascript >= 15 && noteSql >= 15 && noteJava >= 15 && noteHtml >= 15)) {
			System.out.println(moyenne + " : félicitations !");
		} else {
			System.out.println(moyenne + " : retente ta chance");
		}

	}

}
