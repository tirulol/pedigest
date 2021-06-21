package com.sinensia.pedigest.backend.presentation.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Cliente;
import com.sinensia.pedigest.backend.business.services.ClienteServices;
import com.sinensia.pedigest.backend.presentation.model.ClienteVO;
import com.sinensia.pedigest.backend.presentation.services.ClienteVOServices;

@Service
public class ClienteVOServicesImpl implements ClienteVOServices {

	@Autowired
	private ClienteServices clienteServices;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public ClienteVO getById(int codigo) {
		final Cliente cliente = clienteServices.read(codigo);
		final ClienteVO clienteVO = mapper.map(cliente, ClienteVO.class);
		return clienteVO;
	}

	@Override
	public List<ClienteVO> getAll() {
		final List<Cliente> clientes = clienteServices.getAll();
		
	
		final List<ClienteVO> clientesVO = new ArrayList<>();
		
		for(Cliente cliente: clientes) {
			ClienteVO clienteVO = mapper.map(cliente, ClienteVO.class);
			clientesVO.add(clienteVO);
		}
		
		return clientesVO;
	}
}
