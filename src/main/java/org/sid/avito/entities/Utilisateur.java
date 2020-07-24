package org.sid.avito.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString


public class Utilisateur implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String telephone;
	private String photo;
	@ManyToOne
	private TypeUtl typeUtl;
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "idCompte", referencedColumnName = "idCompte")
	private Compte compte;
	

}
