package com.sinensia.pedigest.backend.business.services.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Familia;
import com.sinensia.pedigest.backend.business.model.Producto;
import com.sinensia.pedigest.backend.business.services.ProductoServices;
import com.sinensia.pedigest.backend.integration.model.ProductoPL;
import com.sinensia.pedigest.backend.integration.repositories.ProductoPLRepository;

@Service
public class ProductoServicesImpl implements ProductoServices {
	
	@Autowired
	private ProductoPLRepository productoPLRepository;
	
	@Autowired
	private DozerBeanMapper mapper;
	
	private Logger logger = LoggerFactory.getLogger(ProductoServicesImpl.class);
	
	@Override
	@Transactional
	public Producto create(Producto producto) {
		final ProductoPL productoPL = mapper.map(producto, ProductoPL.class);
		final ProductoPL createdProductoPL =  productoPLRepository.save(productoPL);
		final Producto createdProducto = mapper.map(createdProductoPL, Producto.class);
		logger.info("Se crea el producto {}", producto);
		return createdProducto;
	}

	@Override
	public Producto read(int codigo) {
		final Optional<ProductoPL> optional = productoPLRepository.findById(codigo);
		return optional.isPresent() ? mapper.map(optional.get(), Producto.class): null;
	}

	@Override
	public List<Producto> getAll() {
		return productoPLRepository.findAll()
				.stream()
				.map(x -> mapper.map(x, Producto.class))
				.collect(Collectors.toList());
	}

	@Override
	public List<Producto> getByFamilia(Familia familia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getBetweenPrecios(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getBetweenFechaAlta(Date desde, Date hasta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getEstadisticaCantidadPorFamilias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> getEstadisticaPreciomedioPorFamilias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementarPrecio(Collection<Producto> productos, double porcentaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int descatalogar(Date fechaLimite) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
