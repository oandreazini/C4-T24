package com.example.demo.controller;

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

import com.example.demo.dto.Trabajador;
import com.example.demo.service.TrabajadorServiceImpl;




@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServideImpl;
	
	@GetMapping("/trabajadores")
	public List<Trabajador> listarTrabajador(){
		return trabajadorServideImpl.listarTrabajador();
	}
	
	//listar Trabajadores por campo nombre
	@GetMapping("/trabajadores/nombre/{nombre}")
	public List<Trabajador> listarTrabajadorNombre(@PathVariable(name="nombre") String nombre) {
	    return trabajadorServideImpl.listarTrabajadorNomnbre(nombre);
	}
	
	
	@PostMapping("/trabajadores")
	public Trabajador guardarTrabajador(@RequestBody Trabajador trabajador) {
		Trabajador trabajador_id= new Trabajador(trabajador.getNombre(), trabajador.getTrabajador());
		
		return trabajadorServideImpl.guardarTrabajador(trabajador_id);
	}
	
	
	@GetMapping("/trabajadores/{id}")
	public Trabajador trabajadorID(@PathVariable(name="id") Long id) {
		
		Trabajador trabajador_id= new Trabajador();
		
		trabajador_id=trabajadorServideImpl.trabajadorID(id);
		
		System.out.println("Trabajador ID: "+trabajador_id);
		
		return trabajador_id;
	}
	
	@PutMapping("/trabajadores/{id}")
	public Trabajador actualizarTrabajador(@PathVariable(name="id")Long id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado;
		Trabajador trabajador_actualizado;
		
		trabajador_seleccionado= trabajadorServideImpl.trabajadorID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajador(trabajador.getTrabajador());
	
		
		trabajador_actualizado = trabajadorServideImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajadores/{id}")
	public void eliminarTrabajador(@PathVariable(name="id")Long id) {
		trabajadorServideImpl.eliminarTrabajador(id);
	}

}
