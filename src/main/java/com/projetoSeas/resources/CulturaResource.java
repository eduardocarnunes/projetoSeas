package com.projetoSeas.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projetoSeas.domain.Cultura;
import com.projetoSeas.dto.CulturaDTO;
import com.projetoSeas.services.CulturaService;

@RestController
@RequestMapping(value="/culturas")
public class CulturaResource {
	
	@Autowired
	private CulturaService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cultura> find(@PathVariable Integer id) {		
		Cultura obj = service.find(id);
		return ResponseEntity.ok(obj);	
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Cultura obj){
		obj = service.insert(obj); 
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Cultura obj, @PathVariable Integer id){
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {		
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<CulturaDTO>> findAll() {		
		List<Cultura> list = service.findAll();
		List<CulturaDTO> listDto = list.stream().map(obj -> new CulturaDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);	
	}
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public ResponseEntity<Page<CulturaDTO>> findPage(
			@RequestParam(value="page", defaultValue="0") Integer page,
			@RequestParam(value="linesPerPage", defaultValue="24")Integer linesPerPage,
			@RequestParam(value="orderBy", defaultValue="name")String orderBy,
			@RequestParam(value="direction", defaultValue="ASC")String direction) {		
		Page<Cultura> list = service.findPage(page, linesPerPage, orderBy, direction);
		Page<CulturaDTO> listDto = list.map(obj -> new CulturaDTO(obj));
		return ResponseEntity.ok().body(listDto);	
	}
	

}
