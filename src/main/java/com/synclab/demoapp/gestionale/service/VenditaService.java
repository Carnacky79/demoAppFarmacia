package com.synclab.demoapp.gestionale.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.User;
import com.synclab.demoapp.gestionale.model.Vendita;
import com.synclab.demoapp.gestionale.repository.VenditaRepository;

@Service
public class VenditaService {

	@Autowired
	VenditaRepository venditaRepository;
	
	public List<Vendita> findByDataVendita(Date dataVendita) {
		return venditaRepository.findByDataVendita(dataVendita);
	}
	
	public List<Vendita> findByUser(User user) {
		return venditaRepository.findByUser(user);
	}
	
	public List<Vendita> findByProdotto(Magazzino prodotto) {
		return venditaRepository.findByProdotto(prodotto);
	}
	
	public void saveVendita(Vendita vendita) {
		venditaRepository.save(vendita);
	}
	
	public void deleteVendita(Vendita vendita) {
		venditaRepository.delete(vendita);
	}
}
