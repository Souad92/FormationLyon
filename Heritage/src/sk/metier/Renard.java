package sk.metier;

public class Renard extends Mammifere {


	public Renard() {
		super("Renard sauvage", 0.6f, 30f);
		setNbPattes(4);
	}

	public Renard(String nom, float taille, float poids) {
		super(nom, taille, poids);
		setNbPattes(4); 
	}

	@Override
	public String seDeplacer() {
		return "marcher";
	}

	
}
