
public class TriangleRectangle extends Triangle {

	public float perimetre() {
		float peri = (((float) (Math.hypot((getX()), (getY()))) + getX() + getY()));
		return peri;
	}

	public float surface() {
		float sur = ((getX() * getY() / 2));
		return sur;
	}

	public TriangleRectangle() {
		super();
	}

	public TriangleRectangle(float x, float y) {
		super(x, y);
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof TriangleRectangle) {
			TriangleRectangle triR = (TriangleRectangle) o;
			float lgrobjet = triR.getX();
			float larobjet = triR.getY();
			if (lgrobjet == this.getX() && larobjet == this.getY()) {
				b = true;
			}

		}
		this.surface();
		return b;
	}
}