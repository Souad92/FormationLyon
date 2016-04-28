package sk.metier;

public class Perroquet extends Vertebre {


	public Perroquet() {
		super("Perroquet sauvage", 0.3f, 1f);
		setNbPattes(2);
	}

	public Perroquet(String nom, float taille, float poids) {
		super(nom, taille, poids);
	}

	@Override
	public String seDeplacer() {
		return "voler";
	}

}
