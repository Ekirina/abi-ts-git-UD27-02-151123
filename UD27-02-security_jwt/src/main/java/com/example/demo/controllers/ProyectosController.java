package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Proyectos;
import com.example.demo.services.ProyectosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectosController {
	@Autowired
	ProyectosServiceImpl proyectosServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyectos> listarProveedores(){
		return proyectosServiceImpl.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Proyectos salvarProyectos(@RequestBody Proyectos proyectos) {
		
		return proyectosServiceImpl.guardarProyectos(proyectos);
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyectos ProyectosXID(@PathVariable(name="id") String id) {
		
		Proyectos Proyectos_xid= new Proyectos();
		
		Proyectos_xid=proyectosServiceImpl.proyectosXID(id);
		
		System.out.println("Proyectos XID: "+Proyectos_xid);
		
		return Proyectos_xid;
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyectos(@PathVariable(name="id")String id,@RequestBody Proyectos proyectos) {
		
		Proyectos Proyectos_seleccionado= new Proyectos();
		Proyectos Proyectos_actualizado= new Proyectos();
		
		Proyectos_seleccionado= proyectosServiceImpl.proyectosXID(id);
		
		Proyectos_seleccionado.setNombre(proyectos.getNombre());
		Proyectos_seleccionado.setHoras(proyectos.getHoras());
		
		Proyectos_actualizado = proyectosServiceImpl.actualizarProyectos(Proyectos_seleccionado);
		
		System.out.println("El proyecto actualizado es: "+ Proyectos_actualizado);
		
		return Proyectos_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyectos(@PathVariable(name="id")String id) {
		proyectosServiceImpl.eliminarProyectos(id);
	}
}
