package com.synclab.demoapp.gestionale.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.synclab.demoapp.gestionale.model.Role;
import com.synclab.demoapp.gestionale.model.User;

public interface UserRepository extends MongoRepository<User, String>	{
	
	User findByEmail(String email);
	
	List<User> findByRole(Role role);
	
	List<User> findByEnabled(Boolean enabled);
}
