package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;

public interface MagazzinoRepository extends MongoRepository<Magazzino, String>{
	
}
