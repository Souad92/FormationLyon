
public class ExoLego2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExoLego exolego1 = new ExoLego();
		ExoLego exolego2 = new ExoLego("rouge", 6f, 1.5f, 0.2f, 8, 2);

		// float valeur = exolego1.calculDim(exolego1.nbpicotslar);

		// exolego1.calculDim(exolego1.nbpicotslar);
		// exolego1.getLongueur();
		// objet.methode
		float lng = exolego1.getLongueur();
		System.out.println(lng);

		// Test avec Baptiste (1 ligne)
		System.out.println(exolego1.getNbpicotslar());

		exolego2.calculDim(5);
		float dimension = exolego2.calculDim(5);
	float dim=9f; 
	ExoLego exolego3 = new ExoLego (); 
	System.out.println(exolego3.calculDim(7));
	}

}
