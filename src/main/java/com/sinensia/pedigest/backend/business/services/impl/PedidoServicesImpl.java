package com.sinensia.pedigest.backend.business.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.services.PedidoServices;
import com.sinensia.pedigest.backend.integration.model.PedidoPL;
import com.sinensia.pedigest.backend.integration.repositories.PedidoPLRepository;

@Service
@Primary
public class PedidoServicesImpl implements PedidoServices {

	@Autowired
	private PedidoPLRepository pedidoRepository;
	
	@Override
	public List<PedidoPL> getAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public PedidoPL create(PedidoPL pedido) {
		return pedidoRepository.save(pedido);
	}

	@Override
	public PedidoPL read(Integer codigo) {
		Optional<PedidoPL> optional = pedidoRepository.findById(codigo);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public List<PedidoPL> getBetweenFechas(Date desde, Date hasta) {
		return pedidoRepository.findByFechaHoraBetween(desde, hasta);
	}

	@Override
	public List<PedidoPL> getByCamarero(int codigo) {
		return pedidoRepository.findByCamareroId(codigo);
	}

}
