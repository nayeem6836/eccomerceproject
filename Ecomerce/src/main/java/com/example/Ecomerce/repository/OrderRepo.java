package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecomerce.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
    
}