package com.sinensia.pedigest.backend.presentation.services;

import java.util.List;

import com.sinensia.pedigest.backend.presentation.model.ProductoVO;

public interface ProductoVOServices {

	public ProductoVO getById(int codigo);
	
	public List<ProductoVO> getAll();
	
	public ProductoVO create(ProductoVO productoVO);
}
