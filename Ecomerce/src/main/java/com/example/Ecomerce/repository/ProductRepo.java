package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecomerce.entity.Product;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}