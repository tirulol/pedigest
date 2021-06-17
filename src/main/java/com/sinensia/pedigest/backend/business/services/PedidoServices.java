package com.sinensia.pedigest.backend.business.services;

import java.util.Date;
import java.util.List;

import com.sinensia.pedigest.backend.integration.model.PedidoPL;

public interface PedidoServices {

	public List<PedidoPL> getAll();
	public PedidoPL create(PedidoPL pedido);
	public PedidoPL read(Integer codigo);
	public List<PedidoPL> getBetweenFechas(Date desde, Date hasta);
	public List<PedidoPL> getByCamarero(int codigo);
	
}
