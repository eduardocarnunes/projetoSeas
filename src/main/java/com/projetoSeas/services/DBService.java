package com.projetoSeas.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSeas.domain.Cultura;
import com.projetoSeas.repositories.CulturaRepository;

@Service
public class DBService {
	
	@Autowired
	private CulturaRepository culturaRepository;
	
	public void instantiateTestDatabase() {
		
		Cultura cultura1 = new Cultura(null, "Pera Rocha", "Cultura da Pera Rocha");
		Cultura cultura2 = new Cultura(null, "Batata-Inglesa", "Cultura da Batata Inglesa");
		Cultura cultura3 = new Cultura(null, "Batata Doce", "Cultura da Batata Doce");
		
		culturaRepository.saveAll(Arrays.asList(cultura1, cultura2, cultura3));
		
	}
	

}
