
public class LundiDeux {
	public static void main(String[] args) {
		LundiDeux lundi140316 = new LundiDeux();
		lundi140316.init();
	}

	public void init() {
		String a1 = "	Bonjour tout le monde à Lyon ,je suis en formation à Lyon de 8 semaines	";
		int lgr = a1.length();
		System.out.println(lgr);
		a1 = a1.replace("Bonjour", "Bonsoir"); // ou
												// System.out.println(a1.replace("Bonjour",
												// "Bonsoir"));
		System.out.println(a1);
		String charRecherche = "Lyon";
		int ind = a1.indexOf(charRecherche);
		System.out.println(ind);
		int cpt = 0;
		while (ind >= 0) { // while=tant que. Dans ce cas, vaut mieux utiliser
							// while que for car plus court
			cpt++;
			ind = a1.indexOf(charRecherche, ind + 1);
		}
		System.out.println("nombre de " + charRecherche + " = " + Integer.toString(cpt));

		// autre méthode de compter:
		cpt = 0;
		String tabChar2 = "o";
		char[] tabChar = a1.toCharArray();
		for (int i = 0; i < tabChar.length; i++) {
			if (tabChar[i] == 'o') {
				cpt++;
			}

		}
		System.out.println("nombre de " + tabChar2 + " = " + Integer.toString(cpt));
		a1 = a1.toLowerCase().replace("Lyon", "Tour Part Dieu");
		System.out.println(a1);
	}

}
