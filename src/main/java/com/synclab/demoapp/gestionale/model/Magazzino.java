package com.synclab.demoapp.gestionale.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "magazzino")
public class Magazzino {
	
	@Id
	private String id;
	
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String codiceProdotto;
	
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	private String nomeProdotto;
	
	private int disponibilita;
	
	private float prezzoAcquisto;
	
	private float prezzoVendita;
	
	@DBRef
	private Posizioni posizione;
	
}
