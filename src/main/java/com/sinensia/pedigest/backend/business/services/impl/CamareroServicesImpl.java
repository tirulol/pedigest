package com.sinensia.pedigest.backend.business.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Camarero;
import com.sinensia.pedigest.backend.business.services.CamareroServices;
import com.sinensia.pedigest.backend.integration.model.CamareroPL;
import com.sinensia.pedigest.backend.integration.repositories.CamareroPLRepository;

@Service
public class CamareroServicesImpl implements CamareroServices{

	@Autowired
	private CamareroPLRepository camareroRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	@Override
	public Camarero create(Camarero camarero) {
		final CamareroPL camareroPL = mapper.map(camarero, CamareroPL.class);
		final CamareroPL createdCamareroPL = camareroRepository.save(camareroPL);
		return mapper.map(createdCamareroPL, Camarero.class);
	}

	@Override
	public Camarero read(int id) {
		Optional<CamareroPL> optional = camareroRepository.findById(id);
		return optional.isPresent() ? mapper.map(optional.get(), Camarero.class) : null;
	}

	@Override
	public void update(Camarero camarero) {
		//TODO
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
	public List<Camarero> getAll() {
		return camareroRepository.findAll()
				.stream()
				.map(x -> mapper.map(x, Camarero.class))
				.collect(Collectors.toList());
	}

}
