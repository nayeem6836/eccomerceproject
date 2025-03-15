package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecomerce.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}