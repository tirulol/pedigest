package com.sinensia.pedigest.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.business.services.CamareroServices;
import com.sinensia.pedigest.backend.integration.model.CamareroPL;

@RestController
public class CamareroController {

	@Autowired
	private CamareroServices camareroServices;
	
	@GetMapping("/camareros")
	public List<CamareroPL> getAll(){
		return camareroServices.getAll();
	}
	
	@GetMapping("/camareros/{id}")
	public CamareroPL getById(@PathVariable int id) {
		return camareroServices.read(id);
	}
	
	@PostMapping("/camareros")
	public CamareroPL create(@RequestBody CamareroPL camarero) {
		return camareroServices.create(camarero);
	}
	
	@DeleteMapping("camareros/{id}")
	public boolean delete(@PathVariable int id) {
		return camareroServices.delete(id);
	}

}
