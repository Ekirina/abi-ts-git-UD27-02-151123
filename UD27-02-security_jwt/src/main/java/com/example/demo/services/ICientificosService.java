package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificosService {
public List<Cientificos> listarPiezas(); //Listar All 
	
	public Cientificos guardarCientificos(Cientificos cientificos);	//Guarda 
	
	public Cientificos cientificosXDNI(String dni); //Leer datos 
	
	public Cientificos actualizarCientificos(Cientificos cientificos); //Actualiza datos 
	
	public void eliminarCientificos(String dni);// Elimina datos
}
