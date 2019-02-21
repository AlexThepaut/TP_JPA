package main.java.banque;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.interceptors.ConsolInterceptor;

@Entity
@EntityListeners({ConsolInterceptor.class})
@Table(name="client")
public class Client {
	@Id
	private int id;
	
	@Column
	private String nom;
	@Column
	private String prenom;
	@Embedded private Adresse adresse;
	@Column
	private LocalDate dateNaissance;
	@ManyToOne
	@JoinColumn(name="ID")
	private Banque banque;
	@ManyToMany()
	@JoinTable(name="Client_Compte",
		joinColumns = @JoinColumn(name="ID_Cli",referencedColumnName="ID"),
		inverseJoinColumns = @JoinColumn(name="ID_Ban", referencedColumnName="ID"))
	private List<Compte> comptes;
	
	public Client(){}
	
	public Client(int id, String nom, String prenom, LocalDate dateNaissace, Banque banques, List<Compte> comptes, Adresse adresse){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissace;
		this.banque = banques;
		this.setComptes(comptes);
		this.adresse = adresse;
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
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
}
