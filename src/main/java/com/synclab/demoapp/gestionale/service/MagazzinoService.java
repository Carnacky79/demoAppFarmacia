package com.synclab.demoapp.gestionale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synclab.demoapp.gestionale.repository.MagazzinoRepository;

@Service
public class MagazzinoService {
	
	@Autowired
	private MagazzinoRepository magazzinoRepository;



}
