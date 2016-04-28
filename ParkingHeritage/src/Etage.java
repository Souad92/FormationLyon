
public class Etage {
	private Place[] places;
	private int nbPlaces;

	public Etage() {

	}

	public Etage(int nbPlaces) {
		this.nbPlaces = nbPlaces;
		places = new Place[nbPlaces];
		for (int i = 0; i < places.length; i++) {
			places[i] = new Place();
		}
	}
}
