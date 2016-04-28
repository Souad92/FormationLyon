
public class Lego {
	public String getNomDuLego() {
		return nomDuLego;
	}

	public void setNomDuLego(String nomDuLego) {
		this.nomDuLego = nomDuLego;
	}

	String nomDuLego;
	private int longueur;
	private int largeur;
	private int couleur; // blanc=0 bleu=1 vert=2 par ex
	private float hauteur;
	private int nbpicotslgr;
	private int nbpicotslar;
	private int nbpicots;// blanc=0 bleu=1 vert=2 par ex

	// Notion de constructeur:

	public Lego() { // Pas obligé de mettre un valeur car java mettra un truc par
				// défaut MAIS vaut mieux le mettre soit même quand même
		this.nomDuLego = "";
		this.longueur = 10;
		this.largeur = 5;
		this.couleur = 0;
	}

	public Lego(String nomDuLego, int longueur, int largeur, int couleur) {
		this.nomDuLego = nomDuLego;
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
	}

	public void initialiseMonLego(int longueur, int largeur, int couleur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleur = couleur;
		// void=mot reservé
	}

	public void renommerMonLego(String nom) {
		this.nomDuLego = nom;
	}

	public void peindreMonLego(int cou1) {
		couleur = cou1;

	}
// get et set méthode obligatoire, par contre le reste non, genre repeindre, renommer... 
	public int getCouleur() {
		return this.couleur;

	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getLongueur() {
		return this.longueur;

	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return this.largeur;

	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getNbpicotslgr() {
		return this.nbpicotslgr;

	}

	public void setNbpicotslgr(int nbpicotslgr) {
		this.largeur = nbpicotslgr;
	}
}
