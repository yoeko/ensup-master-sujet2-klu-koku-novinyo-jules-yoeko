package presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		
		Iservice service = new ServiceImpl();
		
		List<Personne> list = new ArrayList<Personne>();
		
		Personne personne1 =  new Personne(2, "koffi", "komla", "kkk", "ksdjdjd", new Date(), null);
		Personne personne2 =  new Personne(2, "kokou", "kekema", "pass", "ksdjdjd", new Date(), null);
		Personne personne3 =  new Personne(3, "koffi", "komla", "kkk", "ksdjdjd", new Date(), null);
				
		//test methode creerPersonne
		service.creerPersonne(list, personne1);
		service.creerPersonne(list, personne3);
		System.out.println(list);
		
		//test methode getPersonne
//		System.out.println(service.getPersonne(list, 2));
		
		//test methode deletePersonne
//		service.deletePersonne(list, 1);
		
		//test methode updatePersonne
//		service.updatePersonne(list, personne2, "jean", "dubois", new Date());
		
		
		
	}

}
