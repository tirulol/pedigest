package com.sinensia.pedigest.backend.business.model;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String nif;
	private String razonSocial;
	private Date fechaAlta;
	private boolean activo;
	private double credito;
	
	public Cliente() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
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
		Cliente other = (Cliente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nif=" + nif + ", razonSocial=" + razonSocial + ", fechaAlta="
				+ fechaAlta + ", activo=" + activo + ", credito=" + credito + "]";
	}
	
}
