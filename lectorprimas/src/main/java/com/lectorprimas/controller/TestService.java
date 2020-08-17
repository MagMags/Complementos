package com.lectorprimas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

	@GetMapping("/holamundo")
	public @ResponseBody String holaMundo() {
		return "hola micky";
	}
	
	@GetMapping("/hola")
	public @ResponseBody String hola() {
		return "hola";
	}
	
	
}
