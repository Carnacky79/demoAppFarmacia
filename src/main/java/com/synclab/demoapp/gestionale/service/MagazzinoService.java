package com.synclab.demoapp.gestionale.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.Posizioni;
import com.synclab.demoapp.gestionale.repository.MagazzinoRepository;
import com.synclab.demoapp.gestionale.repository.PosizioniRepository;

@Service
public class MagazzinoService {
	
	@Autowired
	private MagazzinoRepository magazzinoRepository;
	
	@Autowired
	private PosizioniRepository posizioniRepository;
	
	public Magazzino findByCodiceProdotto(String codiceProdotto) {
		return magazzinoRepository.findByCodiceProdotto(codiceProdotto);
	}
	
	public Magazzino findByNomeProdotto(String nomeProdotto) {
		return magazzinoRepository.findByNomeProdotto(nomeProdotto);
	}
	
	public List<Magazzino> findByPosizione(String posizione){
		return magazzinoRepository.findByPosizione(posizione);
	}
	
	public void saveMagazzino(Magazzino mag) {
		Posizioni posizione = posizioniRepository.findByNomePosizione("MAGAZZINO_1");
		mag.setPosizione(posizione);
		magazzinoRepository.save(mag);
	}
	
	public void updateMagazzino(String codiceProdotto, String nomeProdotto, Integer disponibilita, String posizione, BigDecimal prezzoVendita, BigDecimal prezzoAcquisto) {
		Magazzino mag = magazzinoRepository.findByCodiceProdotto(codiceProdotto);
		Posizioni pos = posizioniRepository.findByNomePosizione(posizione);
		mag.setNomeProdotto(nomeProdotto);
		mag.setDisponibilita(disponibilita);
		mag.setPosizione(pos);
		mag.setPrezzoVendita(prezzoVendita);
		mag.setPrezzoAcquisto(prezzoAcquisto);
		
		magazzinoRepository.save(mag);
	}
	
	public void deleteMagazzino(String codiceProdotto) {
		Magazzino mag = magazzinoRepository.findByCodiceProdotto(codiceProdotto);
		
		magazzinoRepository.delete(mag);
	}

}
