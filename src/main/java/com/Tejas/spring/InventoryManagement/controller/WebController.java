package com.Tejas.spring.InventoryManagement.controller;

import com.Tejas.spring.InventoryManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String getProductsPage(Model model) {
        // Log the products list to help troubleshooting
        System.out.println("Products: " + productService.getAllProducts());

        model.addAttribute("products", productService.getAllProducts());
        return "products"; // This must match the template name: products.html
    }
}
