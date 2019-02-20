package main.java;

import javax.persistence.*;

@Entity
@Table(name="livre")
public class Livre {
	@Id
	private int id;
	
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre;
	
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;

	public Livre(){
		
	}
	
	/*public Livre(int id, String titre, String auteur){
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + this.getId() + ", nom : " + this.getTitre() + ", auteur : " + this.getAuteur();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
