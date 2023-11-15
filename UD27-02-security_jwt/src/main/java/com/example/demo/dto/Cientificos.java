package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientificos {
	//Atributos de piezas
	@Id
	private String dni;
	@Column(name="nom_apels")
	private String nom_apels;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Asignado_a> asignado_a;
	
	//Constructores
	public Cientificos() {
		
	}

	public Cientificos(String dni, String nom_apels, List<Asignado_a> asignado_a) {
		//super();
		this.dni = dni;
		this.nom_apels = nom_apels;
		this.asignado_a = asignado_a;
	}
	
	//Getters y Setters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_a")
	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	
	//Método String
	@Override
	public String toString() {
		return "Cientificos [dni=" + dni + ", nom_apels=" + nom_apels + "]";
	}

}
