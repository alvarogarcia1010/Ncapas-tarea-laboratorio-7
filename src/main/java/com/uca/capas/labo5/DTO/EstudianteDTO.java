package com.uca.capas.labo5.DTO;

import javax.persistence.Column;

public class EstudianteDTO {
	private String nombre;
	private String apellido;
	
	public EstudianteDTO() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
