package com.sinensia.pedigest.backend.presentation.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Camarero;
import com.sinensia.pedigest.backend.business.services.CamareroServices;
import com.sinensia.pedigest.backend.presentation.model.CamareroVO;
import com.sinensia.pedigest.backend.presentation.services.CamareroVOServices;

@Service
public class CamareroVOServicesImpl implements CamareroVOServices {

	@Autowired
	private CamareroServices camareroServices;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public List<CamareroVO> getAll() {
		
		final List<Camarero> camareros = camareroServices.getAll();
		
		return camareros.stream().map(x -> mapper.map(x, CamareroVO.class)).collect(Collectors.toList());
	}

}
