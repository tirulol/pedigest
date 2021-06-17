package com.sinensia.pedigest.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PEDIDOS")
public class PedidoPL implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@TableGenerator(name="MI_GENERADOR",
			table="SECUENCIAS",
			pkColumnName="SEQ_NAME",
			valueColumnName="SEQ_VALUE",
			pkColumnValue="PEDIDOS",
			allocationSize=1)

	@GeneratedValue(strategy=GenerationType.TABLE, generator="MI_GENERADOR")
	@Id
	private int codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaHora;
	
	@ManyToOne
	@JoinColumn(name="ID_CAMARERO")
	private CamareroPL camarero;
	
	@ElementCollection
	@OrderColumn(name="INDICE")	
	@CollectionTable(name="LINEAS_PEDIDOS", joinColumns = @JoinColumn(name="CODIGO_PEDIDO"))
	private List<LineaPedidoPL> lineas;
	
	public PedidoPL() {
		
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

	public CamareroPL getCamarero() {
		return camarero;
	}

	public void setCamarero(CamareroPL camarero) {
		this.camarero = camarero;
	}

	public List<LineaPedidoPL> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaPedidoPL> lineas) {
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
		PedidoPL other = (PedidoPL) obj;
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
