package com.synclab.demoapp.gestionale.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "prodotti")
public class Prodotti {
	
		@Id
		private Integer id;
		
		@Indexed(unique = true, direction = IndexDirection.DESCENDING)
		private String nomeProdotto;
		
		@Indexed(unique = true, direction = IndexDirection.DESCENDING)
		private String codiceProdotto;
		
		private BigDecimal prezzoAcquisto;
		
		private BigDecimal prezzoVendita;
}
