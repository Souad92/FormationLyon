package sk.main;

import sk.metier.Lego;

public class TabLego {

	public static void main(String[] args) {
		TabLego tabLego = new TabLego();
		tabLego.init();
	}

	// TODO Auto-generated method stub
	private void init() {
		Lego lego1 = new Lego();
		Lego lego2 = new Lego("rouge", 0.2f, 8, 2);
		Lego[] tour = new Lego[100];
		for (int i = 0; i < tour.length; i++) {
			Lego monLego = new Lego();
			tour[i] = monLego;
			// tour [i]= lego1;
		}
		lego1.couleur = "verte";

		Lego[] tour2 = { new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(), new Lego(),
				new Lego(), new Lego(), new Lego(), new Lego(), new Lego() }; // Jusqu'a
																				// 100
		System.out.println(tour2.length);

		Lego[] tour3 = tour;
		tour3[1].nbpicotslgr = 8;
		// 0 1 2 3 4 5
		String[] tabCouleur = { "blanc", "rouge", "vert", "bleu", "noir", "jaune" };
		int[] tableauCpt = new int[tabCouleur.length]; // Tableau de compteur
		for (int i = 0; i < tour.length; i++) {
			Lego lego = tour[i];
			int indiceCouleur = (int) (Math.random() * tabCouleur.length);
			String couleurAleatoire = tabCouleur[indiceCouleur];
			lego.setCouleur(couleurAleatoire);
			// tour [i].setCouleur(couleurAleatoire);

			int cpt = tableauCpt[indiceCouleur];
			cpt++;
			tableauCpt[indiceCouleur] = cpt;
		}
		int cptMax = 0;
		for (int j = 0; j < tableauCpt.length; j++) {

			System.out.print(tableauCpt[j] + " ");
			int cpt = tableauCpt[j];
			if (cpt > cptMax) {
				cptMax = cpt;

			}
		}
		// Tableau type lego de 2 dimensions
		// 1ere dimension: le nombre de tour
		// 2eme dimension: nombre de lego et/ou longueur max d'une tour
System.out.println("");
		Lego[][] tourCouleur = new Lego[tabCouleur.length][cptMax];
		for (int i = 0; i < tour.length; i++) {
			Lego lego = tour[i];
			String couleur = lego.getCouleur();
			int indiceCouleur = -1; // On peut mettre n'importe qu'elle valeur
									// prsq pour l'instant on ne la connait pas
			for (int j = 0; j < tabCouleur.length; j++) {
				String couleurDuTableau = tabCouleur[j];
				if (couleur.equals(couleurDuTableau)) {// ON NE COMPARE PAS UN
					indiceCouleur = j; // OBJET AUTREMENT
					// QU'AVEC .EQUALS(...)
					break;
				}

			}
			for (int k = 0; k < tourCouleur[0].length; k++) { // On prend inferieur au premier element de la tour
				Lego legoX = tourCouleur[indiceCouleur][k];
				if (legoX == null) {
					tourCouleur[indiceCouleur][k] = lego;
					break;

				}

			}
			// tourCouleur [indiceCouleur][]
		} // exo week end + il faut que ça soit joli, donc faire des phrases
			// et mettre des virgules...
		
		// Correction
		for (int i = 0; i < tourCouleur.length; i++) {
			for (int j = 0; j < tourCouleur[0].length; j++) {
				Lego legoX = tourCouleur[i][j]; // On a recupéré le lego
				if (legoX != null) { // Il n'est pas null donc il y a un lego
					System.out.print(legoX.getCouleur().substring(0, 1));

				} else {
					break;
				}
			}
			System.out.println("");
		}

	}

}
