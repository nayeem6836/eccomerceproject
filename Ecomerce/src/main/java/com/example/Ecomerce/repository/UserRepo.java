package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecomerce.entity.User;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}