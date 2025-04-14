package com.Tejas.spring.InventoryManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api/demo")
    public String demoEndpoint() {
        return "Hello, Swagger is working!";
    }
}
