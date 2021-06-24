package com.sinensia.pedigest.backend.presentation.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Pedido;
import com.sinensia.pedigest.backend.business.services.PedidoServices;
import com.sinensia.pedigest.backend.presentation.model.PedidoVO;
import com.sinensia.pedigest.backend.presentation.services.PedidoVOServices;

@Service
public class PedidoVOServicesImpl implements PedidoVOServices{

	@Autowired
	private PedidoServices pedidoServices;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public List<PedidoVO> getAll() {
		return pedidoServices.getAll().stream().map(x -> mapper.map(x, PedidoVO.class)).collect(Collectors.toList());
	}

	@Override
	public PedidoVO getById(int codigo) {
		final Pedido pedido = pedidoServices.read(codigo);
		return mapper.map(pedido, PedidoVO.class);
	}

}
