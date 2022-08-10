package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;

	@Entity
	@Table(name="trabajador")//en caso que la tabala sea diferente
	public class Trabajador {
		//Atributos de entidad trabajador
		//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")
		private String nombre;
		@Enumerated(EnumType.STRING)
	    @Column(name="trabajador")
	    private ResourceType trabajador;
	    public enum ResourceType {
	    	programador, deveops, analista
	    }
	    @Column(name = "salario")
	    private Double salario;
	    
	    
	    //Constructores
	
		public Trabajador() {
			
		}
		/**
		 * 
		 * @param id
		 * @param nombre
		 * @param trabajador
		 * @param salario
		 */

		public Trabajador(Long id, String nombre, ResourceType trabajador) {
			this.id = id;
			this.nombre = nombre;
			try {
				this.trabajador = trabajador;
			this.salario = returnSalario(trabajador);
			}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error");
			}
		}
		
		//Comprovar el trabajador
		/**
		 * 
		 * @param trabajador
		 * @return
		 */
		private boolean testTrabajador(ResourceType trabajador) {
			if(trabajador.compareTo(ResourceType.programador)!=0 || trabajador.compareTo(ResourceType.deveops)!=0 || trabajador.compareTo(ResourceType.analista)!=0) {
				return false;
			}
			return true;
		}
		
		//Assignar Salario
		
		private double returnSalario(ResourceType trabajador) {
			Double salario = 0.0;
			
			if(trabajador.name().equalsIgnoreCase(ResourceType.programador.name())) {
				salario = 2000.00;
			}
			if(trabajador.name().equalsIgnoreCase(ResourceType.deveops.name())) {
				salario = 3000.00;
			}
			if(trabajador.name().equalsIgnoreCase(ResourceType.analista.name())) {
				salario = 4000.00;
			}
			return salario;
		}
		/**
		 * 
		 * @return
		 */
		public Long getId() {
			return id;
		}
		
		/**
		 * 
		 * @param id
		 */
		public void setId(Long id) {
			this.id = id;
		}
		
		/**
		 * 
		 * @return
		 */
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * 
		 * @param nombre
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return
		 */
		public ResourceType getTrabajador() {
			return trabajador;
		}
		
		/**
		 * 
		 * @param trabajador
		 */
		public void setTrabajador(ResourceType trabajador) {
			this.trabajador = trabajador;
		}
		
		/**
		 * 
		 * @return
		 */
		public Double getSalario() {
			return salario;
		}
		
		/**
		 * 
		 * @param salario
		 */
		public void setSalario(Double salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajador=" + trabajador + ", salario=" + salario
					+ "]";
		}
}
	
	


