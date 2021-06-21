package com.sinensia.pedigest.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedigest")
public class AppHomeController {

	@GetMapping(value = {"/home", "/"})
	public String home() {
		return "home";
	}
	
}
