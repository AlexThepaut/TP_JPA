package main.java;

import java.util.List;

import javax.persistence.*;

import main.java.bibliotheque.Client;
import main.java.bibliotheque.Emprunt;
import main.java.bibliotheque.Livre;


public class Test_Jpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testjpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Livre livre = em.find(Livre.class, 1);
		if(livre != null){
			System.out.println(livre.toString());			
		}
		
		Query query = em.createQuery("select l from Livre l where l.titre=:reference");
		String nomATrouver = "Guerre et paix";
		query.setParameter("reference", nomATrouver);
		Livre livreTrouve = (Livre) query.getSingleResult();
		System.out.println(livreTrouve.toString());
		
		System.out.println("");
		System.out.println("Livres : ");
		Emprunt emprunt = em.find(Emprunt.class, 2);
		for (Livre livreTemp : emprunt.getLivres()) {
			if(livreTemp != null){
				System.out.println(livreTemp.toString());				
			}
		}
		
		Query query2 = em.createQuery("select e from Emprunt e where e.id=:reference");
		query2.setParameter("reference", 3);
		List <Emprunt> empruntTrouve = query2.getResultList();
		System.out.println(empruntTrouve.toString());
		
		System.out.println("");
		System.out.println("Commande : ");
		Client client = em.find(Client.class,3);
		for (Emprunt empruntTemp : client.getEmprunts()) {
			if(empruntTemp != null){
				System.out.println(empruntTemp.toString());				
			}
		}
		em.close();*/
	}
}
