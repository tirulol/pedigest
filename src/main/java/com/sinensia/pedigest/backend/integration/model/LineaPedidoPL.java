package com.sinensia.pedigest.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class LineaPedidoPL implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="CODIGO_PRODUCTO")
	private ProductoPL producto;
	
	private int cantidad;
	private double precio;
	
	public LineaPedidoPL() {
		
	}

	public ProductoPL getProducto() {
		return producto;
	}

	public void setProducto(ProductoPL producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getTotal() {
		return this.cantidad * this.getPrecio();
	}

	@Override
	public String toString() {
		return "LineaPedido [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
