package com.howtodoinjava.demo.model;

import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@Embeddable
@AllArgsConstructor
public class Adresse {
	private String rue;
	private String codePostal;
	private String ville;

}
