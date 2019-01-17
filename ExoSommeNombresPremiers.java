package testtttt;

public class ExoSommeNombresPremiers {

	public static void main(String[] args) {
		// Trouver la somme de tous les nombres premier jusqu'a 100

		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };
		int somme = 0;// au depart la somme des nombres cest zero

		for (int i = 0; i < nombresPremiers.length; i++) {// nombresPremiers.length = taille du tableau c'est à dire 10
			// la 1ere fois i vaut zero, est ce que zero est inf à
			// l'élément ?
			somme = somme + nombresPremiers[i]; // nombresPremiers[i] signifie que c'est l'indice du tableau . Le i est
												// modulable a souhait car il prends à chaque une nouvelle valeur grâce
												// à l'incrémentation

			// j'affecte les résultats dans la variable somme et je vais lui
			// rajouter le 1er élement de mon tableau . Il va additionner chaque
			// nombres, c-a-d élement du tableau jusqu'au dernier et va le stocker
			// dans 'somme'
		}
		System.out.println("Total du tableau : " + somme);

	}

}
