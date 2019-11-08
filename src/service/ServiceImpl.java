package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Annonce;
import metier.Personne;

public class ServiceImpl implements Iservice {
	
	public static List<Personne> base = new ArrayList<Personne>();

	@Override
	public int creerPersonne(List<Personne> list, Personne personne) {
		if (list.add(personne)) {
			return 1;
		}	
		return 0;
	}

	@Override
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for (Personne personne : list) {
			if (personne.getPersonneId()==idPersonne) {
				return personne;
			}
		}
		return null;
	}

	@Override
	public void deletePersonne(List<Personne> list, int idPersonne) {
		for (Personne personne : list) {
			if (personne.getPersonneId()==idPersonne) {
				list.remove(personne);
				break;
			}
		}
	}

	@Override
	public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, Date dateNaissance) {
		for (Personne personne : list) {
			if (personne.getPersonneId()==p.getPersonneId()) {
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setDateNaissance(dateNaissance);
				break;
			}
		}

	}

	@Override
	public List<Personne> findAllPersonnes() {
		return (List<Personne>)base;
	}

	@Override
	public int getPersonneId(List<Personne> list, Personne p) {
		for (Personne personne : list) {
			if (personne.getPersonneId()==p.getPersonneId()) {
				return personne.getPersonneId();
			}
		}
		return 0;
	}

	@Override
	public void affichePersonnes() {
		System.out.println(base);
	}

	@Override
	public void afficheAnnoncesPersonne(Personne p) {
		p.getAnnonces();

	}

	@Override
	public int creerAnnonce(Personne personne, Annonce a) {
		Annonce annonce = new Annonce();
		annonce.setIdAnnonce(a.getIdAnnonce());
		annonce.setPersonneId(personne.getPersonneId());
		annonce.setIntitule(a.getIntitule());
		annonce.setPrix(a.getPrix());
		annonce.setDetails(a.getDetails());
		return 1;
	}

	@Override
	public Annonce getAnnonce(Personne personne, int idAnnonce) {
		return null;
	}

	@Override
	public void deleteAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Annonce> findAllAnnonce(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

}
