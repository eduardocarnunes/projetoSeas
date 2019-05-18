package com.projetoSeas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.projetoSeas.domain.Cultura;
import com.projetoSeas.exceptions.DataIntegrityException;
import com.projetoSeas.exceptions.ObjectNotFoundException;
import com.projetoSeas.repositories.CulturaRepository;

@Service
public class CulturaService {
	
	@Autowired
	private CulturaRepository repo;

	public Cultura find(Integer id) {
		Optional<Cultura> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cultura.class.getName()));
	}
	
	public Cultura insert(Cultura obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Cultura update(Cultura obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma cultura que possui talhão");
		}
	}
	
	public List<Cultura> findAll(){
		return repo.findAll();
	}
	
	public Page<Cultura> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),orderBy);
		return repo.findAll(pageRequest);
	}

}
