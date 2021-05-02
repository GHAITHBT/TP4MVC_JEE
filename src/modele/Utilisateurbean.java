package modele;

public class Utilisateurbean {
	private String nom;
	private String prenom;
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
	public Utilisateurbean(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

}
