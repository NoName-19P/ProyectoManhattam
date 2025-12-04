package es.cursojava.hibernate.ejercicio1.entites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_AULA")

public class Aula implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "codigo_aula", unique = true)
	private String codigoAula;

	@Column(name = "capacidad")
	private Integer capacidad;

	@Column(name = "ubicacion")
	private String ubicacion;

	public Aula() {

	}

	public Aula(String codigoAula, Integer capacidad, String ubicacion) {
		this.codigoAula = codigoAula;
		this.capacidad = capacidad;
		this.ubicacion = ubicacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoAula() {
		return codigoAula;
	}

	public void setCodigoAula(String codigoAula) {
		this.codigoAula = codigoAula;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String toString() {
		return "Aula [id=" + id + ", codigoAula=" + codigoAula + ", capacidad=" + capacidad + ", ubicacion=" + ubicacion
				+ "]";
	}

}
