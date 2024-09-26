package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
