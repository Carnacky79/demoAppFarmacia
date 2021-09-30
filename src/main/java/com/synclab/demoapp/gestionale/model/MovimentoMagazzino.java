package com.synclab.demoapp.gestionale.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "movimentiMagazzino")
public class MovimentoMagazzino {
	
	@Id
	private String  id;
	
	@Indexed(unique = true, direction = IndexDirection.ASCENDING)
	private Date dataMovimento;
	
	private String tipoMovimento;
	
	private Integer quantitaTotale;
	
	private BigDecimal prezzoTotale;
	
	private User user;
	
	private List<ProdottiQuantitaPrezzo> prodottiQuantitaPrezzo;
	
}
