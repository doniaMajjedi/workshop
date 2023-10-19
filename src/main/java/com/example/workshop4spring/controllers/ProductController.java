package com.example.workshop4spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.workshop4spring.models.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private static List<Product> products = new ArrayList<Product>();
    private static Long idCount = 0L;

    static {
        products.add(new Product(++idCount, "SS-S9", "Samsung Galaxy S9", 500D, 50, "samsung-s9.png"));
        products.add(new Product(++idCount, "NK-5P", "Nokia 5.1 Plus", 60D, 60, null));
        products.add(new Product(++idCount, "IP-7", "iPhone 7", 600D, 30, "iphone-7.png"));
    }

    @GetMapping({"/", "/products"})
    public String listProducts(Model model) {
        model.addAttribute("products", products);
        return "list";
    }
}