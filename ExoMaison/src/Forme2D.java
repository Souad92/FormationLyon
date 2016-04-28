
public abstract class Forme2D implements Comparable<Forme2D> {
	private float x;
	private float y;

	public Forme2D() {

	}

	public Forme2D(float x, float y) {
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

	public abstract float perimetre();

	@Override
	public String toString() {
		return "Ma Forme 2D est: " + this.getClass().getName() + " : " + surface() + " ,";
	}

	public abstract float surface();

	public int compareTo(Forme2D autreForme) {
		float surfaceThis = surface();
		float surfaceAutre = autreForme.surface();
		int resultat = 0;
		if (surfaceThis < surfaceAutre) {
			resultat = -1;
		} else if (surfaceThis > surfaceAutre) {
			resultat = 1;
		}
		return resultat;
	}
}