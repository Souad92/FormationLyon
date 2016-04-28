
public class MainForme2D {

	public static final int TYPE_RECTANGLE = 0;
	public static final int TYPE_CARRE = 1;
	public static final int TYPE_TRIANGLERECTANGLE = 2;
	public static final int TYPE_TRIANGLEISOCELE = 3;
	public static final int TYPE_TRIANGLEEQUILATERAL = 4;
	public static final int TYPE_CERCLE = 5;
	public static final int NB_FORME = 10;
	private Forme2D[] forme;

	public static void main(String[] args) {
		MainForme2D mainForme2D = new MainForme2D();
		mainForme2D.init();

	}

	private void init() {

		Forme2D[] t = creTab();
		float somme = sommeTotale();
		Forme2D rectangleplus = new Rectangle(1, 1);
		Forme2D[] tableauTrie = tri(t);
		afficherTableau(tableauTrie);
		Forme2D[] nouveauTableau = ajoutAuBout(tableauTrie, rectangleplus);
		afficherTableau(nouveauTableau);
		Forme2D[] nouveauTableau2 = supprAuBout(tableauTrie);
		afficherTableau(nouveauTableau2);
		Forme2D[] nouveauTableau3 = ajoutMilieu(tableauTrie, -50, rectangleplus);
		afficherTableau(nouveauTableau3);
		Forme2D[] nouveauTableau4 = supprMilieu(tableauTrie, 5);
		afficherTableau(nouveauTableau4);

		Cercle c = new Cercle(4);
		Rectangle r = new Rectangle(1, 1);
		Carre ca = new Carre(2, 0);
		Cercle c2 = new Cercle(2);
		boolean comparatif = contains(r, nouveauTableau);
		boolean resultatFaux = c2.equals(r);
		boolean resultatVrai = c2.equals(c2);
		boolean resultatVraiAussi = c2.equals(c2);
		System.out.println(comparatif);

		Tableau tab = new Tableau(30);
		tab.ajoutAuBout(new Cercle(4));
		tab.ajoutMilieu(new Rectangle(4, 3), 6);
		Forme2D[] toto = tab.getTab();
		toto[4] = new Cercle(4);
		tab.getTab()[4] = new Cercle(4); // c'est juste une autre ecriture de
											// ce qu'on a ecrit en 2 lignes
											// juste au dessus

	}

