package com.sinensia.pedigest.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.business.services.PedidoServices;
import com.sinensia.pedigest.backend.integration.model.PedidoPL;

@RestController
public class PedidoController {

	@Autowired
	private PedidoServices pedidoServices;
	
	@GetMapping("/pedidos")
	public List<PedidoPL> getAll(@RequestParam (name="camarero", required = false) Integer codigoCamarero){
		
		List<PedidoPL> pedidos = null;
		
		if(codigoCamarero != null) {
			pedidos = pedidoServices.getByCamarero(codigoCamarero);
		} else {
			pedidos = pedidoServices.getAll();
		}
		
		return pedidos;
	}
	
	@GetMapping("/pedidos/{codigo}")
	public PedidoPL getById(@PathVariable Integer codigo) {
		return pedidoServices.read(codigo);
	}

}
