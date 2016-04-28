package sk.main;

import sk.metier.Animal;
import sk.metier.Renard;
import sk.metier.Tigre;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainAnimal mainAnimal = new MainAnimal();
		mainAnimal.init();
	}

	private void init() { // méthode init de la classe
		Tigre tigre1 = new Tigre("animal inconnu", 0.7f, 35f);
		Tigre tigre = new Tigre();
		tigre.setNom("Tigrou");
		System.out.println(tigre.getNbPattes());
		Tigre tigre2 = new Tigre("animal inconnu", 0.6f, 30f);
		Renard renard = new Renard();
		System.out.println(renard.getNbPattes());
		System.out.println(renard.seDeplacer().trim()); // trim pour retirer des
														// espaces devant et
														// derriere s'il y en a
		System.out.println(renard.allaite());
		Animal tigre3;
		tigre3 = new Tigre(); // new va etre prioritaire devant la classe de
								// declaration
		System.out.println(tigre3.seDeplacer());
	}
}
