package sk.metier;

public class Competence {
	private int idCompetence;
	private String type;
	private String detail;
	private String niveau;
	private Etudiant etudiant;

	public Competence() {
		type = "";
		detail = "";
		niveau = "";
	}

	public Competence(int idCompetence, String type, String detail,String niveau, Etudiant etudiant) {
		this.idCompetence=idCompetence; 
		this.type = type;
		this.detail = detail;
		this.niveau = niveau;
		this.etudiant=etudiant; 
	}

	

	public int getIdCompetence() {
		return idCompetence;
	}

	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

}
