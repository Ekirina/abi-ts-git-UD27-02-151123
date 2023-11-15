package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Proyectos;

public interface IProyectosService {
public List<Proyectos> listarProyectos(); //Listar All 
	
	public Proyectos guardarProyectos(Proyectos proyectos);	//Guarda 
	
	public Proyectos proyectosXID(String id); //Leer datos 
	
	public Proyectos actualizarProyectos(Proyectos proyectos); //Actualiza datos 
	
	public void eliminarProyectos(String id);// Elimina datos
}
