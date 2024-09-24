package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);
	
}
