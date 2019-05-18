package com.projetoSeas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoSeas.domain.Cultura;

@Repository
public interface CulturaRepository extends JpaRepository<Cultura, Integer>{

}
