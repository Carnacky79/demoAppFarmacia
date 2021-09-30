package com.synclab.demoapp.gestionale.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "prodottiQuantitaPrezzo")
public class ProdottiQuantitaPrezzo {
	
	@Id
	private String  id;
	
	private Integer quantita;
	
	private BigDecimal prezzoTotale;
		
	private Prodotti prodotto;
	
	private Magazzino magazzino;
	
	private Integer id_movimento;

}
