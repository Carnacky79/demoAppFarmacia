package com.synclab.demoapp.gestionale.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "vendita")
public class Vendita {
	
	@Id
	private String id;
	
	@Indexed(unique = true, direction = IndexDirection.ASCENDING)
	private Date dataVendita;
	
	private int quantitaVenduta;
	
	private float prezzoTotVendita;
	
	private float prezzoTotAcquisto;
	
	@DBRef
	private User user;
	
	@DBRef
	private Magazzino prodotto;	
	
}
