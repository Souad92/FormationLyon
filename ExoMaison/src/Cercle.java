
public class Cercle extends Forme2D {

	public Cercle() {
		super();
	}

	public Cercle(float x) {
		super(x, x);
	}

	@Override
	public float perimetre() {
		float periCercle = (float) (2 * Math.PI * getX());
		return periCercle;
	}

	@Override
	public float surface() {
		float surfaceCercle = (float) (Math.PI * Math.pow(getX(), 2));
		return surfaceCercle;
	}

	@Override
	public String toString() {
		return super.toString() + " Je suis un cerle ";
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof Cercle) {
			Cercle c = (Cercle) o; // On a casté o qui est un objet en Cercle
									// pour qu'il rentre dans les parametres de
									// Cercle et avoir surface et perimetre...
			float lgrobjet = c.getX();
			if (lgrobjet == this.getX()) {
				b = true;
			}

		}
		// this.surface();
		return b;
	}

}
