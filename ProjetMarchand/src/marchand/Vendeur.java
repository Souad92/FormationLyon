package marchand;

import java.util.TreeMap;

import sk.metier.Produit;
import sk.metier.stock.Stock;

public class Vendeur {
	private Stock stock;
	private Stock stockPrive;
	private Stock stockFamille;

	public Vendeur() {
		stock = new Stock();
		stockPrive = new Stock();
		stockFamille = new Stock();
	}

	public Vendeur(float limite, float limitePrive, float limiteFamille) {
		TreeMap<String, Produit> stock= new TreeMap<String, Produit>(); 
		TreeMap<String, Produit> stockPrive= new TreeMap<String, Produit>(); 
		TreeMap<String, Produit> stockFamille= new TreeMap<String, Produit>(); 
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Stock getStockPrive() {
		return stockPrive;
	}

	public void setStockPrive(Stock stockPrive) {
		this.stockPrive = stockPrive;
	}

	public Stock getStockFamille() {
		return stockFamille;
	}

	public void setStockFamille(Stock stockFamille) {
		this.stockFamille = stockFamille;
	}

}
