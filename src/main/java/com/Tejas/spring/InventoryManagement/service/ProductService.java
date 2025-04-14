package com.Tejas.spring.InventoryManagement.service;

import com.Tejas.spring.InventoryManagement.model.Product;
import com.Tejas.spring.InventoryManagement.repository.ProductRepository;
import com.Tejas.spring.InventoryManagement.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        logger.info("Fetching all products");
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        logger.info("Fetching product with id {}", id);
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id " + id));
    }

    public Product createProduct(Product product) {
        logger.info("Creating product: {}", product.getName());
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        logger.info("Updating product with id {}", id);
        Product product = getProductById(id);
        product.setName(productDetails.getName());
        product.setQuantity(productDetails.getQuantity());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        logger.info("Deleting product with id {}", id);
        Product product = getProductById(id);
        productRepository.delete(product);
    }
}
