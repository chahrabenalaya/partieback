package com.pfe.faculty.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dates")
public class DateSeance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long idDate;
	
	@Column(name = "dateD")
	public Date dateD;
	
	@Column(name = "dateF")
	public Date dateF;
	
	public DateSeance() {
		super();
	}


	public DateSeance( Date dateD, Date dateF) {
		super();
		this.dateD = dateD;
		this.dateF = dateF;
	}


	public long getIdDate() {
		return idDate;
	}


	public void setIdDate(long idDate) {
		this.idDate = idDate;
	}


	public Date getDateD() {
		return dateD;
	}


	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}


	public Date getDateF() {
		return dateF;
	}


	public void setDateF(Date dateF) {
		this.dateF = dateF;
	}


	@Override
	public String toString() {
		return "DateSeance [idDate=" + idDate + ", dateD=" + dateD + ", dateF=" + dateF + "]";
	}
	
	

}
