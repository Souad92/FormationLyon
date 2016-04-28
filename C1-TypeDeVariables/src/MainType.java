
public class MainType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0x7F;
		byte b = 1;
		int c = a + b;
		System.out.println(c);
		int d = 5;
		int e = c + d;
		System.out.println(c + " + " + d + " = " + e);
		int f = 0x7FFFFFFF;
		System.out.println(f);
		f++;
		System.out.println(f);
		int g = 100;
		int h = 7;
		float i = 2.4f;
		float j = g / h * i;
		System.out.println(j);
		int l = g / h;
		System.out.println(l);
		float m = l * i;
		System.out.println(m);
		float k = i * g / h;
		System.out.println(k);

		if (k != j) {
			System.out.println("C'est pas top mais c'est normal");
		} else {
			System.out.println("C'est bon");
		}

		float n = g;
		n = n / h * i;
		System.out.println(n);

		int o = 15;
		int entiere = o / 7;
		int reste = o - entiere * 7;
		System.out.println("partie entière = " + entiere + " reste = " + reste);
		int rest = o % 7;
		System.out.println("rest = " + rest);
		double p = (100l + 12) / 5f;
		System.out.println(p);
		boolean vrai = true;
		boolean faux = false;
		boolean resultat = vrai & faux;
		System.out.println(resultat);
		boolean resultat2 = vrai | faux;
		System.out.println(resultat2);
		boolean resultat3 = vrai ^ faux;
		System.out.println(resultat3);
		int q = 0xF0;
		int r = 0x0F;
		int s = q | r;
		System.out.println(s);
		char t = 'é';
		int u = t + 1;
		System.out.println(t + " " + u);

		if (!(5l < 4d) && 7 < 12) {
			System.out.println("OK");
		}
		double w = 100d / 3d;
		float x = 100f / 3f;
		if (w == x) {
			System.out.println("C'est bon");

		} else {
			System.out.println("Ce n'est pas bon");
			System.out.println("w= " + w);
			System.out.println(x);
			boolean y = w == x;
			System.out.println(y);
			float z = ((float) g) / h * i;
			System.out.println(z);

			int longueur = 3;
			switch (longueur) {
			case 3:
				System.out.println("Le véhicule est rangé a l'étage 1");

			case 4:
				System.out.println("Le véhicule est rangé à l'étage 2");
				break;
			default:
				System.out.println("Le véhicule ne peut être rangé");
				break;
			}
			int lng = 2;
			if (lng <= 2) {
				System.out.println("Je range mon véhicule à l'étage 1");
			} else if (lng == 3) {
				System.out.println("Je range mon véhicule à l'étage 2");
			} else if (lng == 4) {
				System.out.println("Je range mon véhicule à l'étage 3");
			} else if (lng == 5) {
				System.out.println("Je range mon véhicule à l'étage 4");
			} else if (lng == 6) {
				System.out.println("Je range mon véhicule à l'étage 5");
			} else if (lng == 7) {
				System.out.println("Je range mon véhicule à l'étage 6");
			} else if (lng == 8) {
				System.out.println("Je range mon véhicule à l'étage 7");
			}
			for (int indice = 2; indice < 7; indice++) {
				if (lng == indice) {
					int etage = indice - 1;
					System.out.println("Je range mon véhicule à l'étage " + etage);
				}
			}
		}

		// Tableaux

		int[] tableau = new int[12];
		int[] tableau2;
		tableau2 = new int[12];
		int[] tableau3 = { 1, 2, 3, 4, 5, 6 }; // On initialise les valeurs, on
												// lui dit qu'il y en a 6
		System.out.println(tableau3[2]);
		System.out.println(tableau3.length);
		System.out.println(tableau);
		System.out.println(tableau.length);
		System.out.println(tableau[4]);
		System.out.print("tableau = {");
		for (int id = 0; id < tableau.length; id++) {
			System.out.print(tableau[id]);
			if (i < tableau.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(");");
		boolean[] tBoolean = new boolean[5];
		for (int v = 0; v < tBoolean.length; v++) {
			tBoolean[v] = true;
			System.out.print(tBoolean[v] + " ");
		}
		int[][] image = new int[4][5];
		System.out.println("");
		System.out.println("lg image " + image.length);
		System.out.println("lg image 2eme dimension " + image[0].length);
		System.out.println(image[1][2]);

		int[][] autre = { { 1, 2, 7 }, { 3, 4, 8 } };
		System.out.println(autre.length + " " + autre[0].length);
		System.out.println(autre[1][0]);
		System.out.println("--------------------");
		System.out.println("1,2,7");
		System.out.println("3,4,8");

		System.out.println("-------------------");
		for (int id = 0; id < autre.length + 1; id++) {
			System.out.print(autre[0][id]);
			if (id < autre.length) {
				System.out.print(" , ");
			}

		}
		// Tableau à 2 dimensions
		// On fait 2 boucles for
		System.out.println("---------------------");
		int[][] autres = { { 1, 2, 7 }, { 3, 4, 8 }, { 5, 3, 9 }, { 9, 7, 88 } };
		for (int aa = 0; aa < autres.length; aa++) {
			int[] tab = autres[aa]; // Lui dire qu'on prend tous les "tableaux"
									// car il considére qu'on plusieurs tableau
									// à 1 dimension
									// Nombre de tableau
			for (int ab = 0; ab < tab.length; ab++) { // Ce qui a a l'interieur
														// des tableaux en
														// commencant par 0
				System.out.print(tab[ab]);
				int ln = tab.length; // ln= longueur
				if (ab < ln - 1) { // -1 car l'ordi commence à 0
					System.out.print(" , "); // Pour mettre des virgules entre
												// chaque
				}
			}
			System.out.println(""); // Pour sauter une ligne
		}
		//New Exercice de rangement de voitures dans parking + comptage des voitures 
double valeurAleatoire=Math.random(); 
System.out.println(valeurAleatoire);// Pour avoir une valeur aléatoire 
	}
}
