package com.synclab.demoapp.gestionale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.synclab.demoapp.gestionale.model.Role;
import com.synclab.demoapp.gestionale.repository.RoleRepository;
import com.synclab.demoapp.gestionale.repository.UserRepository;

@SpringBootApplication
public class GestionaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionaleApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository) {

		return args -> {
			
			Role superAdminRole = roleRepository.findByRole("SUPERADMIN");
			if (superAdminRole == null) {
				Role newSuperAdminRole = new Role();
				newSuperAdminRole.setRole("SUPERADMIN");
				roleRepository.save(newSuperAdminRole);
			}

			Role adminRole = roleRepository.findByRole("ADMIN");
			if (adminRole == null) {
				Role newAdminRole = new Role();
				newAdminRole.setRole("ADMIN");
				roleRepository.save(newAdminRole);
			}

			Role userRole = roleRepository.findByRole("USER");
			if (userRole == null) {
				Role newUserRole = new Role();
				newUserRole.setRole("USER");
				roleRepository.save(newUserRole);
			}
		};

	}

}
