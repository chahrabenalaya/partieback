package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Module {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idM ;
	
	@Column(name = "nomM")
	public String nomM ;

	
	public Module() {
		super();
	}
	public Module(long idM, String nomM) {
		super();
		this.idM = idM;
		this.nomM = nomM;
	}
	public long getIdM() {
		return idM;
	}
	public void setIdM(long idM) {
		this.idM = idM;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	@Override
	public String toString() {
		return "Module [idM=" + idM + ", nomM=" + nomM + "]";
	}
	
	

}
