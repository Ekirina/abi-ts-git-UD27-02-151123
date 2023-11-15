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

import com.example.demo.dto.Asignado_a;
import com.example.demo.services.Asignado_aServiceImpl;

@RestController
@RequestMapping("/api")
public class Asignado_aController {
	@Autowired
	Asignado_aServiceImpl asignado_aServiceImpl;
	@GetMapping("/asignado_a")
	public List<Asignado_a> listarAsignado_a(){
		return asignado_aServiceImpl.listarAsignado_a();
	}
	
	
	@PostMapping("/asignado_a")
	public Asignado_a salvarAsignado_a(@RequestBody Asignado_a asignado_a) {
		
		return asignado_aServiceImpl.guardarAsignado_a(asignado_a);
	}
	
	
	@GetMapping("/asignado_a/{id}")
	public Asignado_a Asignado_aXID(@PathVariable(name="id") int id) {
		
		Asignado_a Asignado_a_xid= new Asignado_a();
		
		Asignado_a_xid=asignado_aServiceImpl.asignado_aXID(id);
		
		System.out.println("Asignado XID: "+Asignado_a_xid);
		
		return Asignado_a_xid;
	}
	
	@PutMapping("/asignado_a/{id}")
	public Asignado_a actualizarAsignado_a(@PathVariable(name="id")int id,@RequestBody Asignado_a asignado_a) {
		
		Asignado_a Asignado_a_seleccionado= new Asignado_a();
		Asignado_a Asignado_a_actualizado= new Asignado_a();
		
		Asignado_a_seleccionado= asignado_aServiceImpl.asignado_aXID(id);
		
		
		Asignado_a_seleccionado.setCientificos(asignado_a.getCientificos());
		Asignado_a_seleccionado.setProyecto(asignado_a.getProyecto());
		
		Asignado_a_actualizado = asignado_aServiceImpl.actualizarAsignado_a(Asignado_a_seleccionado);
		
		System.out.println("El asignado actualizado es: "+ Asignado_a_actualizado);
		
		return Asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{id}")
	public void eliminarAsignado_a(@PathVariable(name="id")int id) {
		asignado_aServiceImpl.eliminarAsignado_a(id);
	}
}
