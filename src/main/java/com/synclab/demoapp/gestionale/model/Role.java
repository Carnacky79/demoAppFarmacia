package com.synclab.demoapp.gestionale.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "role")
public class Role {
	
	@Id
	private String id;
	@Indexed(unique = true, direction = IndexDirection.DESCENDING)
	
	private String role;
	
	private List<User> user;
	
}
