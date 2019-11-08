package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Personne {
	
	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDepasse;
	private Date dateNaissance;
	
	private List<Annonce> annonces = new ArrayList<Annonce>();
	

	public Personne(int personneId, String nom, String prenom, String login, String motDepasse, Date dateNaissance,
			List<Annonce> annonces) {
		super();
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDepasse = motDepasse;
		this.dateNaissance = dateNaissance;
		this.annonces = annonces;
	}
	
	public int getPersonneId() {
		return personneId;
	}
	public void setPersonneId(int personneId) {
		this.personneId = personneId;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDepasse() {
		return motDepasse;
	}
	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public List<Annonce> getAnnonces() {
		return annonces;
	}
	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}
	@Override
	public String toString() {
		return "Personne [personneId=" + personneId + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", motDepasse=" + motDepasse + ", dateNaissance=" + dateNaissance + ", annonces=" + annonces + "]";
	}
	
	
	

}
