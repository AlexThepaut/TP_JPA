package main.java.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import main.java.interceptors.ConsolInterceptor;

@Entity
@EntityListeners({ConsolInterceptor.class})
@Table(name="Banque")
public class Banque {
	@Id
	private int id;
	@Column
	private String nom;
	@OneToMany(mappedBy="banque")
	private List<Client> clients;

	public Banque(){}
	
	public Banque(int id, String nom, List<Client> clients){
		this.id = id;
		this.nom = nom;
		this.setClients(clients);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
}
