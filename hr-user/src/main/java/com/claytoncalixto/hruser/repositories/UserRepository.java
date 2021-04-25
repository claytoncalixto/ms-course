package com.claytoncalixto.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncalixto.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
