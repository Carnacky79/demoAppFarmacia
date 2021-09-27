package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.ProdottiMagazzino;

public interface ProdottiMagazzinoRepository extends MongoRepository<ProdottiMagazzino, String>{
	

	
}
