package sk.beans;

public class SocieteDev implements Deve {
	@Override
	public Develop chefDevelop(String nom, int anneesExperience) {
		return new Develop(nom, anneesExperience);
	}

	@Override
	public Develop develop(String nom, int anneesExperience) {
		return new Develop(nom, anneesExperience);
	}
}
