package com.synclab.demoapp.gestionale.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.ManyToOne;
import lombok.Data;

@Data
@Document(collection = "prodottiQuantitaPrezzo")
public class ProdottiQuantitaPrezzo {
	
	@Id
	private Integer  id;
	
	private Integer quantita;
	
	private BigDecimal prezzoTotale;
		
	@ManyToOne(mappedBy = "magazzinoProdottiQuantitaPrezzo")
	private MovimentoMagazzino movimento;
	
	@ManyToOne(mappedBy = "prodottoQuantitaPrezzo")
	private Prodotti prodotto;

}
