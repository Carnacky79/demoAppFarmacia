package com.synclab.demoapp.gestionale.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {

	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String email;
	private String password;
	private String nome;
	private Boolean enabled;
	
	private Role role;

	private List<MovimentoMagazzino> movimentiMagazzino;
}
