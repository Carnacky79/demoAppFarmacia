package com.synclab.demoapp.gestionale.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.User;
import com.synclab.demoapp.gestionale.model.MovimentoMagazzino;


public interface MovimentoMagazzinoRepository extends MongoRepository<MovimentoMagazzino, String>{
	
	List<MovimentoMagazzino> findByDataVendita(Date dataVendita);
	
	List<MovimentoMagazzino> findByTipoMovimento(String tipoMovimento);
	
	List<MovimentoMagazzino> findByUser(User user);
	
	List<MovimentoMagazzino> findByProdotto(Magazzino prodotto);	
	
}