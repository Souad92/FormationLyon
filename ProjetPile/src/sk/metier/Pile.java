package sk.metier;

public class Pile {

	public static int NB_MAX = 10;

	private int[] p;
	private int sp;

	public Pile(int taille) {
		p = new int[taille];
		sp = -1;
	}

	public Pile() {
		this(NB_MAX); // Le this fait reference à p=new int[taille]
		this.p = new int[NB_MAX];
		this.sp = 0;
	}

	public Pile(int[] p, int sp) {
		this.sp = 0;
		p = new int[sp];
	}

	public boolean estVide() {
		return sp == -1;
		// boolean retour = false;
		// if (sp == 0) {
		// retour = true;
		// }
		// return retour;
	}

	public boolean estPleine() {
		return sp == p.length - 1;
		// boolean retour = false;
		// if (sp == NB_MAX) {
		// retour = true;
		// }
		// return retour;
	}

	public void empiler(int valeurAEmpiler) throws PilePleineException {
		if (estPleine()) {
			throw new PilePleineException();
		}
		sp++;
		p[sp] = valeurAEmpiler;
	}

	public int depiler() throws PileVideException {
		if (estVide()) {
			throw new PileVideException();
		}
		sp--;
		return p[sp + 1];
	}

	public int[] getP() {
		return p;
	}

	public void setP(int[] p) {
		this.p = p;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}
}
