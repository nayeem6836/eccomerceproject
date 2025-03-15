package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecomerce.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {
}