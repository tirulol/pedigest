package com.sinensia.pedigest.backend.business.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Pedido;
import com.sinensia.pedigest.backend.business.services.PedidoServices;
import com.sinensia.pedigest.backend.integration.model.PedidoPL;
import com.sinensia.pedigest.backend.integration.repositories.PedidoPLRepository;

@Service
public class PedidoServicesImpl implements PedidoServices {

	@Autowired
	private PedidoPLRepository pedidoPLRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public List<Pedido> getAll() {
		return pedidoPLRepository.findAll().stream().map(x -> mapper.map(x, Pedido.class)).collect(Collectors.toList());
	}
	
	@Override
	public Pedido read(Integer codigo) {
		Optional<PedidoPL> optional = pedidoPLRepository.findById(codigo);
		return optional.isPresent() ? mapper.map(optional.get(),Pedido.class) : null;
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
