package com.synclab.demoapp.gestionale.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.model.Magazzino;
import com.synclab.demoapp.gestionale.model.MovimentoMagazzino;
import com.synclab.demoapp.gestionale.model.User;
import com.synclab.demoapp.gestionale.repository.MovimentoMagazzinoRepository;

@Service
public class MovimentoMagazzinoService {

	@Autowired
	MovimentoMagazzinoRepository movimentoMagazzinoRepository;
	
	public List<MovimentoMagazzino> findByDataVendita(Date dataMovimento) {
		return movimentoMagazzinoRepository.findByDataVendita(dataMovimento);
	}
	
	public List<MovimentoMagazzino> findByUser(User user) {
		return movimentoMagazzinoRepository.findByUser(user);
	}
	
	public List<MovimentoMagazzino> findByProdotto(Magazzino prodotto) {
		return movimentoMagazzinoRepository.findByProdotto(prodotto);
	}
	
	public void saveMovimento(MovimentoMagazzino movimento) {
		movimentoMagazzinoRepository.save(movimento);
	}
	
	public void deleteMovimento(MovimentoMagazzino movimento) {
		movimentoMagazzinoRepository.delete(movimento);
	}
}
