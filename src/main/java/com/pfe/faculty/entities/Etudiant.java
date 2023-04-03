package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etudiants")
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cinEtu;
	
	@Column(name = "emailEtu")
	private String emailEtu;
	
	@Column(name = "nomEtu")
	private String nomEtu;
	
	@Column(name = "prenomEtu")
	private String prenomEtu;
	
	
	public Etudiant() {
		super();
	}
	
	
	public Etudiant(long cinEtu, String emailEtu, String nomEtu, String prenomEtu) {
		super();
		this.cinEtu = cinEtu;
		this.emailEtu = emailEtu;
		this.nomEtu = nomEtu;
		this.prenomEtu = prenomEtu;
	}


	public long getCinEtu() {
		return cinEtu;
	}
	public void setCinEtu(long cinEtu) {
		this.cinEtu = cinEtu;
	}
	public String getEmailEtu() {
		return emailEtu;
	}
	public void setEmailEtu(String emailEtu) {
		this.emailEtu = emailEtu;
	}
	public String getNomEtu() {
		return nomEtu;
	}
	public void setNomEtu(String nomEtu) {
		this.nomEtu = nomEtu;
	}
	public String getPrenomEtu() {
		return prenomEtu;
	}
	public void setPrenomEtu(String prenomEtu) {
		this.prenomEtu = prenomEtu;
	}


	@Override
	public String toString() {
		return "Etudiant [cinEtu=" + cinEtu + ", emailEtu=" + emailEtu + ", nomEtu=" + nomEtu + ", prenomEtu="
				+ prenomEtu + "]";
	}




}
