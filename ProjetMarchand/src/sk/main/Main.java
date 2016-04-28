package sk.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.TreeMap;

import marchand.Marchand;
import sk.metier.Alimentaire;
import sk.metier.Consommable;
import sk.metier.Produit;
import sk.metier.stock.Stock;
import sk.metier.stock.StockArrayList;

public class Main {

	public static void main(String[] args) {
		Main l = new Main();
		File f = new File("../donnee/stock.xml");
		// l.chargeStock();
		l.chargeXml();
		// Main mar = new Main();
		// mar.saveMarchandStock();
		// Main s = new Main();
		// s.save();
		// Main r = new Main();
		// r.recup();
		// Main m = new Main();
		// m.init();

	}

	private void chargeXml() {// A partir d'un fichier xml, on veut les objets
								// de ce fichier xml
		StockArrayList stock = null;
		File file = new File("Donnee/stock.xml"); // creer
		BufferedReader buf = null;
		try {
			buf = new BufferedReader(new FileReader(file));
			String line = buf.readLine();
			while (line != null) {
				if (line.contains("<StockArrayList")) {
					String nomStockCharge = extraitAtt(line, "nomStock='");
					stock = new StockArrayList();
					stock.setNomDuStock(nomStockCharge);
				} else if (line.contains("<Alimentaire")) {
					String nomCharge = extraitAtt(line, "nom='");
					String poidsCharge = extraitAtt(line, "poids='");
					String prixUnitaireCharge = extraitAtt(line, "prixUnitaire='");
					float poidsC = Float.valueOf(poidsCharge).floatValue();
					float prixUnitaireC = Float.valueOf(prixUnitaireCharge).floatValue();
					Alimentaire a = new Alimentaire(nomCharge, poidsC, prixUnitaireC);
					stock.add(a);
				} else if (line.contains("<Consommable")) {
					String nomCharge = extraitAtt(line, "nom='");
					String qteCharge = extraitAtt(line, "qte='");
					String prixUnitaireCharge = extraitAtt(line, "prixUnitaire='");
					int qteC = Integer.valueOf(qteCharge).intValue();
					float prixUnitaireC = Float.valueOf(prixUnitaireCharge).floatValue();
					Consommable c = new Consommable(nomCharge, qteC, prixUnitaireC);
					stock.add(c);
				} else if (line.contains("</StockArrayList>")) {
					for (Produit produit : stock) {
						System.out.println(produit.toString());
					}
				}
				line = buf.readLine();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public String extraitAtt(String line, String ch) {
		line = line.replace("\"", "'");
		String res = "";
		int deb = line.indexOf(ch);

		int fin = line.indexOf("'", deb + ch.length());
		res = line.substring(deb + ch.length(), fin);
		return res;
	}

	private void chargeStock() {

	}

	private void saveMarchandStock() {
		Marchand m = new Marchand(0, 0, 200);
		m.setNomDuMarchand("Robert");
		for (int i = 0; i < 10; i++) {
			m.getMonStock().add(new Alimentaire("Aliment " + i, 2, i + 1));
			m.getStockFamille().add(new Consommable("Consommable " + i, 2, i + 1));
			m.getStockPrive().add(new Alimentaire("Aliment " + i, 2, i + 1));
		}
		File fMarchand = new File("marchand.ser");
		ObjectOutputStream o = null;
		try {
			o = new ObjectOutputStream(new FileOutputStream(fMarchand));
			o.writeObject(m);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void recup() {
		File file = new File("alimentaire.ser");
		ObjectInputStream objIn = null;
		try {
			objIn = new ObjectInputStream(new FileInputStream(file));
			Alimentaire alimentaire = (Alimentaire) objIn.readObject();

			System.out.println(alimentaire.toString());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void save() {
		StockArrayList stock = new StockArrayList();

		InputStreamReader entreeStandard = new InputStreamReader(System.in);
		LineNumberReader resLecture = new LineNumberReader(entreeStandard);
		String nomSaisi = null;
		String typeSaisi = null;
		String qteSaisie = null;
		String poidsSaisi = null;
		String prixUnitaireSaisi = null;
		String poidsOuQteSaisi = null;

		try {
			System.out.println("Saisissez le nom");
			nomSaisi = resLecture.readLine();

			while (!nomSaisi.equals("")) {
				System.out.println("Est-ce un alimentaire?");
				typeSaisi = resLecture.readLine();
				System.out.println("Indiquez le poids ou la quantité souhaité");
				poidsOuQteSaisi = resLecture.readLine();
				System.out.println("Indiquez le prix à l'unité");
				prixUnitaireSaisi = resLecture.readLine();
				boolean bool = controleSaisi(typeSaisi, poidsOuQteSaisi);
				if (bool) {
					Produit produit = null;
					if (typeSaisi.toLowerCase().equals("oui")) {
						produit = new Alimentaire(nomSaisi, poidsOuQteSaisi, prixUnitaireSaisi);
					} else if (typeSaisi.toLowerCase().equals("non")) {
						produit = new Consommable(nomSaisi, poidsOuQteSaisi, prixUnitaireSaisi);
					}
					stock.add(produit);
				} else {
					System.out.println("Erreur de saisi: recommencez");
				}
				System.out.println("Saisissez le nom");
				nomSaisi = resLecture.readLine();
			}
			for (int i = 0; i < stock.size(); i++) {
				Produit p = stock.get(i);
				System.out.println(p.toString());

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Pour introduire Serializable:
		Alimentaire a = new Alimentaire("banane", 12, 0.99f);
		File fileAlimentaire = new File("alimentaire.ser");
		ObjectOutputStream obj = null;
		try {
			obj = new ObjectOutputStream(new FileOutputStream(fileAlimentaire));
			obj.writeObject(a);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private boolean controleSaisi(String typeSaisi, String poidsOuQteSaisi) {
		boolean bool = false;
		if (typeSaisi.equals("oui") || typeSaisi.equals("non")) {
			bool = true;
		}
		return bool;
	}

	public void init() {

		Alimentaire banane = new Alimentaire("Bananes", 3.5f, 0.99f);
		Consommable enveloppe = new Consommable("Enveloppes", 50, 0.1f);
		Produit fraise = new Alimentaire("Fraises", 0.5f, 2.99f);
		Produit banane2 = new Alimentaire("Banane", 5.5f, 1.03f);

		// Map
		TreeMap<String, Produit> treeMap = new Stock();

		treeMap.put(banane.getNom(), banane);
		treeMap.put(enveloppe.getNom(), enveloppe);
		treeMap.put(fraise.getNom(), fraise);
		treeMap.put(banane2.getNom(), banane2);

		if (treeMap.containsKey(banane2.getNom())) {
			rajouteDansTreeMap(treeMap, banane2);
		}

		// Set<Entry<String, Produit>> set = treeMap.entrySet();
		// for (Entry<String, Produit> entry : set) {
		// System.out.println(entry.getValue());
		// }
		String a = treeMap.toString();
		System.out.println(a);

		System.exit(0); // Il ne fait rien de ce qui se passe apres
		// ---------------------------------------------

		Marchand unMarchand = new Marchand(0, 200f, 100f);
		// Limite stock normal, prive, famille (quand c'est 0 c'est qu'il n'y a
		// pas de limites)
		unMarchand.getStockFamille().add(banane);
		unMarchand.getStockFamille().add(enveloppe);
		unMarchand.getStockFamille().add(fraise);
		unMarchand.getStockFamille().add(banane2);

		System.out.println("-------------------------------");
		Collections.sort(unMarchand.getStockFamille());
		for (Produit produit : unMarchand.getStockFamille()) {
			System.out.println(produit);
		}
		System.out.println("--------------------------------");

		System.out.println(unMarchand.getStockFamille().getMontantTotalStock());

		unMarchand.getStockFamille().remove(banane);

		System.out.println("banane=banane2? " + banane.equals(banane2));

		System.out.println(unMarchand.getStockFamille().getMontantTotalStock());

		unMarchand.getStockFamille().setLimitePrix(0);

		unMarchand.getStockFamille().calculSomme();
		unMarchand.getStockPrive().calculSomme();

		System.out.println("_________________" + unMarchand.getStockFamille().calculSomme());

		System.out.println(unMarchand.getStockFamille().contains(banane));
		System.out.println(unMarchand.getStockFamille().indexOf(enveloppe));

		System.out.println(unMarchand.getStockFamille().size());

		// System.out.println("....");
		float sommeTotale = 0;
		float sommeAlim = 0;
		float sommeConso = 0;
		for (int i = 0; i < unMarchand.getStockFamille().size(); i++) {
			System.out.println(unMarchand.getStockFamille().get(i));
			// get: méthode de ArrayList
		}
		for (Produit produit : unMarchand.getStockFamille()) {
			// Au lieu du for qu'on utilise habituellement
			if (produit instanceof Alimentaire) {
				// On a remplacé stock.get(i) par produit
				sommeAlim += produit.getPrix();
			} else {
				sommeConso += produit.getPrix();
			}
		}

		sommeTotale = sommeAlim + sommeConso;
		System.out.println("Somme Alimentaire " + sommeAlim);
		System.out.println("Somme Consommable " + sommeConso);
		System.out.println("Somme Totale " + sommeTotale);
	}

	private void rajouteDansTreeMap(TreeMap<String, Produit> treeMap, Produit banane2) {
		Produit produit = treeMap.get(banane2.getNom());
		produit.rajoute(banane2);
	}
}