package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private Integer age;

	@Embedded
	private Adresse adresse;

	public Personne(String nom, String prenom, Integer age, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	
		this.adresse = adresse;
	}
	
}
