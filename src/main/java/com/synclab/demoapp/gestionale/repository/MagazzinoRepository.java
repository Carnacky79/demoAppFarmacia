package com.synclab.demoapp.gestionale.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.Prodotti;

public interface MagazzinoRepository extends MongoRepository<Magazzino, String>{
	public Magazzino findByProdotto(Prodotti prodotto);
	
	List<Magazzino> findByPosizione(String posizione);
	
}
