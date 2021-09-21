package com.synclab.demoapp.gestionale.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.User;
import com.synclab.demoapp.gestionale.model.Vendita;


public interface VenditaRepository extends MongoRepository<Vendita, String>{
	
	List<Vendita> findByDataVendita(Date dataVendita);
	
	List<Vendita> findByUser(User user);
	
	List<Vendita> findByProdotto(Magazzino prodotto);	
	
}
