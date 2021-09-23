package com.synclab.demoapp.gestionale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.Posizioni;
import com.synclab.demoapp.gestionale.model.Prodotti;
import com.synclab.demoapp.gestionale.repository.MagazzinoRepository;
import com.synclab.demoapp.gestionale.repository.PosizioniRepository;

@Service
public class MagazzinoService {
	
	@Autowired
	private MagazzinoRepository magazzinoRepository;
	
	@Autowired
	private PosizioniRepository posizioniRepository;

	public Magazzino findByProdotto(Prodotti prodotto) {
		return magazzinoRepository.findByProdotto(prodotto);
	}
	
	public List<Magazzino> findByPosizione(String posizione){
		return magazzinoRepository.findByPosizione(posizione);
	}
	
	public void saveMagazzino(Magazzino mag) {
		Posizioni posizione = posizioniRepository.findByNomePosizione("MAGAZZINO_1");
		mag.setPosizione(posizione);
		magazzinoRepository.save(mag);
	}
	
	public void sottrazioneMagazzino(Prodotti prodotto, Integer quantita) {
		Magazzino mag = magazzinoRepository.findByProdotto(prodotto);
		Integer disponibilita = mag.getDisponibilita() - quantita;
		mag.setDisponibilita(disponibilita);

		magazzinoRepository.save(mag);
	}
	
	public void aggiuntaMagazzino(Prodotti prodotto, Integer quantita) {
		Magazzino mag = magazzinoRepository.findByProdotto(prodotto);
		Integer disponibilita = mag.getDisponibilita() + quantita;
		mag.setDisponibilita(disponibilita);

		magazzinoRepository.save(mag);
	}
	
	public void deleteMagazzino(Prodotti prodotto) {
		Magazzino mag = magazzinoRepository.findByProdotto(prodotto);
		
		magazzinoRepository.delete(mag);
	}

}
