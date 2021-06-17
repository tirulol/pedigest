package com.sinensia.pedigest.backend.business.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Cliente;
import com.sinensia.pedigest.backend.business.services.ClienteServices;
import com.sinensia.pedigest.backend.integration.model.ClientePL;
import com.sinensia.pedigest.backend.integration.repositories.ClientePLRepository;

@Service
public class ClienteServicesImpl implements ClienteServices {

	@Autowired
	private ClientePLRepository clientePLRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public Cliente create(Cliente cliente) {
		final ClientePL clientePL = mapper.map(cliente, ClientePL.class);
		final ClientePL createdClientePL = clientePLRepository.save(clientePL);
		return mapper.map(createdClientePL, Cliente.class);	
	}
	
	@Override
	public Cliente read(int codigo) {
		
		final Optional<ClientePL> optional = clientePLRepository.findById(codigo);
		ClientePL clientePL = null;
		
		if(optional.isPresent()) {
			clientePL = optional.get();
		}
		
		return mapper.map(clientePL, Cliente.class);
	
	}
	
	@Override
	public boolean delete(int codigo) {
		
		boolean existe = clientePLRepository.existsById(codigo);
		
		if (existe) {
			clientePLRepository.deleteById(codigo);
		}
		
		return existe;
	}

	@Override
	public List<Cliente> getAll() {
		
		List<ClientePL> clientesPL = clientePLRepository.findAll();
		
		System.out.println(clientesPL);
		
		List<Cliente> clientes = new ArrayList<>();
		
		for(ClientePL clientePL: clientesPL) {
			Cliente cliente = mapper.map(clientePL, Cliente.class);
			
			// cliente.setCodigo(clientePL.getCodigo()); // parche!!!!
			
			clientes.add(cliente);
		
			
		}
		
		return clientes;
		
	}
	
	// ***************************************************************************
	//
	// Métodos pendientes de implementar.
	//
	// ***************************************************************************
	
	@Override
	public void update(Cliente cliente) {
		// TODO
		//clienteRepository.save(cliente);	
	}

	@Override
	public List<Cliente> getActivos() {
		//TODO
		return null;
		//return clienteRepository.findByActivo(true);
	}

	@Override
	public List<Cliente> getBetweenCredito(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getBetweenFechas(Date desde, Date hasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Boolean, Integer> getEstadisticaCantidadByActivo() {
		// TODO Auto-generated method stub
		return null;
	}

}
