package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Posizioni;

public interface PosizioniRepository extends MongoRepository<Posizioni, String>{
	
	Posizioni findByNomePosizione(String nomePosizione);
	
}
