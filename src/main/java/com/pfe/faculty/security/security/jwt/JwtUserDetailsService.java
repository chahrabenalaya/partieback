package com.pfe.faculty.security.security.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pfe.faculty.entities.Utilisateur;
import com.pfe.faculty.repository.AuthoritiesRepository;
import com.pfe.faculty.repository.UtilisateurRepository;
import com.pfe.faculty.service.UserService;

@Service
public class JwtUserDetailsService implements UserDetailsService {

@Autowired
UtilisateurRepository userrepos ;
@Autowired
private UserService userService;

@Override
public UserDetails loadUserByUsername(String email) throws
UsernameNotFoundException {
if (email.trim().isEmpty()) {
throw new UsernameNotFoundException("username is empty");
}

Utilisateur user =userrepos.findByEmail(email);
// User user = userService.findByEmail(email);

if (user == null) {
throw new UsernameNotFoundException("User with email = " + email + " notfound");
}

return new org.springframework.security.core.userdetails.User(user.getEmail(),
user.getPassword(), getGrantedAuthorities(user));}
@Autowired
AuthoritiesRepository authrepos ;

private List<GrantedAuthority> getGrantedAuthorities(Utilisateur user) {
List<GrantedAuthority> authorities = new ArrayList<>();

AuthoritiesRepository auth = this.authrepos.findByName(user.getProfil());
authorities.add(new SimpleGrantedAuthority(auth.getDescription()));

return authorities; }

public UserService getUserService() {
	return userService;
}

public void setUserService(UserService userService) {
	this.userService = userService;
}
}
