package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	//Listar trabajadores por campo nombre
		public List<Trabajador> findByNombre(String nombre);
		
		//public List<Trabajador> buscarTrabajador(String trabajador);
}
