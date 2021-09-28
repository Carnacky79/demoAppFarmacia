package com.synclab.demoapp.gestionale.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.Prodotti;
import com.synclab.demoapp.gestionale.repository.ProdottiRepository;

@Service
public class ProdottiService {
	@Autowired
	ProdottiRepository prodottiRepository;
	
	public Prodotti findByNome(String nome) {
		return prodottiRepository.findByNomeProdotto(nome);
	}
	
	public Prodotti findByCodice(String codice) {
		return prodottiRepository.findByCodiceProdotto(codice);
	}
	
	public List<Prodotti> findByPrezzoAcquisto(BigDecimal from, BigDecimal to){
		return prodottiRepository.findByPrezzoAcquistoBetween(from, to);
	}
	
	public List<Prodotti> findByPrezzoVendita(BigDecimal from, BigDecimal to){
		return prodottiRepository.findByPrezzoVenditaBetween(from, to);
	}
	
	public List<Prodotti> findByMagazzini(Set<Magazzino> magazzini){
		return prodottiRepository.findByMagazzini(magazzini);
	}
	
	public Integer insertProdotto(Prodotti prodotto) {
		Prodotti prod = prodottiRepository.save(prodotto);
		
		return prod.getId();
	}
	
	public void deleteProdotto(String id) {
		prodottiRepository.deleteById(id);
	}
}
