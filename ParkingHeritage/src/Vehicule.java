
public abstract class Vehicule {
	private float x;
	private float y;

	public Vehicule() {

	}

	public Vehicule(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float surface() {
		float surface = getX() * getY();
		return surface;
		// sinon sur une ligne: return getX()*getY();
	}
}
