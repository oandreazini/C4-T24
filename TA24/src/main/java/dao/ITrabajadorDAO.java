package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Long>{
	
	//Listar clientes or campo nombre
		public List<Trabajador> findByNombre(String nombre);
}
