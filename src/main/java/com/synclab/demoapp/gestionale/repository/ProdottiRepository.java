package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Prodotti;

public interface ProdottiRepository extends MongoRepository<Prodotti, String>{
	
	public Prodotti findByNomeProdotto(String nomeProdotto);
	
	public Prodotti findByCodiceProdotto(String codiceProdotto);
	
}
