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

import com.example.demo.dto.Cientificos;
import com.example.demo.services.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarPiezas();
	}
	@PostMapping("/cientificos")
	public Cientificos salvarCientificos(@RequestBody Cientificos cientificos) {

		return cientificosServiceImpl.guardarCientificos(cientificos);
	}
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificosXID(@PathVariable(name="dni")String dni) {
		Cientificos Cientificos_xdni = new Cientificos();
		Cientificos_xdni = cientificosServiceImpl.cientificosXDNI(dni);
		System.out.println("Cientificos XID: "+Cientificos_xdni);
		return Cientificos_xdni;
	}
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni, @RequestBody Cientificos cientificos) {
		Cientificos Cientificos_seleccionado= new Cientificos();
		Cientificos Cientificos_actualizado= new Cientificos();

		Cientificos_seleccionado= cientificosServiceImpl.cientificosXDNI(dni);

		Cientificos_seleccionado.setNom_apels(cientificos.getNom_apels());

		Cientificos_actualizado = cientificosServiceImpl.actualizarCientificos(Cientificos_seleccionado);

		System.out.println("El cientifico actualizado es: "+ Cientificos_actualizado);

		return Cientificos_actualizado;
	}
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name="dni")String dni) {
		cientificosServiceImpl.eliminarCientificos(dni);
	}
}

