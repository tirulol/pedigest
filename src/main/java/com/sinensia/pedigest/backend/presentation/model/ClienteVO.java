package com.sinensia.pedigest.backend.presentation.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ClienteVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nif;
	private String razonSocial;
	private Date fechaAlta;
	
	@JsonIgnore
	private boolean activo;
	
	private double credito;
	
	public ClienteVO() {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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
	public String toString() {
		return "ClienteVO [codigo=" + codigo + ", nif=" + nif + ", razonSocial=" + razonSocial + ", fechaAlta="
				+ fechaAlta + ", activo=" + activo + ", credito=" + credito + "]";
	}
	
}
