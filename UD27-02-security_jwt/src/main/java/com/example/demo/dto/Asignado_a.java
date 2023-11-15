package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "asignado_a")
public class Asignado_a {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name="dni_cientifico")
	Cientificos cientificos;
	
	@ManyToOne
	@JoinColumn(name = "id_proyecto")
	Proyectos proyecto;
	
	//Constructores
	public Asignado_a() {
		
	}

	public Asignado_a(int id, Cientificos cientificos, Proyectos proyecto) {
		//super();
		this.id = id;
		this.cientificos = cientificos;
		this.proyecto = proyecto;
	}

	
	
	//Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientificos getCientificos() {
		return cientificos;
	}

	public void setCientificos(Cientificos cientificos) {
		this.cientificos = cientificos;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}
	
	//Método String
	
	@Override
	public String toString() {
		return "Asignado_a [id=" + id + ", cientificos=" + cientificos + ", proyecto=" + proyecto + "]";
	}
	
}
