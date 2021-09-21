package com.synclab.demoapp.gestionale.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "posizioni")
public class Posizioni {
	
	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String nomePosizione;
	
}
