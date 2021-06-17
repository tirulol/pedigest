package com.sinensia.pedigest.backend.presentation.model;

import java.io.Serializable;
import java.util.Date;

public class ProductoVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nombre;
	private double precio;
	private String descripcion;
	private FamiliaVO familia;
	private Date fechaAlta;
	private String descatalogado;
	
	public ProductoVO() {
		
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

	public FamiliaVO getFamilia() {
		return familia;
	}

	public void setFamilia(FamiliaVO familia) {
		this.familia = familia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(String descatalogado) {
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
		ProductoVO other = (ProductoVO) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductoVO [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descripcion="
				+ descripcion + ", familia=" + familia + ", fechaAlta=" + fechaAlta + ", descatalogado=" + descatalogado
				+ "]";
	}

}
