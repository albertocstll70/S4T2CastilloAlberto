package cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruta")
public class Fruta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="nombre", nullable=false,length = 45)
	private String nombre;
	
	@Column(name = "cantidad",nullable=false)
	private double cantidadQuilos;
	
	public Fruta() {
		
	}

//	public Fruta(String nombre, int cantidadQuilos) {
//	
//		this.nombre = nombre;
//		this.cantidadQuilos = cantidadQuilos;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidadQuilos() {
		return cantidadQuilos;
	}

	public void setCantidadQuilos(double cantidadQuilos) {
		this.cantidadQuilos = cantidadQuilos;
	}
	

	
}
