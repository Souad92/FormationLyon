
public class mardi080316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lng = 1.5f;

		for (float indice = 1.5f; indice < 5; indice = indice + 0.5f) {
			if (lng == indice) {
				int etage = (int) indice - 1;
				System.out.println("Je range mon v�hicule � l'�tage " + etage);

			}
		}
		float longueur = 1.5f;
		int etage = 1;
		for (float i = 1.5f; i < 5; i += 0.5f) {
			if (longueur >= i && longueur < i + 0.5f) {

			}
		}
		// Recuperer correction d'Aimad

		// M�thode Amandine
		float lgr = 8f;
		for (float j = 1.5f; j < 5f; j += 0.5f) {
			if (lgr == j) {
				int etg = (int) (j / 0.5f) - 2;
				System.out.println("Je range mon v�hicule � l'�tage " + etg);
			}
			if (lgr > 5f) {
				System.out.println("Je range mon v�hicule au RDC");
				break;

			} else {
				if (lgr < 1.5f) {
					System.out.println("Je ne peux pas ranger mon v�hicule");
					break;
				} 
				// Fin m�thode Amandine
				else {

				}
			}
		}
	}
}
