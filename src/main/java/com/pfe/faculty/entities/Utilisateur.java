package com.pfe.faculty.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Utilisateur {
	
	/**
	 * Created by nsarvar on 1/10/18.
	 * MerchantUser DTO Object
	 */


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;

	    @Column(name = "username")
	    private String username;

	    @Email(message = "Please, provide a valid Email")
	    @Column(name = "email")
	    @EmailConstraint
	    private String email;

	    public Utilisateur() {
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	}
    
    
    


