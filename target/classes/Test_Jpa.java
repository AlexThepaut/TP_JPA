package main.java;

import javax.persistence.*;

import main.models.*;

public class Test_Jpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testjpa");
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
		
		Emprunt emprunt = em.find(Emprunt.class, 2);
		/*for (Livre livreTemp : emprunt.getLivres()) {
			System.out.println(livreTemp.toString());
		}*/
	}
}
