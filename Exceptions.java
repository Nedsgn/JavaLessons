package testtttt;

public class Exceptions {

	public static void main(String[] args) {
//on va essayer de maitriser l'execption qui saffiche ici. Des quon pense que ca va planter on met un try catch
		System.out.println("debut");
		int nombre1 = 10;
		int nombre2 = 0;

		// dedans on met ce qui risque de gener
		try {
			System.out.println(nombre1 / nombre2);

		} catch (Exception e) {
			System.out.println("Bouuum! C'est l'execption, vous deviez rentrer un entier");
			System.out.println(e.getStackTrace());// donne une adresse
		} finally {
			System.out.println("fin de l'execption");
		}

		System.out.println("fin");

		String[] tableau = { "premier" };
		System.out.println(tableau[0]);

		// cast

		int a = 10;

		double d = 12.5;

		d = a;

		a = (int) d;// cast. il transforme le double en entier en supprimant la virgule

		System.out.println(a);

		int petitEntier = 12;
		long grandEntier = 12;

		int petitEntier = (int) grandEntier;
	}

}
