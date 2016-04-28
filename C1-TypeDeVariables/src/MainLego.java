
public class MainLego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C'est une méthode qui s'appelle main et est notre point d'entrée pour
		// la création d'objet
		Lego monPremierLego; // On vient de concevoir un Lego
		monPremierLego = new Lego("monPremierLego", 12, 7, 3);
		monPremierLego.renommerMonLego("mon premier lego");
		Lego monSecondLego;
		monSecondLego = new Lego("monSecondLego", 2, 5, 78);
		monSecondLego.renommerMonLego("mon second lego");
		monPremierLego.setLargeur(5);
		int coul = 2;
		monSecondLego.setCouleur(coul);
		monSecondLego.setLongueur(monPremierLego.getLargeur());
		int long1 = 12;
		int lar1 = 5;
		int cou1 = 3;
		monPremierLego.initialiseMonLego(long1, lar1, cou1);
		monSecondLego.initialiseMonLego(13, 24, 3);
		monSecondLego.peindreMonLego(7);
		System.out.println("couleur de mon premier lego " + monPremierLego.getCouleur());
		System.out.println("couleur de mon second lego " + monSecondLego.getCouleur());
		System.out.println("longueur de mon premier lego " + monPremierLego.getLongueur());
		System.out.println("longueur de mon second lego " + monSecondLego.getLongueur());
		System.out.println("largeur de mon premier lego " + monPremierLego.getLargeur());
		System.out.println("largeur de mon second lego " + monSecondLego.getLargeur());

	}

}
