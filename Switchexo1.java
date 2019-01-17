package testtttt;

public class Switchexo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mois = 61;

		switch (mois) {
		case 1:
			System.out.println("janvier");
			break;
		case 2:
			System.out.println("fev");
			break;
		case 3:
			System.out.println("mars");
			break;
		case 4:
			System.out.println("avril");
			break;
		case 5:
			System.out.println("mai");
			break;
		case 6:
			System.out.println("juin");
			break;
		case 7:
			System.out.println("juilet");
			break;
		case 8:
			System.out.println("aout");
			break;
		case 9:
			System.out.println("sept");
			break;
		case 10:
			System.out.println("octo");
			break;
		case 11:
			System.out.println("nov");
			break;
		default:// message à afficher si le nombre ne correspond à aucun mois/cas
			System.out.println("invalide");

		}

		String nomMois = "juin";
		switch (nomMois) {// key = c'est le nom de la variable
		case "janvier":
			System.out.println("le mois de janvier est le numéro " + 1);
			break;
		case "fevrier":
			System.out.println("le mois de fevrier est le numero " + 2);
			break;
		case "mars":
			System.out.println("le mois de mars est le numero " + 3);
			break;
		case "avril":
			System.out.println("le mois de avril est le numero " + 4);
			break;
		case "mai":
			System.out.println("le mois de mai est le numero " + 5);
			break;
		case "juin":
			System.out.println("le mois de juin est le numero " + 6);
			break;
		case "juillet":
			System.out.println("le mois de juillet est le numero " + 7);
			break;
		case "aout":
			System.out.println("le mois de aout est le numero " + 7);
			break;
		case "septembre":
			System.out.println("le mois de septembre est le numero " + 7);
			break;
		case "octobre":
			System.out.println("le mois de ocotbre est le numero " + 7);
			break;
		case "novembre":
			System.out.println("le mois de novembre est le numero " + 7);
			break;

		case "decembre":
			System.out.println("le mois de decembre est le numero " + 12);
			break;

		default:// message à afficher si le nombre ne correspond à aucun mois/cas
			System.out.println("invalide");

		}

	}

}
