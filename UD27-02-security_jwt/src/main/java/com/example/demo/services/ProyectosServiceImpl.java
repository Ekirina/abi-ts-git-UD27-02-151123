package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectosDAO;
import com.example.demo.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService {
	@Autowired
	IProyectosDAO iProyectosDAO;
	

	@Override
	public List<Proyectos> listarProyectos() {
		return iProyectosDAO.findAll();

	}

	@Override
	public Proyectos guardarProyectos(Proyectos proyectos) {
		return iProyectosDAO.save(proyectos);

	}

	@Override
	public Proyectos proyectosXID(String id) {
		return iProyectosDAO.findById(id).get();

	}

	@Override
	public Proyectos actualizarProyectos(Proyectos proyectos) {
		return iProyectosDAO.save(proyectos);

	}

	@Override
	public void eliminarProyectos(String id) {
		iProyectosDAO.deleteById(id);		
		
	}

}
