
public class TriangleIsocele extends Triangle {

	public float perimetre() {
		return (float) (Math.hypot(getX() / 2, getY()) * 2 + getX());
	}

	public float surface() {
		return ((getX() * getY()) / 2);
	}

	public TriangleIsocele() {
		super();
	}

	public TriangleIsocele(float x, float y) {
		super(x, y);
	}
	@Override
	public boolean equals(Object o) {
		boolean b=false; 
		if (o instanceof TriangleIsocele){
			TriangleIsocele triI = (TriangleIsocele) o;
			float lgrobjet = triI.getX();
			float larobjet = triI.getY();
			if (lgrobjet ==this.getX()&& larobjet==this.getY()){
			b=true; 	
			}
			
		}
		this.surface(); 
		return b;
	}

}