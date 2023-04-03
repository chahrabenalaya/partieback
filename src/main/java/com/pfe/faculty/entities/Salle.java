package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salles")
public class Salle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idS ;
	
	@Column(name = "numS")
	public int numS ;
	
	
	public Salle() {
		super();
	}
	
	public Salle(int numS) {
		super();
		this.numS = numS;
	}

	public long getIdS() {
		return idS;
	}
	public void setIdS(long idS) {
		this.idS = idS;
	}
	public int getNumS() {
		return numS;
	}
	public void setNumS(int numS) {
		this.numS = numS;
	}

	@Override
	public String toString() {
		return "Classe [idS=" + idS + ", numS=" + numS + "]";
	}
	


}
