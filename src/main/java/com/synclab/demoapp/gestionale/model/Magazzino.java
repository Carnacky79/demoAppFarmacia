package com.synclab.demoapp.gestionale.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "magazzino")
public class Magazzino {
	
	@Id
	private String id;
	
	private String nomeMagazzino;

	private Set<Prodotti> prodotti;
}
