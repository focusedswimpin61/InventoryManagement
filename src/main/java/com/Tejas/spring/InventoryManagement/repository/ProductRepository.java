package com.Tejas.spring.InventoryManagement.repository;

import com.Tejas.spring.InventoryManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional custom queries can be defined here if needed.
}
