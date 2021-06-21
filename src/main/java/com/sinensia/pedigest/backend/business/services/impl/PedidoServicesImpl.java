package com.sinensia.pedigest.backend.business.services.impl;

import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Pedido;
import com.sinensia.pedigest.backend.business.services.PedidoServices;
import com.sinensia.pedigest.backend.integration.repositories.PedidoPLRepository;

@Service
@Primary
public class PedidoServicesImpl implements PedidoServices {

	@Autowired
	private PedidoPLRepository pedidoPLRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public List<Pedido> getAll() {
		//TODO
		return null;
	}
	
	@Override
	public Pedido read(Integer codigo) {
		//TODO
		return null;
	}
	
	
	// ********************************************************************************

	@Override
	public Pedido create(Pedido pedido) {
		//TODO
		return null;
	}

	

	@Override
	public List<Pedido> getBetweenFechas(Date desde, Date hasta) {
		//TODO
		return null;
	}

	@Override
	public List<Pedido> getByCamarero(int codigo) {
		//TODO
		return null;
	}

}
