package sk.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sk.beans.SocieteDevLogiciel;

public class MainSpring {

	public static void main(String[] args) {
		MainSpring m = new MainSpring();
		m.init();
	}

	public void init() {
		Logger logger = Logger.getLogger(this.getClass().getName());
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("simple-beans.xml");
		SocieteDevLogiciel societe = (SocieteDevLogiciel) appContext.getBean("societeDevLogiciel");
		logger.info("Chef Developpeur: " + societe.getChefDeveloppeur().getNom());
		logger.info("Developpeur     : " + societe.getDeveloppeur().getNom());
	}

}
