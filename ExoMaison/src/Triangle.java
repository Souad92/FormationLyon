
public abstract class Triangle extends Forme2D {

	public Triangle() {
		super();
	}

	public Triangle(float x, float y) {
		super(x, y);
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof Triangle) {
			Triangle tri = (Triangle) o;
			float lgrobjet = ((Triangle) o).getX();
			float larobjet = ((Triangle) o).getY();
			if (lgrobjet == tri.getX() && larobjet == getY())
				;
			b = true;
		}
		this.surface();
		return b;
	}
}
