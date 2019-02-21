package main.java.bibliotheque;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
	@Id
	private int id;
	
	@Column(name = "NOM", nullable = false)
	private String nom;
	
	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunts;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}
	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}
