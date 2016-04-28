package sk.metier;

import java.util.ArrayList;

public class ListeFormation extends ArrayList<Formation> {
	
	private ListeEtudiant listeEtudiant;

	
	
	public ListeFormation() {
		ListeEtudiant listeEtudiant = new ListeEtudiant();
		
	}

	public ListeFormation(ListeEtudiant listeEtudiant) {
		this.listeEtudiant = listeEtudiant;
	}
}