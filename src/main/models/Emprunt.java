package main.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="emprunt")
public class Emprunt {
	@Id
	private int id;
	
	@Column(name = "DATE_DEBUT", nullable = false)
	private LocalDate dateDebut;
	
	@Column(name = "DATE_FIN", nullable = false)
	private LocalDate dateFin;
	
	@Column(name = "DELAI", nullable = false)
	private int delai;
	
	@ManyToOne
	@JoinColumn(name="ID")
	private Client client;
	
	@ManyToMany
	@JoinTable(name="emprunt_livre",
		joinColumns = @JoinColumn(name="ID_EMPRUNT",referencedColumnName="ID"),
		inverseJoinColumns = @JoinColumn(name="ID_LIVRE", referencedColumnName="ID"))
	private Set<Livre> livres;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public int getDelai() {
		return delai;
	}
	public void setDelai(int delai) {
		this.delai = delai;
	}
	public Client getIdClient() {
		return client;
	}
	public void setIdClient(Client client) {
		this.client = client;
	}
	public Set<Livre> getLivres() {
		return livres;
	}
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}
}
