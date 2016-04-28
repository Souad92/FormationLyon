package sk.metier;

public class Experience {

	private int idExperience;
	private String dateExp;
	private String entreprise;
	private String poste;
	private String description;
	private Etudiant etudiant;

	public Experience() {
		dateExp = "";
		entreprise = "";
		poste = "";
		description = "";
	}

	

	public Experience(int idExperience, String dateExp, String entreprise, String poste,String description, Etudiant etudiant) {
		this.idExperience= idExperience;
		this.dateExp = dateExp;
		this.entreprise = entreprise;
		this.poste = poste;
		this.description = description;
		this.etudiant=etudiant; 
	}

	public Experience(int idExperience, String dateExp, String entreprise, String poste, Etudiant etudiant) {
		this.idExperience= idExperience;
		this.dateExp = dateExp;
		this.entreprise = entreprise;
		this.poste = poste;
		this.etudiant=etudiant; 
	}

	public String getDateExp() {
		return dateExp;
	}

	public void setDateExp(String dateExp) {
		this.dateExp = dateExp;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	
	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdExperience() {
		return idExperience;
	}

	public void setIdExperience(int idExperience) {
		this.idExperience = idExperience;
	}


}
