package com.synclab.demoapp.gestionale.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "movimento_magazzino")
public class MovimentoMagazzino {
	
	@Id
	private Integer  id;
	
	@Indexed(unique = true, direction = IndexDirection.ASCENDING)
	private Date dataMovimento;
	
	private String tipoMovimento;
	
	private Integer quantitaMovimento;
	
	@DBRef
	private User user;
	
	@DBRef
	private Prodotti  prodotto;	
	
}
