package org.sid.avito.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	private String designation;
	private String description;
	private double prix;
	@ManyToOne
	private SousCategorie sousCategorie;
	@OneToMany
	private Collection<Photo> photos;

}
