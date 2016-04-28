package sk.flux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;

public class FluxEntree {
	public static void main(String[] args) {
		FluxEntree f = new FluxEntree();
		f.init();
	}

	public void init() {
		InputStreamReader entreeStandard = new InputStreamReader(System.in);
		// system in: peripherique d'entree (on peut ecrire dans la console)
		// InputStreamReader: Transforme un flux d'entree binaire en flux de
		// caracteres
		LineNumberReader resLecture = new LineNumberReader(entreeStandard);
		// LineNumberReader: Nous donne des méthodes interessantes: ex:readLine
		String chemin = null;
		PrintWriter out = null;
		try {
			chemin = resLecture.readLine();

			File file = new File(chemin);
			String nomFichierDestinataire = "test.txt";
			File resultat = new File("./" + nomFichierDestinataire);
			System.out.println(resultat.getAbsolutePath());
			out = new PrintWriter(resultat);

			// if (chemin.startsWith(".")) {
			// System.out.println("C'est un chemin relatif");
			// } else {
			// System.out.println("C'est un chemin absolu");
			// }
			if (file.exists()) {
				if (file.isDirectory()) {
					System.out.println(file.getAbsolutePath());
					System.out.println("C'est un repertoire et il existe, je peux commencer ma recherche");
					String nomDuSuffixe = resLecture.readLine();
					System.out.println(nomDuSuffixe);
					rechercherLesFichiers(chemin, nomDuSuffixe, out);
				} else {
					System.out.println("C'est un fichier, je ne peux pas commencer mon programme (Erreur)");
				}
			} else {
				System.out.println("Le repertoire ou fichier n'existe pas, je ne peux pas commencer");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		out.close();
	}

	private void rechercherLesFichiers(String chemin, String nomDuSuffixe, PrintWriter out) {
		File file = new File(chemin);
		File[] tabFichier = file.listFiles();
		for (File f : tabFichier) {
			if (f.isDirectory()) {
				rechercherLesFichiers(f.getAbsolutePath(), nomDuSuffixe, out);
			} else {
				if (f.getName().toLowerCase().endsWith(nomDuSuffixe.toLowerCase())) {
					System.out.println("J'ai trouvé ce fichier " + f.getName());
					FileReader reader = null;
					BufferedReader buf = null;
					try {
						reader = new FileReader(f);
						buf = new BufferedReader(reader);
						String chaine = buf.readLine();
						while (chaine != null) {
							mettreLigneDansLeFichierDestinataire(chaine, out);
							chaine = buf.readLine();
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
					out.flush(); // Permet l'envoi des donnees vers le disque
									// dur
				}
			}
		}
	}

	private void mettreLigneDansLeFichierDestinataire(String readLine, PrintWriter out) {
		out.println(readLine);

	}
}
