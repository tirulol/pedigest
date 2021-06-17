package com.sinensia.pedigest.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="CAMAREROS")
public class CamareroPL implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="MI_GENERADOR",
					table="SECUENCIAS",
					pkColumnName="SEQ_NAME",
					valueColumnName="SEQ_VALUE",
					pkColumnValue="CAMAREROS",
					allocationSize=1)

	@GeneratedValue(strategy=GenerationType.TABLE, generator="MI_GENERADOR")
	@Id
	private int id;
	
	@Column(name="NAME")
	private String nombre;
	
	public CamareroPL() {
		
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
		CamareroPL other = (CamareroPL) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Camarero [id=" + id + ", nombre=" + nombre + "]";
	}

}
