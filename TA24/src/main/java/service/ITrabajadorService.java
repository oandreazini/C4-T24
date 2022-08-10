package service;

import java.util.List;

import dto.Trabajador;

public interface ITrabajadorService {
	
	//Metodos del CRUD
	public List<Trabajador> listarTrabajador(); //Listar All 
	
	public Trabajador guardarTrabajador(Trabajador trabajador);	//Guarda un trabajador CREATE
	
	public Trabajador trabajadorID(Long id); //Leer datos de un trabajador READ
	
	public List<Trabajador> listarTrabajadorNomnbre(String nombre);//Listar Trabajador por campo nombre
	
	public Trabajador actualizarTrabajador(Trabajador trabajador); //Actualiza datos del trabajador UPDATE
	
	public void eliminarTrabajador(Long id);// Elimina el trabajador DELETE
	

}
