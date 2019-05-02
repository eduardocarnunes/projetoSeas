package com.projetoSeas.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/culturas")
public class CulturaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "esta funcionado";
	}
	

}
