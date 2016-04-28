package sk.metier.stock;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import sk.metier.Produit;

public class Stock extends TreeMap<String, Produit> { // Du coup, mnt Stock est
														// une TreeMap

	@Override
	public String toString() {
		String a = "[";
		Set<Entry<String, Produit>> set = this.entrySet();
		for (Entry<String, Produit> entry : set) {
			a += entry.getValue().getNom() + ",";
		}
		a += "]";
		return a;
	}

}
