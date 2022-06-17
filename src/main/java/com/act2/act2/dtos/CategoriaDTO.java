package com.act2.act2.dtos;

import com.act2.act2.modelos.Categoria;

public class CategoriaDTO {
	
	private Integer id;
	private String nombre;
	private String descripcion;

	public CategoriaDTO() {
		super();
	}

	public CategoriaDTO(Categoria c) {
		this.id = c.getId();
		this.nombre = c.getNombre();
		this.descripcion = c.getDescripcion();
    }

    public Integer getIdCategoria() {
		return id;
	}
	public void setIdCategoria(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}