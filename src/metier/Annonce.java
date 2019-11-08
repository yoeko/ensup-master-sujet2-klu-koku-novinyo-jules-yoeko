package metier;

public class Annonce {
	
	private int idAnnonce;
	private int personneId;
	private String intitule;
	private String details;
	private float prix;
	
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public int getPersonneId() {
		return personneId;
	}
	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", personneId=" + personneId + ", intitule=" + intitule
				+ ", details=" + details + ", prix=" + prix + "]";
	}
	
	

}
