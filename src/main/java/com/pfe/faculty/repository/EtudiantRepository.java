package com.pfe.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.faculty.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository <Etudiant , Long>{

}
