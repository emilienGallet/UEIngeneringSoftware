package main;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SpecsDoc implements Serializable {
	private static final long serialVersionUID = 1762305108996587054L;
	String titre;
	Double version;
	String auteur;
	LocalDate date;
	ArrayList<Rubrique> listeRubrique;

	public SpecsDoc(String titre, double d, LocalDate date, String auteur) {
		this.titre =titre;
		this.version = d;
		this.auteur = auteur;
		this.date = date;
	}

	private void tableMatiere() {

	}

	public static void main(String[] args) {
		String auteur = "Émilien GALLET\nJérémy GOUTELLE\nMélanie EYRAUD\nChritian OKOUERET ELENGA";
		
		SpecsDoc spec = new SpecsDoc("Spécification d'exigence logicielles",1.0,LocalDate.now(),auteur);
	}
}
