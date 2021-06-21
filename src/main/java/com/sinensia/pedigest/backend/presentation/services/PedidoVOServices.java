package com.sinensia.pedigest.backend.presentation.services;

import java.util.List;

import com.sinensia.pedigest.backend.presentation.model.PedidoVO;

public interface PedidoVOServices {

	
	public List<PedidoVO> getAll();
	
	public PedidoVO getById(int codigo);
	
}
