package main.java.banque;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.java.interceptors.ConsolInterceptor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@EntityListeners({ConsolInterceptor.class})
@Table(name="operation")
public class Operation {
	@Id
	private int id;
	@Column
	private LocalDateTime date;
	@Column
	private double montant;
	@Column
	private String motif;
	@ManyToOne
	@JoinColumn(name="ID")
	private Compte compte;
	
	public Operation(){}
	
	public Operation(int id, LocalDateTime date, double montant, String motif, Compte compte){
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte = compte;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime localDateTime) {
		this.date = localDateTime;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
