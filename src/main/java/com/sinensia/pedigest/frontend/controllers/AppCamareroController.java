package com.sinensia.pedigest.frontend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.pedigest.backend.presentation.model.CamareroVO;
import com.sinensia.pedigest.backend.presentation.services.CamareroVOServices;

@Controller
@RequestMapping("/pedigest")										// http://localhost:8080/pedigest/
public class AppCamareroController {

	@Autowired
	private CamareroVOServices camareroVOServices;				
	
	@GetMapping("/camareros")										// http://localhost:8080/pedigest/camareros
	public String getListado(Model model) {
		List<CamareroVO> camareros = camareroVOServices.getAll();
		model.addAttribute("camareros", camareros);					// para pasar datos a la vista
		return "listado_camareros";									// devuelve la página listado_camareros.jsp
	}
	
}
