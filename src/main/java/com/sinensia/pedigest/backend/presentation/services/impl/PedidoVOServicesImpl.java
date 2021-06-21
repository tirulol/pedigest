package com.sinensia.pedigest.backend.presentation.services.impl;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PedidoVO getById(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
