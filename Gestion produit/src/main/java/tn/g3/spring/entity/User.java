package tn.g3.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tn.g3.spring.entity.Role;

@Entity
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Long id ;
	 private String nom ;
	 private String prenom ;
	
	 private String email;
	 private String password;

	 
	 
	 @Enumerated(EnumType.STRING)
	 Role role;
	 
	 @Temporal(TemporalType.DATE)
	 private Date dateNaissance;

	 private boolean actif;
	 
	 


	

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public User(Long id, String nom, String prenom, String email, String password, Role role, Date dateNaissance,
			boolean actif) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role = role;
		this.dateNaissance = dateNaissance;
		this.actif = actif;
	}

	public User(String nom, String prenom, String email, String password, Role role, Date dateNaissance,
			boolean actif) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role = role;
		this.dateNaissance = dateNaissance;
		this.actif = actif;
	}

	public User(String nom, String prenom, String email, String password, boolean actif, Role role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role = role;
		this.actif = actif;
	}
	
	public User(long id, String nom, String prenom, String email, String password, boolean actif, Role role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.role = role;
		this.actif = actif;
	}


	public User() {
		super();
	}
 
	 
	
}






