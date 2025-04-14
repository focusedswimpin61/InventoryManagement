package com.Tejas.spring.InventoryManagement.service;

import com.Tejas.spring.InventoryManagement.model.Supplier;
import com.Tejas.spring.InventoryManagement.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    // Add more methods as needed (get by ID, update, delete)
}
