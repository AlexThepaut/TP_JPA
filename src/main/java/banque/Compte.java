package main.java.banque;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import main.java.interceptors.ConsolInterceptor;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@EntityListeners({ConsolInterceptor.class})
@Table(name="compte")
public class Compte {
	@Id
	private int id;
	@Column
	private String numero;
	@Column
	private double solde;
	@ManyToMany(mappedBy="comptes")
	private List<Client> clients;
	@OneToMany(mappedBy="compte")
	private List<Operation> operations;
	
	public Compte(){}
	
	public Compte(int id, String numero, double solde, List<Client> clients, List<Operation> operations){
		this.id = id;
		this.numero = numero;
		this.clients = clients;
		this.operations = operations;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return getClient();
	}
	public void setClient(List<Client> client) {
		this.clients = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
