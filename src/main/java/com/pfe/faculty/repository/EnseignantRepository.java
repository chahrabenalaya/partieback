package com.pfe.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.faculty.entities.Enseignant;


public interface EnseignantRepository extends JpaRepository <Enseignant , Long>{

}
