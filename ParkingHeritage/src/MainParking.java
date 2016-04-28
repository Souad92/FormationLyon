public class MainParking {

	public static final int TYPE_CITADINE = 0;
	public static final int TYPE_LIMOUSINE = 1;
	public static final int TYPE_MONOSPACE = 2;
	public static final int TYPE_MOTO = 3;
	public static final int TYPE_VELO = 4;
	private Vehicule typeVehicule;

	public static void main(String[] args) {
		MainParking mainParking = new MainParking();
		mainParking.init();

	}

	private void init() {

		Parking parking = new Parking(5, 20);
		remplirParking(parking);
	}

	public Parking remplirParking(Parking parking) {
		boolean libre = true;
		int cptC = 0;
		int cptL = 0;
		int cptMono = 0;
		int cptMoto = 0;
		int cptVelo = 0;
		int cptT = 0;

		while (libre) {
			int varAleatoire = (int) (Math.random() * 5);
			// float xAleatoire = (float) (Math.random() * 10);
			// float yAleatoire = (float) (Math.random() * 10);
			System.out.println(varAleatoire);
			switch (varAleatoire) {
			case TYPE_CITADINE:
				typeVehicule = new Citadine();
				if (cptT >= parking.getNbPlaceMax()) {
					libre = false;
				} else if (cptC >= 5) {
					System.out.println("Plus de places pour les citadines");
				} else {
					cptT++;
					cptC++;
					parking.setNumPlace(2 + cptC);

					System.out.println("num de place " + parking.getNumPlace());
				}
				break;

			case TYPE_LIMOUSINE:
				typeVehicule = new Limousine();

				if (cptT >= parking.getNbPlaceMax()) {
					libre = false;
				} else if (cptL >= 2) {
					System.out.println("Plus de places pour les limousines");
				} else {
					cptT++;
					cptL++;
				}
				break;

			case TYPE_MONOSPACE:
				typeVehicule = new Monospace();

				if (cptT >= parking.getNbPlaceMax()) {
					libre = false;
				} else if (cptMono >= 5) {
					System.out.println("Plus de places pour les monospaces");
				} else {
					cptT++;
					cptMono++;
				}
				break;

			case TYPE_MOTO:
				typeVehicule = new Moto();

				if (cptT >= parking.getNbPlaceMax()) {
					libre = false;
				} else if (cptMoto >= 5) {
					System.out.println("Plus de places pour les motos ");
				} else {
					cptT++;
					cptMoto++;
				}
				break;

			case TYPE_VELO:
				typeVehicule = new Velo();

				if (cptT >= parking.getNbPlaceMax()) {
					libre = false;
				} else if (cptVelo >= 3) {
					System.out.println("Plus de places pour les velos");
				} else {
					cptT++;
					cptVelo++;
				}
				break;
			}
		}
		System.out.println("citadines : " + cptC);
		System.out.println("limousines : " + cptL);
		System.out.println("monospaces : " + cptMono);
		System.out.println("motos : " + cptMoto);
		System.out.println("velos : " + cptVelo);
		System.out.println("total : "+ cptT);
		System.out.println("Le parking est rempli");
		return parking;
	}
}