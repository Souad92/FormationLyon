package sk.flux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Flux {

	public static void main(String[] args) {
		Flux flux = new Flux();
		flux.init();

	}

	public void init() {
		File rep = new File("C://DevFormation/Workspace/ProjetFlux/Donnee");
		System.out.println(rep.getAbsolutePath());
		File repCourant = new File("./");
		System.out.println(repCourant.getAbsolutePath());
		File re = new File("./Donnee/");
		System.out.println(re.isFile());
		System.out.println(re.getAbsolutePath() + " " + re.exists());
		if (re.isDirectory()) {
			System.out.println("---------------------");
			aff2(re);
			// aff3(re);

		}
	}

	public void aff1() {
		File re = new File("./Donnee/");
		File[] lf = re.listFiles();
		for (int i = 0; i < lf.length; i++) {
			if (!lf[i].isDirectory()) { // Ou: ls[i].isFile()
				System.out.println("fichier: " + lf[i].getName());
			} else {
				File monNouveauRep = lf[i];
				File[] ls2 = monNouveauRep.listFiles();
				for (int j = 0; j < ls2.length; j++) {
					if (ls2[j].isFile()) { // On peut aussi ecrire :
											// !ls2[j].isDirectory()
						System.out.println("fichier du rep: " + ls2[j].getName());
					}
				}
			}
		}
	}

	public void aff2(File re) {
		File[] lf = re.listFiles();
		for (int i = 0; i < lf.length; i++) {
			if (lf[i].isFile()) {
				System.out.println(lf[i].getAbsolutePath());
				if (lf[i].getAbsolutePath().toLowerCase().endsWith(".txt")) {
					System.out.println("uniquement avec .txt: " + lf[i].getAbsolutePath());
					// FileInputStream fi= new FileInputStream(lf[i]); //Pas
					// pour du texte
					FileReader fr = null;
					BufferedReader bIn = null;

					try {
						fr = new FileReader(lf[i]);// Reader: Pour du texte
						bIn = new BufferedReader(fr);
						String chaine = bIn.readLine();
						while (chaine != null) {
							System.out.println("????????? " + chaine);
							chaine = bIn.readLine();
						}
						// chaine = bIn.readLine();
						// String chaine2 = bIn.readLine();
						// System.out.println(chaine + chaine2);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							fr.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			} else {
				aff2(lf[i]);
			}
		}
	}

	public void aff3(File re) {
		String[] ls = re.list();
		for (int i = 0; i < ls.length; i++) {
			File file = new File(re.getAbsolutePath() + "/" + ls[i]);
			System.out.println(file.exists());
			if (file.isFile()) {
				System.out.println("++++++");
				System.out.println(file.getAbsolutePath());
			} else {
				aff3(file);
			}
		}
	}
}
