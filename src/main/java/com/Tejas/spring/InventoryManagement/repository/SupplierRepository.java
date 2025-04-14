package com.Tejas.spring.InventoryManagement.repository;

import com.Tejas.spring.InventoryManagement.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {}
