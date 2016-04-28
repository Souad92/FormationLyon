package sk.metier;

public abstract class Vertebre extends Animal {

	public Vertebre() {
		super();
	}

	public Vertebre(String nom, float taille, float poids) {
		super(nom, taille, poids);
	}

	//public String seDeplacer() {
		//String nomDuTypeDeDeplacement = "";
		//nomDuTypeDeDeplacement = super.seDeplacer() + " " + nomDuTypeDeDeplacement; // On peut mettre super à la place de this 
		//return nomDuTypeDeDeplacement;

	public int nbOs(){
	return 100; 
	}
	
}
