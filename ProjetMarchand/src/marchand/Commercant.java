package marchand;

import java.io.Serializable;

import sk.metier.stock.StockArrayList;

public class Commercant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomDuMarchand;
	private StockArrayList monStock;

	public Commercant() {
		monStock = new StockArrayList();
	}

	public Commercant(String nomDuMarchand) {
		setNomDuMarchand(nomDuMarchand);
		monStock = new StockArrayList();
	}

	public Commercant(String nomDuMarchand, float limite) {
		setNomDuMarchand(nomDuMarchand);
		monStock = new StockArrayList(limite);
	}

	public Commercant(float limite) {
		monStock = new StockArrayList(limite);
	}

	public String getNomDuMarchand() {
		return nomDuMarchand;
	}

	public void setNomDuMarchand(String nomDuMarchand) {
		this.nomDuMarchand = nomDuMarchand;
	}

	public StockArrayList getMonStock() {
		return monStock;
	}

	public void setMonStock(StockArrayList monStock) {
		this.monStock = monStock;
	}

	@Override
	public String toString() {
		return nomDuMarchand;
	}

}
