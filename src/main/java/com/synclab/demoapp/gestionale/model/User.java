package com.synclab.demoapp.gestionale.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@Document(collection = "user")
public class User {

	@Id
	private Integer id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String email;
	private String password;
	private String nome;
	private boolean enabled;
	
	@DBRef
	private Set<Role> roles;
	
}
