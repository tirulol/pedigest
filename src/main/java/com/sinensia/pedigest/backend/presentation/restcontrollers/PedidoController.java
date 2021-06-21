package com.sinensia.pedigest.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.integration.model.PedidoPL;
import com.sinensia.pedigest.backend.presentation.services.PedidoVOServices;

@RestController
@RequestMapping("/pedigest/api/v1")
@CrossOrigin
public class PedidoController {

	@Autowired
	private PedidoVOServices pedidoVOServices;
	
	@GetMapping("/pedidos")
	public List<PedidoPL> getAll(@RequestParam (name="camarero", required = false) Integer codigoCamarero){
		// TODO 
		return null;
	}
	
	@GetMapping("/pedidos/{codigo}")
	public PedidoPL getById(@PathVariable Integer codigo) {
		//TODO
		return null;
	}

}
