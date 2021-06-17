package com.sinensia.pedigest.backend.presentation.restcontrollers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.pedigest.backend.presentation.model.ClienteVO;
import com.sinensia.pedigest.backend.presentation.services.ClienteVOServices;

@RestController
public class ClienteController {

	@Autowired
	private ClienteVOServices clienteVOServices;

	@GetMapping("/clientes/{codigo}")
	public ClienteVO getById(@PathVariable Integer codigo) {
		return clienteVOServices.getById(codigo);
	}
	
	@GetMapping("/clientes")
	public List<ClienteVO> getAll(){
		
		List<ClienteVO> clientesVO = clienteVOServices.getAll();
		
		System.out.println(clientesVO);
		
		return clientesVO;
	}
	
}
