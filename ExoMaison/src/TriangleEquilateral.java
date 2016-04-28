
public class TriangleEquilateral extends Triangle {

	public float surface() {
		return ((getX() * getY()) / 2);
	}

	public TriangleEquilateral() {
		super();
	}

	public TriangleEquilateral(float x, float y) {
		super(x, y);
	}

	public float perimetre() {

		return (getX() * 3);
	}

	@Override
	public boolean equals(Object o) {
		boolean b = false;
		if (o instanceof TriangleEquilateral) {
			TriangleEquilateral triE = (TriangleEquilateral) o;
			float lgrobjet = triE.getX();
			float larobjet = triE.getY();
			if (lgrobjet == this.getX() && larobjet == this.getY()){
			b = true;	
			}
			
		}
		this.surface();
		return b;
	}
}