	private Forme2D Rectangle(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	// Forme2D forme1 = new Rectangle();// 2 méthodes: soit on met les valeurs
	// dans les parentheses apres le new
	// Rectangle, ex (2, 5, 0), soit on
	// fait des set et on lui fixe les
	// valeurs
	// forme1.setX(3);
	// forme1.setY(5);
	// System.out.println(forme1.perimetre());
	// Forme2D forme2 = new Carre();
	// forme2.setX(2);
	// System.out.println(forme2.perimetre());
	// Forme2D forme3 = new Cercle(2, 0);
	// System.out.println(forme3.surface());
	// // // //
	private Forme2D[] creTab() {

		forme = new Forme2D[NB_FORME];
		Forme2D maForme = null;
		int cptR = 0;
		int cptCar = 0;
		int cptTriR = 0;
		int cptTriI = 0;
		int cptTriE = 0;
		int cptCer = 0;

		for (int i = 0; i < forme.length; i++) {
			int varAleatoire = (int) (Math.random() * 6);
			float xAleatoire = (float) (Math.random() * 20);
			float yAleatoire = (float) (Math.random() * 20);
			switch (varAleatoire) {

			case TYPE_RECTANGLE:
				maForme = new Rectangle(xAleatoire, yAleatoire);
				cptR++;
				// System.out.println("On a rangé un rectangle et la surface
				// est: "+forme[i].surface());
				break;

			case TYPE_CARRE:
				maForme = new Carre(xAleatoire, yAleatoire);
				cptCar++;
				break;

			case TYPE_TRIANGLERECTANGLE:
				maForme = new TriangleRectangle(xAleatoire, yAleatoire);
				cptTriR++;
				break;

			case TYPE_TRIANGLEISOCELE:
				maForme = new TriangleIsocele(xAleatoire, yAleatoire);
				cptTriI++;
				break;

			case TYPE_TRIANGLEEQUILATERAL:
				maForme = new TriangleEquilateral(xAleatoire, yAleatoire);
				maForme.surface();
				cptTriE++;
				break;

			case TYPE_CERCLE:
				maForme = new Cercle(xAleatoire);
				cptCer++;
				break;
			}
			forme[i] = maForme;
			// System.out.println(varAleatoire);
		}
		System.out.println(cptR + " " + cptCar + " " + cptTriR + " " + cptTriI + " " + cptTriE + " " + cptCer);
		return forme;
	}

	private float sommeTotale() {
		float surfaceTot = 0;
		for (int j = 0; j < forme.length; j++) {

			surfaceTot += forme[j].surface(); // on peut faire
												// surfaceTot=surfaceTot+forme[j].surface();
			// System.out.println(surfaceTot);

		}
		System.out.println("La surface totale de tous mes elements est: " + surfaceTot + " cm^2");
		return surfaceTot;

	}

	public Forme2D[] tri(Forme2D[] tab) {
		// Afficher le tableau de depart
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i].surface() + " , ");
		}
		System.out.println("");
		// Tant qu'on a effectuer ne serait ce qu'une seule permutation, on
		// continue b == true entraine on continue
		boolean b = true;
		while (b) {
			b = false;
			// J'explore mon tableau
			for (int i = 0; i < tab.length - 1; i++) {
				// Si la surface de ma forme à l'indice i est plus petite que la
				// surface à l'indice +1, je permute. Si t[i].surface() > t[i+1
				if (tab[i].compareTo(tab[i + 1]) > 0) {// Permet de comparer
														// une
					// surface à un autre La
					// surface de t[i] à celle
					// de t[i+1](t=forme)
					// if (t[i + 1].surface() < t[i].surface()) {
					Forme2D a = tab[i];
					// Je sauvegarde pour ne pas ecraser
					tab[i] = tab[i + 1];
					tab[i + 1] = a;
					b = true;
				}
			}
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i].surface() + " , ");
			}
			System.out.println("");
		}
		return tab;
	}

	private void afficherTableau(Object[] o) {
		if (o == null) {
			System.out.println("Le tableau est null");

		} else {
			for (int i = 0; i < o.length; i++) {
				System.out.print(o[i]);
			}
			System.out.println("");
		}
	}

	private Forme2D[] ajoutAuBout(Forme2D[] tableauTrie, Forme2D formeplus) {

		int nouvellelongueur = tableauTrie.length + 1; // On cree une nouvelle
														// longueur qui vaut
														// l'ancienne+1
		Forme2D[] tab2 = new Forme2D[nouvellelongueur];// On dit que cette
														// nouvelle longueur est
														// celle de notre
														// nouveau tableau tab2

		for (int i = 0; i < tableauTrie.length; i++) {
			tab2[i] = tableauTrie[i]; // en faisant ça, on copie le tableau
										// tableauTrie dans le tableau tab3
		}
		tab2[nouvellelongueur - 1] = formeplus; // On lui dit qu'a la derniere
												// case (qu'on vient de creer)
												// il faut lui mettre une forme
												// (on a mit un rectangle=voir
												// plus haut)
		return tab2;
	}

	private Forme2D[] supprAuBout(Forme2D[] tableauTrie) {
		int nouvellelongueur2 = tableauTrie.length - 1;
		Forme2D[] tab3 = new Forme2D[nouvellelongueur2];

		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = tableauTrie[i];
		}
		return tab3;
	}

	private Forme2D[] ajoutMilieu(Forme2D[] tableauTrie, int x, Forme2D formeplus) {
		int nouvellelongueur3 = tableauTrie.length + 1;
		Forme2D[] tab4 = new Forme2D[nouvellelongueur3];
		if (x >= tab4.length || x < 0) {
			tab4 = null;
		} else {
			for (int i = 0; i < tab4.length; i++) {
				if (i < x) {
					tab4[i] = tableauTrie[i];
				} else if (i == x) {
					tab4[i] = formeplus;
				} else if (i > x) {
					tab4[i] = tableauTrie[i - 1];
				}
			}
		}
		return tab4;
	}

	private Forme2D[] supprMilieu(Forme2D[] tableauTrie, int x) {
		int nouvellelongueur4 = tableauTrie.length - 1;
		Forme2D[] tab5 = new Forme2D[nouvellelongueur4];

		for (int i = 0; i < tab5.length; i++) {
			if (i < x) {
				tab5[i] = tableauTrie[i];
			} else if (i == x) {
				tab5[i] = tableauTrie[i + 1];
			}
		}
		return tab5;
	}

	private boolean contains(Forme2D forme, Forme2D[] tableau) {
		boolean z = false; // On commence par mettre le boolean en false
		for (int i = 0; i < tableau.length; i++) {
			if (forme.equals(tableau[i])) {
				z = true;
				break;
			}
		}
		return z;
	}
	// private boolean Contain(Forme2D forme, Forme2D[] tableauTrie){
}
