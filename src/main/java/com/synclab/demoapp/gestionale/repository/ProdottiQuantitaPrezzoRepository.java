package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.ProdottiQuantitaPrezzo;

public interface ProdottiQuantitaPrezzoRepository extends MongoRepository<ProdottiQuantitaPrezzo, String>{

	
}
