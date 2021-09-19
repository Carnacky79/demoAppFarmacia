package com.synclab.demoapp.gestionale.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	
	Role findByRole(String role);

}
