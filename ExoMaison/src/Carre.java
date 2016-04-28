
public class Carre extends Rectangle {

	public Carre() {
		super();
	}

	public Carre(float x, float y) {
		super(x, y);
	}

	@Override
	public float perimetre() {
		float periCarre = 4 * getX();
		return periCarre;
	}

	@Override
	public float surface() {
		float surfaceCarre = getX() * getX();
		return surfaceCarre;
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof Carre) {
			Carre ca = (Carre) o;
			float lgrobjet = ca.getX();
			float larobjet = ca.getY();
			if (lgrobjet == this.getX() && larobjet == this.getY()) {
				b = true;
			}

		}
		this.surface();
		return b;
	}
}
