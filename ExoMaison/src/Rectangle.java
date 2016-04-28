
public class Rectangle extends Forme2D {

	public Rectangle() {
		super();
	}

	public Rectangle(float x, float y) {
		super(x, y);
	}

	@Override
	public float perimetre() {
		float periRectangle = 2 * (getX() + getY());
		return periRectangle;
	}

	@Override
	public float surface() {
		float surfaceRectangle = getX() * getY();
		return surfaceRectangle;
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof Rectangle) {
			Rectangle r = (Rectangle) o;
			float lgrobjet = r.getX();
			float larobjet = r.getY();
			if (lgrobjet == this.getX() && larobjet == this.getY()) {
				b = true;
			}

		}
		return b;
	}

}
