package com.pfe.faculty.repository;

import com.pfe.faculty.security.security.jwt.Utilisateur;

public interface UtilisateurRepository {

	Utilisateur findByEmail(String email);

}
