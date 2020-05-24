package com.uca.capas.labo5.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {

	@Id
	@Column(name="id_estudiante")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoEstudiante;
	
	
	@Column(name="nombre")
	@Size(message="El campo no debe contener mas de 30 caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String Nombre;
	
	@Column(name="apellido")
	@Size(message="El campo no debe contener mas de 30 caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String Apellido;
	
	@Column(name="edad")
	@NotNull(message="El campo no puede estar vacio")
	@Min(value = 18, message="No puede ser menor a 18 años")
	private Integer Edad;
	
	@Column(name="estado")
	private Boolean Estado;
	
	public Estudiante() {
		
	}
	
	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}
	
	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public Integer getEdad() {
		return Edad;
	}
	
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	
	public Boolean getEstado() {
		return Estado;
	}
	
	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	
	public String getEstadoDelegate() {
		if(this.Estado == null) return "";
		
		return Estado == true ? "Activo" : "Inactivo";
	}
}
