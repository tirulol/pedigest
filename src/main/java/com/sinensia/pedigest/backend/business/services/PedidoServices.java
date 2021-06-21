package com.sinensia.pedigest.backend.business.services;

import java.util.Date;
import java.util.List;

import com.sinensia.pedigest.backend.business.model.Pedido;

public interface PedidoServices {

	public List<Pedido> getAll();
	public Pedido create(Pedido pedido);
	public Pedido read(Integer codigo);
	public List<Pedido> getBetweenFechas(Date desde, Date hasta);
	public List<Pedido> getByCamarero(int codigo);
	
}
