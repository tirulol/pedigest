package com.sinensia.pedigest.backend.business.model;

import java.io.Serializable;

public class Camarero implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nombre;
	
	public Camarero() {
		
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camarero other = (Camarero) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Camarero [id=" + id + ", nombre=" + nombre + "]";
	}

}
