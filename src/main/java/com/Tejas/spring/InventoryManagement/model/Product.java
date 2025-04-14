package com.Tejas.spring.InventoryManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    @Column(nullable = false)
    private String name;

    @Min(value = 0, message = "Quantity must be non-negative")
    private int quantity;

    @Min(value = 0, message = "Price must be non-negative")
    private double price;

    // ADD THE SUPPLIER FIELD TO COMPLETE THE BIDIRECTIONAL MAPPING
    @ManyToOne
    @JoinColumn(name = "supplier_id") // This creates a foreign key column in Product table.
    private Supplier supplier;

    // Constructors
    public Product() {
    }

    public Product(String name, int quantity, double price, Supplier supplier) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
