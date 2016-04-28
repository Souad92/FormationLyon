package sk.main;

import java.util.logging.Logger;

import sk.beans.Deve;
import sk.beans.Develop;
import sk.beans.SocieteDev;
import sk.metier.Developpeur;
import sk.metier.SocieteDevLogiciel;

public class MainSpring {

	public static void main(String[] args) {
		MainSpring m = new MainSpring();
		m.init();
		m.initSans();

	}

	private void init() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		SocieteDevLogiciel societe = new SocieteDevLogiciel();
		Developpeur olivier = new Developpeur();
		olivier.setNom("Olivier");
		olivier.setAnneesExperience(7);
		Developpeur marc = new Developpeur();
		marc.setNom("Marc");
		marc.setAnneesExperience(10);
		societe.setChefDeveloppeur(marc);
		societe.setDeveloppeur(olivier);

		logger.info("Chef Developpeur:" + societe.getChefDeveloppeur().getNom());
		logger.info("Developpeur:" + societe.getDeveloppeur().getNom());

	}

	private void initSans() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		Deve societe = new SocieteDev();
		Develop olivier = new Develop("Olivier", 7);
		Develop marc = new Develop("Marc", 10);
		societe.chefDevelop("Marc", 10);
		societe.develop("Olivier", 7);
	}

}
