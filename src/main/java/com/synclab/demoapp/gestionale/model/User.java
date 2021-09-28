package com.synclab.demoapp.gestionale.model;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class User {

	@Id
	private Integer id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String email;
	private String password;
	private String nome;
	private Boolean enabled;
	
	@DBRef
	private Set<Role> roles;

	@DBRef
	private List<MovimentoMagazzino> movimentiMagazzino;
}
