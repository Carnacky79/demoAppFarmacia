package com.synclab.demoapp.gestionale.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "magazzino")
public class Magazzino {
	
	@Id
	private Integer id;
	
	private Integer disponibilita;

	@DBRef
	private Prodotti prodotto;
	
	@DBRef
	private Posizioni posizione;
	
}
