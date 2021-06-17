package com.sinensia.pedigest.backend.business.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.services.CamareroServices;
import com.sinensia.pedigest.backend.integration.model.CamareroPL;
import com.sinensia.pedigest.backend.integration.repositories.CamareroPLRepository;

@Service
@Primary
public class CamareroServicesImpl implements CamareroServices{

	@Autowired
	private CamareroPLRepository camareroRepository;
	
	@Override
	public CamareroPL create(CamareroPL camarero) {
		return camareroRepository.save(camarero);
	}

	@Override
	public CamareroPL read(int id) {
		return camareroRepository.getById(id);
	}

	@Override
	public void update(CamareroPL camarero) {
		camareroRepository.save(camarero);
	}

	@Override
	public boolean delete(int id) {
		
		boolean existe = camareroRepository.existsById(id);
		
		if (existe) {
			camareroRepository.deleteById(id);
		}

		return existe;
	}

	@Override
	public List<CamareroPL> getAll() {
		return camareroRepository.findAll();
	}

}
