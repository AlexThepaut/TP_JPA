package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import main.java.banque.Adresse;
import main.java.banque.AssuranceVie;
import main.java.banque.Banque;
import main.java.banque.Client;
import main.java.banque.Compte;
import main.java.banque.LivretA;
import main.java.banque.Virement;

public class AppBanque_Jpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Client client = new Client();

		Adresse adresse = new Adresse();
		adresse.setCodePostal(66666);
		adresse.setNumero(42);
		adresse.setRue("Jacques Chirac");
		adresse.setVille("Vichy");

		client.setAdresse(adresse);
		client.setDateNaissance(LocalDate.of(1989, Month.APRIL, 17));
		client.setNom("THEP");
		client.setPrenom("Alex");

		Banque banque = new Banque();
		banque.setNom("Voleur");

		client.setBanque(banque);

		LivretA livretA = new LivretA();
		livretA.setNumero("1324");
		livretA.setSolde(1000.0);
		livretA.setTaux(1.5);
		
		AssuranceVie assuranceVie = new AssuranceVie();
		assuranceVie.setNumero("1562");
		assuranceVie.setSolde(1000.0);
		assuranceVie.setTaux(2.5);
		assuranceVie.setDateDeFin(LocalDate.of(2050, Month.MARCH, 3));
		
		List<Client> clients = new ArrayList<Client>();
		clients.add(client);
		livretA.setClient(clients);
		assuranceVie.setClient(clients);

		Virement operation1 = new Virement();
		operation1.setCompte(livretA);
		operation1.setDate(LocalDateTime.now());
		operation1.setMontant(11.0);
		operation1.setMotif("Achat Pizza");	
		operation1.setBeneficiaire("Pizza Hut");
		
		Virement operation2 = new Virement();
		operation2.setCompte(livretA);
		operation2.setDate(LocalDateTime.now());
		operation2.setMontant(11.5);
		operation2.setMotif("Achat encore une Pizza");
		operation2.setBeneficiaire("Pizzeria Rialto");

		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(livretA);
		comptes.add(assuranceVie);

		client.setComptes(comptes);

		EntityTransaction transaction1 = em.getTransaction();
		transaction1.begin();
		
		em.persist(client);
		em.persist(operation1);
		em.persist(operation2);
		em.persist(livretA);
		em.persist(assuranceVie);
		em.persist(banque);

		transaction1.commit();
		
		et.commit();
	}
}
