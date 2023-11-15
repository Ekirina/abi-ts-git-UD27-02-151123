package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Asignado_a;

public interface IAsignado_aService {
	//Métodos del CRUD
	public List<Asignado_a> listarAsignado_a(); //Listar All 

	public Asignado_a guardarAsignado_a(Asignado_a asignado_a);	//Guarda 

	public Asignado_a asignado_aXID(int id); //Leer datos 

	public Asignado_a actualizarAsignado_a(Asignado_a asignado_a); //Actualiza datos 

	public void eliminarAsignado_a(int id);// Elimina datos
}
