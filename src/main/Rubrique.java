package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Rubrique {
	String valeur;
	String nom;
	LocalDate dateCreation;
	LocalDateTime dateDerniereModification;
	ArrayList<Rubrique> sousRubrique;
}
