package com.synclab.demoapp.gestionale.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.FetchType;
import io.github.kaiso.relmongo.annotation.JoinProperty;
import io.github.kaiso.relmongo.annotation.ManyToOne;
import io.github.kaiso.relmongo.annotation.OneToMany;
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
	private boolean enabled;
	
	@ManyToOne(mappedBy="users")
	private Role role;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinProperty(name = "movimenti")
	private List<MovimentoMagazzino> movimentiMagazzino;
	
}
