package com.synclab.demoapp.gestionale.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.Prodotti;

public interface ProdottiRepository extends MongoRepository<Prodotti, String>{
	
	public Prodotti findByNomeProdotto(String nomeProdotto);
	
	public Prodotti findByCodiceProdotto(String codiceProdotto);
	
	public List<Prodotti> findByMagazzini(Set<Magazzino> magazzini);
	
	public List<Prodotti> findByPrezzoAcquistoBetween(BigDecimal from, BigDecimal to);
	
	public List<Prodotti> findByPrezzoVenditaBetween(BigDecimal from, BigDecimal to);
}
