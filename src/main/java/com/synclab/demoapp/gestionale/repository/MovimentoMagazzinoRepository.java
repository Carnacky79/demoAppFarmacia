package com.synclab.demoapp.gestionale.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.MovimentoMagazzino;
import com.synclab.demoapp.gestionale.model.ProdottiQuantitaPrezzo;
import com.synclab.demoapp.gestionale.model.User;


public interface MovimentoMagazzinoRepository extends MongoRepository<MovimentoMagazzino, String>{
	
	List<MovimentoMagazzino> findByDataVendita(Date dataVendita);
	
	List<MovimentoMagazzino> findByTipoMovimento(String tipoMovimento);
	
	List<MovimentoMagazzino> findByUser(User user);
	
	List<MovimentoMagazzino> findByProdottiQuantitaPrezzo(ProdottiQuantitaPrezzo prodQP);	
	
	List<MovimentoMagazzino> findByQuantitaTotaleBetween(Integer from, Integer to);
	
	List<MovimentoMagazzino> findByPrezzoTotaleBetween(BigDecimal from, BigDecimal to);
}
