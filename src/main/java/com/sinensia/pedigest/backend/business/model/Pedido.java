package com.sinensia.pedigest.backend.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private Date fechaHora;
	private Camarero camarero;
	private List<LineaPedido> lineas;
	
	public Pedido() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Camarero getCamarero() {
		return camarero;
	}

	public void setCamarero(Camarero camarero) {
		this.camarero = camarero;
	}

	public List<LineaPedido> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaPedido> lineas) {
		this.lineas = lineas;
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
		Pedido other = (Pedido) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", fechaHora=" + fechaHora + ", camarero=" + camarero + ", lineas=" + lineas
				+ "]";
	}

}
