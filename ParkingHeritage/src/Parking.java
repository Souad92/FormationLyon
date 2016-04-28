
public class Parking {

	private int nbEtage;
	private int nbPlaceMax;
	private int numPlace;
	private Etage[] listeEtage;

	public Parking() {
		nbEtage = 2;
		listeEtage = new Etage[nbEtage];
	}

	public Parking(int nbEtage, int nbPlaceMax) {
		this.nbEtage = nbEtage;
		this.nbPlaceMax = nbPlaceMax;
		listeEtage = new Etage[nbEtage];
		for (int i = 0; i < listeEtage.length; i++) {
			listeEtage[i]= new Etage();
		}
	}

	public int getNbEtage() {
		return nbEtage;
	}

	public void setNbEtage(int nbEtage) {
		this.nbEtage = nbEtage;
	}

	public int getNbPlaceMax() {
		return nbPlaceMax;
	}

	public void setNbPlaceMax(int nbPlaceMax) {
		this.nbPlaceMax = nbPlaceMax;
	}

	public int getNumPlace() {
		return numPlace;
	}

	public void setNumPlace(int numPlace) {
		this.numPlace = numPlace;
	}

	public Etage[] getListeEtage() {
		return listeEtage;
	}

	public void setListeEtage(Etage[] listeEtage) {
		this.listeEtage = listeEtage;
	}

}
