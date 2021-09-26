package com.synclab.demoapp.gestionale.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.FetchType;
import io.github.kaiso.relmongo.annotation.JoinProperty;
import io.github.kaiso.relmongo.annotation.OneToMany;
import lombok.Data;

@Data
@Document(collection = "role")
public class Role {
	
	@Id
	private Integer id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String role;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinProperty(name = "users")
	private List<User> user;
	
}
