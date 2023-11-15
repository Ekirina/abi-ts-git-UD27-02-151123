package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyectos {
	@Id
	private String id;
	@Column(name="nombre")
	private String nombre;
	@Column (name = "horas")
	private int horas;
	
	public Proyectos() {
	}
	
	public Proyectos(String id, String nombre, int horas) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}
	//Getters y setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	//Método String

	@Override
	public String toString() {
		return "Proyectos [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
}
