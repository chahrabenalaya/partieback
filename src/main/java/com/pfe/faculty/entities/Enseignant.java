package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "enseignants")
public class Enseignant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cinP;
	
	
	@Column(name = "emailP")
	private String emailP;
	
	@Column(name = "nomP")
	private String nomP;
	
	@Column(name = "prenomP")
	private String prenomP;
	
	public Enseignant() {
		super();
	}
	public Enseignant(long cinP, String emailP, String nomP, String prenomP) {
		super();
		this.cinP = cinP;
		this.emailP = emailP;
		this.nomP = nomP;
		this.prenomP = prenomP;
	}
	public long getCinP() {
		return cinP;
	}
	public void setCinP(long cinP) {
		this.cinP = cinP;
	}
	public String getEmailP() {
		return emailP;
	}
	public void setEmailP(String emailP) {
		this.emailP = emailP;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getPrenomP() {
		return prenomP;
	}
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}
	@Override
	public String toString() {
		return "Enseignant [cinP=" + cinP + ", emailP=" + emailP + ", nomP=" + nomP + ", prenomP=" + prenomP + "]";
	}
	
	
	
	

}
