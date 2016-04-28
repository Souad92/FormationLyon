package sk.metier;

public abstract class Animal {
	private String nom; // Proprietes
	private float taille;
	private float poids;
	private int nbPattes; 
	public Animal() { // Constructeur par defaut 
		//nom = " ";
		//taille = 3f;
		//poids = 2f;
	}

	public Animal(String nom, float taille, float poids) { // Constructeur surchargé (avec les proprietes de l'objet)
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
	}

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}
	public abstract String seDeplacer (); // Methode
	}
