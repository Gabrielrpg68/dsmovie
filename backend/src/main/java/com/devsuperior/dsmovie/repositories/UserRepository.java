package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>  {
	
	Users findByEmail(String email);
	
}
