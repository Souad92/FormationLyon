package sk.metier;

public class Etudiant {

	private String nom;
	private String prenom;
	private String metier;
	private String email;
	private int idEtudiant; 
	ListeCompetence listeCompetence; 
	ListeFormationScolaire listeFormationScolaire; 
	ListeExperience listeExperience; 

	
	public Etudiant(String nom, String prenom, String metier, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.metier = metier;
		this.email = email;
		
		listeCompetence= new ListeCompetence(); 
		listeFormationScolaire = new ListeFormationScolaire(); 
		listeExperience= new ListeExperience(); 
		
	}

	public Etudiant(int idEtudiant, String nom, String prenom, String mail, String metier) {
		this.idEtudiant=idEtudiant; 
		this.nom = nom;
		this.prenom = prenom;
		this.metier = metier;
		this.email = mail;
		listeCompetence= new ListeCompetence(); 
		listeFormationScolaire = new ListeFormationScolaire(); 
		listeExperience= new ListeExperience(); 
	}

	public ListeCompetence getListeCompetence() {
		return listeCompetence;
	}

	public void setListeCompetence(ListeCompetence listeCompetence) {
		this.listeCompetence = listeCompetence;
	}

	public ListeFormationScolaire getListeFormationScolaire() {
		return listeFormationScolaire;
	}

	public void setListeFormationScolaire(ListeFormationScolaire listeFormationScolaire) {
		this.listeFormationScolaire = listeFormationScolaire;
	}

	public ListeExperience getListeExperience() {
		return listeExperience;
	}

	public void setListeExperience(ListeExperience listeExperience) {
		this.listeExperience = listeExperience;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

}
