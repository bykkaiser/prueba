package com.saludo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;

@Controller
public class SaludoController {

	 @RequestMapping("/hola")
	public String hola(Model modelo)  {
		 
		 modelo.addAttribute("mensaje","hola desddde thymeleaf");
		return "prueba";
	}
}
