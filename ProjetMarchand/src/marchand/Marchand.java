package marchand;

import java.io.Serializable;

import sk.metier.stock.StockArrayList;

public class Marchand extends Commercant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StockArrayList monStock;
	private StockArrayList monStockPrive;
	private StockArrayList monStockFamille;

	public Marchand() {
		monStock = new StockArrayList();
		monStockPrive = new StockArrayList();
		monStockFamille = new StockArrayList();
	}

	public Marchand(float limite1, float limitePrive, float limiteFamille) {
		super(limite1);
		// monStock = new StockArrayList();
		// monStockPrive = new StockArrayList();
		// monStockFamille = new StockArrayList();
		// monStock.setLimitePrix(limite1);
		monStockPrive.setLimitePrix(limitePrive);
		monStockFamille.setLimitePrix(limiteFamille);
	}

	public StockArrayList getStockPrive() {
		return monStockPrive;
	}

	public void setStockPrive(StockArrayList stockPrive) {
		this.monStockPrive = stockPrive;
	}

	public StockArrayList getStockFamille() {
		return monStockFamille;
	}

	public void setStockFamille(StockArrayList stockFamille) {
		this.monStockFamille = stockFamille;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
