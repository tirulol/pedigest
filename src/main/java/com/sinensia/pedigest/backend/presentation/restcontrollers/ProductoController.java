package com.sinensia.pedigest.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.presentation.model.ProductoVO;
import com.sinensia.pedigest.backend.presentation.services.ProductoVOServices;

@RestController
@RequestMapping("/pedigest/api/v1")
@CrossOrigin
public class ProductoController {

	@Autowired
	private ProductoVOServices productoVOServices;
	
	@GetMapping("/productos")
	public List<ProductoVO> getAll(){
		return  productoVOServices.getAll();
	}
	
	@GetMapping("/productos/{codigo}")
	public ProductoVO getById(@PathVariable int codigo) {
		return productoVOServices.getById(codigo);
	}
	
	@PostMapping("/productos")
	public ProductoVO create(@RequestBody ProductoVO productoVO) {
		return productoVOServices.create(productoVO);
	}
	
}
