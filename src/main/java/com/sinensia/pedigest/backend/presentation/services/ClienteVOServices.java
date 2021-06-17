package com.sinensia.pedigest.backend.presentation.services;

import java.util.List;

import com.sinensia.pedigest.backend.presentation.model.ClienteVO;

public interface ClienteVOServices {

	public ClienteVO getById(int codigo);
	
	public List<ClienteVO> getAll();
}
