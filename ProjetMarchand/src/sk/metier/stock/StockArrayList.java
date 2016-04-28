package sk.metier.stock;

import java.util.ArrayList;

import sk.metier.Alimentaire;
import sk.metier.Consommable;
import sk.metier.Produit;

public class StockArrayList extends ArrayList<Produit> {
	public static int NUM_STOCK = 0;

	private String nomDuStock;
	private float limitePrix;
	private float montantTotalStock;

	public StockArrayList() {
		nomDuStock = "stock" + Integer.toString(NUM_STOCK);
		limitePrix = 100f;
		montantTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(String nomDuStock) {
		this.nomDuStock = nomDuStock;
		limitePrix = 100f;
		montantTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(String nomDuStock, float limitePrix) {
		this.nomDuStock = nomDuStock;
		this.setLimitePrix(limitePrix);
		montantTotalStock = 0;
		NUM_STOCK++;
	}

	public StockArrayList(float limite) {
		this("", limite);
	}

	public String getNomDuStock() {
		return nomDuStock;
	}

	public void setNomDuStock(String nomDuStock) {
		this.nomDuStock = nomDuStock;
	}

	public float getLimitePrix() {
		return limitePrix;
	}

	public void setLimitePrix(float limitePrix) {

		if (limitePrix < 0) {
			// On ne met rien, ce qui veut dire que si limitePrix est inferieur
			// à
			// 0, il ne se passe rien
		} else if (limitePrix == 0) {
			this.limitePrix = Float.POSITIVE_INFINITY;
		} else {
			this.limitePrix = limitePrix;
		}
	}

	public float calculSomme() {
		float somme = 0;
		for (int i = 0; i < size(); i++) {
			somme += this.get(i).getPrix();
		}
		return somme;
	}

	@Override
	public String toString() {
		return this.nomDuStock;
	}

	public float getMontantTotalStock() {
		return montantTotalStock;
	}

	public void setMontantTotalStock(float montantTotalStock) {
		this.montantTotalStock = montantTotalStock;
	}

	@Override
	public void add(int index, Produit element) {
		float somme = montantTotalStock + element.getPrix();
		if (somme <= limitePrix || limitePrix == 0) {
			super.add(index, element);
			montantTotalStock = somme;
		}
	}

	// @Override
	// public boolean add(Produit e) {
	// boolean depassePas = false;
	// float somme = montantTotalStock + e.getPrix();
	// if (somme <= limitePrix || limitePrix == 0) {
	// Produit produitExiste=rechercherProduit(e);
	// if (contains(e)) {
	// Produit p = get(indexOf(e));
	// p.rajoute(e);
	// } else {
	// depassePas = super.add(e);
	// if (depassePas) {
	// montantTotalStock = somme;
	// }
	//
	// }
	// }
	// return depassePas;
	// }

	public boolean addOld(Produit e) {
		boolean depassePas = false;
		float somme = montantTotalStock + e.getPrix();

		if (limitePrix < 0) {
			System.out.println("Prix negatif");
		}
		if (somme <= limitePrix || limitePrix == 0) {
			Produit produitExiste = rechercherProduit(e);
			if (produitExiste != null) {
				depassePas = produitExiste.rajoute(e);
			} else {
				depassePas = super.add(e);
				// On met super et pas this prsq avec this
				// il repasserait dans public boolean
				// add(Produit e). On aurait aussi pu
				// mettre true mais pour une question de
				// memoire entre autre on met le
				// super.add

				if (depassePas) {
					montantTotalStock = somme;
				}
			}

		}
		return depassePas;
	}

	private Produit rechercherProduit(Produit e) {
		// Renvoie le produit cherché du stock
		Produit produitTrouve = null;
		for (Produit produit : this) {
			if (produit.getNom().equals(e.getNom())) {
				if (produit instanceof Alimentaire && e instanceof Alimentaire || produit instanceof Consommable && e instanceof Consommable) {
					produitTrouve = produit;
					break;
				}
			}
		}
		return produitTrouve;
	}

	@Override
	public Produit remove(int index) {
		Produit e = super.get(index);
		this.setMontantTotalStock(this.getMontantTotalStock() - e.getPrix()); // ou
																				// this.montantTotalStock-=e.getPrix();
		return super.remove(index);
	}

	@Override
	public boolean remove(Object o) {
		Produit e = (Produit) o;
		float nouveauMontantTotal = getMontantTotalStock() - e.getPrix();
		this.setMontantTotalStock(nouveauMontantTotal); // Ou sinon on l'ecrit
														// comme dans remove(int
														// index) sur une ligne
														// sans creer le float
		return super.remove(o);
	}

	@Override
	public void clear() {
		this.setMontantTotalStock(0);
		super.clear();
	}

	// @Override
	// public boolean contains(Object o) {
	// boolean bool = false;
	// if (o instanceof Produit) {
	// if (indexOf((Produit) o) >= 0) {
	// bool = true;
	// }
	// }
	// return bool;
	// }
	//
	// @Override
	// public int indexOf(Object o) {
	// int index = -1;
	//
	// if (o instanceof Produit) {
	// index = this.indexOf((Produit) o);
	// }
	// return index;
	// }

	private int indexOf(Produit o) {
		int index = -1;
		for (int i = 0; i < size(); i++) {
			Produit produit = get(i);
			if (produit.getNom().equals(o.getNom())) {
				if (produit instanceof Alimentaire && o instanceof Alimentaire || produit instanceof Consommable && o instanceof Consommable) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	public boolean add1(Produit e) {
		boolean depassePas = false;
		float somme = montantTotalStock + e.getPrix();

		if (limitePrix < 0) {
			System.out.println("Prix negatif");
		}
		if (somme <= limitePrix || limitePrix == 0) {
			Produit produitExiste = null;
			if (this.contains(e)) {
				int index = indexOf(e);
				produitExiste = this.get(index);
				depassePas = produitExiste.rajoute(e);
			} else {
				depassePas = super.add(e);

				if (depassePas) {
					montantTotalStock = somme;
				}
			}

		}
		return depassePas;
	}

}