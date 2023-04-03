package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classes")
public class Classe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idClasse ;
	
	@Column(name = "nomClasse")
	public String nomClasse ;
	
	
	public Classe() {
		super();
	}
	
	public Classe(String nomClasse) {
		super();
		this.nomClasse = nomClasse;
	}


	public long getIdClasse() {
		return idClasse;
	}
	public void setIdClasse(long idClasse) {
		this.idClasse = idClasse;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	@Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", nomClasse=" + nomClasse + "]";
	}
	
	
	
	

}
