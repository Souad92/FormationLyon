package sk.metier;

public class Lego {
	public String couleur;
	float hauteur;
	public int nbpicotslgr;
	int nbpicotslar;
	int nbpicots;
	float longueur;
	float largeur;

	public Lego() {
		this.couleur = "";
		this.longueur = 3f;
		this.largeur = 1.5f;
		this.hauteur = 0.8f;
		this.nbpicotslgr = 4;
		this.nbpicotslar = 8;
		this.nbpicots = 3;

	}

	public Lego(Lego autreLego) {
		this.couleur = couleur;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbpicotslgr = nbpicotslgr;
		this.nbpicotslar = nbpicotslar;
	}

	public Lego(String couleur, float hauteur, int nbpicotslgr, int nbpicotslar) {
		this.couleur = couleur;
		// this.longueur = longueur;
		// this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbpicotslgr = nbpicotslgr;
		this.nbpicotslar = nbpicotslar;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	public int getNbpicotslar() {
		return nbpicotslar;
	}

	public void setNbpicotslar(int nbpicotslar) {
		this.nbpicotslar = nbpicotslar;
	}

	public int getNbpicots() {
		return nbpicots;
	}

	public void setNbpicots(int nbpicots) {
		this.nbpicots = nbpicots;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public String getCouleur() {
		return this.couleur;

	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public float getLongueur() {
		return this.longueur;

	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
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