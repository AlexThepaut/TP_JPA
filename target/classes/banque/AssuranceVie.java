package main.java.banque;

import java.time.LocalDate;

public class AssuranceVie extends Compte {
	private LocalDate dateDeFin;
	private double taux;

	public LocalDate getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(LocalDate dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
}
