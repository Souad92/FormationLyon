
public class ExoLego {
	String couleur;
	float longueur;
	float largeur; // Propriétés de la classe - Propriétés de l'objet
	float hauteur;
	int nbpicotslgr;
	int nbpicotslar;
	int nbpicots;

	ExoLego() {
		this.couleur = "";
		this.longueur = 3f;
		this.largeur = 1.5f;
		this.hauteur = 0.8f;
		this.nbpicotslgr = 4;
		this.nbpicotslar = 2;
		this.nbpicots = 3;
	}

	ExoLego(String couleur, float longueur, float largeur, float hauteur, int nbpicotslgr, int nbpicotslar) {
		this.couleur = couleur;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nbpicotslgr = nbpicotslgr;
		this.nbpicotslar = nbpicotslar;
	}

	String getCouleur() {
		return this.couleur;

	}

	void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	float getLongueur() {
		return calculDim(nbpicotslgr);

	}

	void setLongueur(float longueur) {
		this.longueur = longueur;
		nbpicotslgr = calculNbPicots(longueur);
	}

	float getLargeur() {
		return calculDim(nbpicotslar);

	}

	void setLargeur(float largeur) {
	this.largeur = largeur;
		nbpicotslar = calculNbPicots(largeur);
	}

	float getHauteur() {
		return this.hauteur;

	}

	void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}

	int getNbpicotslgr() {
		return this.nbpicotslgr;

	}

	void setNbpicotslgr(int nbpicotslgr) {
		this.nbpicotslgr = nbpicotslgr;
	}

	int getNbpicotslar() {
		return this.nbpicotslar;

	}

	void setNbpicots(int nbpicots) {
		this.nbpicots = nbpicots;
		longueur=calculDim(nbpicotslgr);
	}

	int getNbpicots() {
		return this.nbpicots;

	}

	void setNbpicotslar(int nbpicotslar) {
		this.nbpicotslar = nbpicotslar;
	}

	float calculDim(int nbpicots) {
		float dimension = nbpicots * 0.75f;
		return dimension;

	}

	// Ma "méthode"
	ExoLego(String couleur, float longueurs, float largeurs, float hauteurs, int nbpicots) {
		this.couleur = couleur;
		this.longueur = nbpicots * 0.75f;
		this.largeur = nbpicots * 0.75f;
		this.hauteur = hauteurs;
		this.nbpicots = nbpicots;
	}

	int calculNbPicots(float dim) {
		int valeurDeRetour = -1;
		if (dim > 0) {
			float n = dim / 0.75f;
			int nb = (int) n;
			if (n - nb < 0.5f) {
				valeurDeRetour = (nb);
			} else {
				valeurDeRetour = nb + 1;
			}
		}
		return valeurDeRetour;
	}
}
