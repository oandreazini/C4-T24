package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ITrabajadorDAO;
import com.example.demo.dto.Trabajador;


@Service
public class TrabajadorServiceImpl implements ITrabajadorService{
	
	//Utilizamos los metodos de la interface ITrabajadorDAO, es como si instaciaramos.
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	@Override
	public List<Trabajador> listarTrabajador() {
		
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorID(Long id) {
		
		return iTrabajadorDAO.findById(id).get();
	}
	

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(Long id) {
		
		iTrabajadorDAO.deleteById(id);
		
	}

	@Override
	public List<Trabajador> listarTrabajadorNomnbre(String nombre) {
		
		return iTrabajadorDAO.findByNombre(nombre);
	}

}
