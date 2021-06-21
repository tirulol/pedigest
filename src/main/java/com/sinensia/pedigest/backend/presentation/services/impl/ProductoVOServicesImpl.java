package com.sinensia.pedigest.backend.presentation.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.pedigest.backend.business.model.Producto;
import com.sinensia.pedigest.backend.business.services.ProductoServices;
import com.sinensia.pedigest.backend.presentation.model.ProductoVO;
import com.sinensia.pedigest.backend.presentation.services.ProductoVOServices;

@Service
public class ProductoVOServicesImpl implements ProductoVOServices {

	@Autowired
	private ProductoServices productoServices;
	
	private Logger logger = LoggerFactory.getLogger(ProductoVOServicesImpl.class);
	
	@Autowired
	private DozerBeanMapper mapper;

	@Override
	public ProductoVO getById(int codigo) {
		final Producto producto = productoServices.read(codigo);
		final ProductoVO productoVO = mapper.map(producto, ProductoVO.class);
		return productoVO;
	}

	@Override
	public List<ProductoVO> getAll() {
		final List<Producto> productos = productoServices.getAll();
		final List<ProductoVO> productosVO = new ArrayList<>();
		
		for(Producto producto: productos) {
			ProductoVO productoVO = mapper.map(producto, ProductoVO.class);
			productosVO.add(productoVO);
		}

		return productosVO;
	}

	@Override
	public ProductoVO create(ProductoVO productoVO) {
		final Producto producto = mapper.map(productoVO, Producto.class);
		final Producto createdProducto = productoServices.create(producto);
		final ProductoVO createdProductoVO = mapper.map(createdProducto, ProductoVO.class);
		logger.info("Se crea el ProductoVO : {}", productoVO);
		return createdProductoVO;
	}
	
}
