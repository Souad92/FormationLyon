package sk.metier.stock;

import java.util.ArrayList;

import sk.metier.Produit;

public class PasUnStock {

	private ArrayList<Produit> monStock;
	private ArrayList<Produit> monStockPrive;
	private ArrayList<Produit> monStockFamille;

	public PasUnStock() {
		monStock = new ArrayList<Produit>();
		monStockPrive = new ArrayList<Produit>();
		monStockFamille = new ArrayList<Produit>();
	}

	public ArrayList<Produit> getMonStock() {
		return monStock;
	}

	public void setMonStock(ArrayList<Produit> monStock) {
		this.monStock = monStock;
	}

	public ArrayList<Produit> getMonStockPrive() {
		return monStockPrive;
	}

	public void setMonStockPrive(ArrayList<Produit> monStockPrive) {
		this.monStockPrive = monStockPrive;
	}

	public ArrayList<Produit> getMonStockFamille() {
		return monStockFamille;
	}

	public void setMonStockFamille(ArrayList<Produit> monStockFamille) {
		this.monStockFamille = monStockFamille;
	}

}
