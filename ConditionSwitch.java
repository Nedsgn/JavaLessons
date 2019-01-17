package testtttt;

public class ConditionSwitch {

	public static void main(String[] args) {
		// il faut faire attention au break
		int note = 10;
		switch (note) {
		case 10:
			System.out.println("vous avez eu 10");
			break;
		// else if c'estr le case
		case 15:
			System.out.println("15");
			break;
		case 14:
			System.out.println("14");
		case 12:
			System.out.println("12");
		default:
			System.out.println("aucune des valeurs");
			break;
		}
	}

}
