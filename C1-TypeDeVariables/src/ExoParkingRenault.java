
public class ExoParkingRenault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lgr = 2.5f;
		if (lgr < 1.5f) {
			System.out.println("Le véhicule n'est pas accepté");
		} else {
			if (lgr > 5.5f) {
				System.out.println("Le véhicule est garé au RDC");
			} else {
				for (float i = 1.5f; i <= 5.5f; i++) {
					if (lgr == i) {
						int etage = (int) (i / 0.5f) - 2;
						System.out.println("Je range le véhicule à l'étage " + etage);
						int voiture = (int) (Math.random() * 1000);
						System.out.println(voiture);
						for (int j = 1; j <= 200; j++) {
							if (voiture == j) {
								System.out.println("Soyez la bienvenue chez Renault");
							}
						}
						if (voiture > 200) {
							System.out.println("Allez voir chez PSA");
						}
					}
				}

			}
		}
		// Correction

		float pas = 0.5f;
		float valeurMini = 1.5f;
		float valeurMAxi = 5f;
		float longueur = 3.1f;
		int etage = 1;
		float[] vh = { 1.6f, 3f, 7f, 1f };

		for (int i = 0; i < vh.length; i++) {
			longueur = vh[i];
			System.out.println(longueur);

		}
		int etageSelectionne = -1;
		int cpt1 = 0;
		int cpt2 = 0;
		int[] cpt = new int[9];
		longueur = 2f;

		if (longueur < 1.5f) {
			etageSelectionne = -1;
		} else if (longueur > 5.5f) {
			etageSelectionne = 0;

		} else {
			for (float i = 1.5f; i < 5.5f; i++) {
				etage = (int) (i / 0.5f - 2);

				if (longueur >= i && longueur <= i + 0.5f) {
					etageSelectionne = etage;
					break;

				}
			}

			System.out.println("longueur = " + longueur + " = " + etageSelectionne);
			if (etageSelectionne == 1) {
				cpt1++;
				cpt[1]++;
			}
			if (etageSelectionne == 2) {
				cpt2++;
				cpt[2]++;
			}
		}
		for (

		int i = 0; i < cpt.length; i++)

		{
			if (etageSelectionne == i) {
				cpt[i]++;
			}

			System.out.print(cpt[i]);

		}
		System.out.println(cpt[1]); // Nombre de voitures dans l'étage 1
									// uniquement
		System.out.println(cpt[2]);
		// Fin de la correction prise par moi même

		// Correction officielle

		// parking 8 étages, 200 places par étage.
		// 1000 voitures
		// RDC pour plus de 5.5m. Pas d'acceuil pour moins de 1.5m de long.
		// Donnez le nombre de véhicules par étage en fonction de l'arrivée des
		// véhicules.
		// Conserver le numéro de passage de chaques véhicules

		float pass = 0.5f;
		float valeurMinis = 1.5f;
		float valeurMaxis = 5f;
		float lgrs = 3.1f;
		int etages = 1;
		float[] vhs = { 1.6f, 2.1f, 1.8f, 3.5f };
		int cpt1s = 0;
		int cpt2s = 0;
		int[] cpts = new int[9];

		for (int k = 0; k < vhs.length; k++){
			lgrs = vhs[k];
			int etageSelectionnes = -1;
			if (lgrs < valeurMinis) {
				etageSelectionnes = -1;
			} else if (lgrs > valeurMaxis) {
				etageSelectionnes = 0;
			} else {
				for (float i = valeurMinis; i < valeurMaxis + pass; i += pass) {
					etages = (int) (i / pass - 2);
					if (lgrs >= i && lgrs < i + pass) {
						etageSelectionnes = etages;
						break;
					}
				}
			}
			System.out.println("lgrs = " + lgrs + " = " + etageSelectionnes);
			for (int i = 0; i < cpts.length; i++) {
				if (etageSelectionnes == i) {
					cpts[i]++;
				}
			}
		}
		for (int i = 0; i < cpts.length; i++)
		{
			System.out.println(cpts[i]);
		}
		// Fin correction officielle
	}
}
