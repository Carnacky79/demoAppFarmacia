package com.synclab.demoapp.gestionale.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;

public interface MagazzinoRepository extends MongoRepository<Magazzino, String>{
	
	Magazzino findByCodiceProdotto(String codiceProdotto);
	
	Magazzino findByNomeProdotto(String nomeProdotto);
	
	List<Magazzino> findByPosizione(String posizione);
	
}
