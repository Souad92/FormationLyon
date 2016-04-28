package sk.metier;

public class Tigre extends Vertebre {


	public Tigre() {
		super("tigre sauvage", 1.5f, 120f);
		setNbPattes(4);
	}


	public Tigre(String nom, float taille, float poids) {
		super(nom, taille, poids);
		setNbPattes(4);
	}
	@Override
	public String seDeplacer() {
		return "marcher";
	}
}
