
public class Tableau {

	private Forme2D[] tab;

	public Tableau() {
		this.tab = null;
	}

	public Tableau(int n) {
		this.tab = new Forme2D[n];
	}

	public Forme2D[] getTab() {
		return tab;
	}

	public void setTab(Forme2D[] tab) {
		this.tab = tab;
	}

	public void ajoutAuBout(Forme2D formeplus) {

		int nouvellelongueur = tab.length + 1;
		Forme2D[] tab2 = new Forme2D[nouvellelongueur];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}
		tab2[nouvellelongueur - 1] = formeplus;
		tab = tab2;
	}

	public void ajoutMilieu(Forme2D formeplus, int x) {
		int nouvellelongueur3 = tab.length + 1;
		Forme2D[] tab4 = new Forme2D[nouvellelongueur3];
		for (int i = 0; i < tab.length; i++) {
			if (i < x) {
				tab4[i] = tab[i];
			} else if (i == x) {
				tab4[i] = formeplus;
			} else if (i > x) {
				tab4[i] = tab[i - 1];
			}
		}
		tab = tab4;
	}

	public void supprAuBout() {
		int nouvellelongueur2 = tab.length - 1;
		Forme2D[] tab3 = new Forme2D[nouvellelongueur2];

		for (int i = 0; i < tab3.length; i++) {
			tab3[i] = tab[i];
		}
		tab = tab3;
	}

	public void supprMilieu(int x) {
		int nouvellelongueur4 = tab.length - 1;
		Forme2D[] tab5 = new Forme2D[nouvellelongueur4];

		for (int i = 0; i < tab5.length; i++) {
			if (i < x) {
				tab5[i] = tab[i];
			} else if (i == x) {
				tab5[i] = tab[i + 1];
			}
		}
		tab = tab5;
	}

	public boolean contains(Forme2D forme) { // boolean ou void???
		boolean z = false;
		for (int i = 0; i < tab.length; i++) {
			if (forme.equals(tab[i])) {
				z = true;
				break;
			}
		}
		return z;
	}
}
