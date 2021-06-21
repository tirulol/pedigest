package com.sinensia.pedigest.frontend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.pedigest.backend.presentation.model.ClienteVO;
import com.sinensia.pedigest.backend.presentation.services.ClienteVOServices;

@Controller
@RequestMapping("/pedigest")
public class AppClienteController {

	@Autowired
	private ClienteVOServices clienteVOServices;
	
	@GetMapping("/clientes")
	public String getListado(Model model) {
		
		List<ClienteVO> clientes = clienteVOServices.getAll();
		
		model.addAttribute("clientes", clientes);
		
		return "listado_clientes";
	}
	
}
