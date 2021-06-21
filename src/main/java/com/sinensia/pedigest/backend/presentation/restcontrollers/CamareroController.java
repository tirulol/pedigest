package com.sinensia.pedigest.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.presentation.model.CamareroVO;
import com.sinensia.pedigest.backend.presentation.services.CamareroVOServices;

@RestController
@RequestMapping("/pedigest/api/v1")
@CrossOrigin
public class CamareroController {

	@Autowired
	private CamareroVOServices camareroVOServices;
	
	@GetMapping("/camareros")
	public List<CamareroVO> getAll(){
		return camareroVOServices.getAll();
	}
	
}
