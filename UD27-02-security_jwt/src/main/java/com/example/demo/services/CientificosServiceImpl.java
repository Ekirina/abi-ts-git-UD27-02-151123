package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{
	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listarPiezas() {
		return iCientificosDAO.findAll();

	}

	@Override
	public Cientificos guardarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);

	}

	@Override
	public Cientificos cientificosXDNI(String dni) {
		return iCientificosDAO.findById(dni).get();

	}

	@Override
	public Cientificos actualizarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);

	}

	@Override
	public void eliminarCientificos(String dni) {
		iCientificosDAO.deleteById(dni);		
		
	}
	

}
