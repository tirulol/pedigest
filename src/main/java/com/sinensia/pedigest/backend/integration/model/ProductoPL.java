package com.sinensia.pedigest.backend.integration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PRODUCTOS")
public class ProductoPL implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="MI_GENERADOR",
					table="SECUENCIAS",
					pkColumnName="SEQ_NAME",
					valueColumnName="SEQ_VALUE",
					pkColumnValue="PRODUCTOS",
					allocationSize=1)

	@GeneratedValue(strategy=GenerationType.TABLE, generator="MI_GENERADOR")
	@Id
	private int codigo;
	
	private String nombre;
	private double precio;
	private String descripcion;
	
	@Enumerated(EnumType.STRING)
	private FamiliaPL familia;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;
	
	private boolean descatalogado;
	
	public ProductoPL() {
		
	}

	public ProductoPL(int codigo, String nombre, double precio, FamiliaPL familia, Date fechaAlta) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.familia = familia;
		this.fechaAlta = fechaAlta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public FamiliaPL getFamilia() {
		return familia;
	}

	public void setFamilia(FamiliaPL familia) {
		this.familia = familia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		ProductoPL other = (ProductoPL) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductoPL [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", familia=" + familia + ", fechaAlta=" + fechaAlta + ", descatalogado=" + descatalogado
				+ "]";
	}

}
